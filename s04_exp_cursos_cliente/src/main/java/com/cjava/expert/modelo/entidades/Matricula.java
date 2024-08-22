package com.cjava.expert.modelo.entidades;

import java.time.LocalDate;

public class Matricula {
	private Integer id;
	private String vchMatCodigo;
	private String chrAluCodigo;
	private String chrCurCodigo;
	private LocalDate ldFechaMat;
	private LocalDate ldFechaIniCurso;
	private LocalDate ldFechaFinCurso;

	public Matricula() {}

	public Matricula(Integer id, String vchMatCodigo, String chrAluCodigo, String chrCurCodigo, LocalDate ldFechaMat, LocalDate ldFechaIniCurso, LocalDate ldFechaFinCurso) {
		this.id = id;
		this.vchMatCodigo = vchMatCodigo;
		this.chrAluCodigo = chrAluCodigo;
		this.chrCurCodigo = chrCurCodigo;
		this.ldFechaMat = ldFechaMat;
		this.ldFechaIniCurso = ldFechaIniCurso;
		this.ldFechaFinCurso = ldFechaFinCurso;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchMatCodigo() {
		return vchMatCodigo;
	}

	public void setVchMatCodigo(String vchMatCodigo) {
		this.vchMatCodigo = vchMatCodigo;
	}

	public String getChrAluCodigo() {
		return chrAluCodigo;
	}

	public void setChrAluCodigo(String chrAluCodigo) {
		this.chrAluCodigo = chrAluCodigo;
	}

	public String getChrCurCodigo() {
		return chrCurCodigo;
	}

	public void setChrCurCodigo(String chrCurCodigo) {
		this.chrCurCodigo = chrCurCodigo;
	}

	public LocalDate getLdFechaMat() {
		return ldFechaMat;
	}

	public void setLdFechaMat(LocalDate ldFechaMat) {
		this.ldFechaMat = ldFechaMat;
	}

	public LocalDate getLdFechaIniCurso() {
		return ldFechaIniCurso;
	}

	public void setLdFechaIniCurso(LocalDate ldFechaIniCurso) {
		this.ldFechaIniCurso = ldFechaIniCurso;
	}

	public LocalDate getLdFechaFinCurso() {
		return ldFechaFinCurso;
	}

	public void setLdFechaFinCurso(LocalDate ldFechaFinCurso) {
		this.ldFechaFinCurso = ldFechaFinCurso;
	}
}

