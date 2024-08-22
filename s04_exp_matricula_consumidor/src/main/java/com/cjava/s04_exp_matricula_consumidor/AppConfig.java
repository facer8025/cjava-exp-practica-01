package com.cjava.s04_exp_matricula_consumidor;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class AppConfig {

	@Bean("matriculaClientRest")
	@LoadBalanced
	public RestTemplate registerRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public Customizer<Resilience4JCircuitBreakerFactory> defaulCustomizer() {
		return factory -> factory.configureDefault(id -> {
			return new Resilience4JConfigBuilder(id)
					.circuitBreakerConfig(
							CircuitBreakerConfig.custom()
									.slidingWindowSize(10)
									.failureRateThreshold(20)
									.waitDurationInOpenState(Duration.ofSeconds(10L))
									.permittedNumberOfCallsInHalfOpenState(5)
									.slowCallRateThreshold(1)
									.slowCallDurationThreshold(Duration.ofSeconds(2L))
									.build()
					)
					.timeLimiterConfig(
							TimeLimiterConfig.custom()
									.timeoutDuration(Duration.ofSeconds(3L)).build())
					.build();
		});
	}

}
