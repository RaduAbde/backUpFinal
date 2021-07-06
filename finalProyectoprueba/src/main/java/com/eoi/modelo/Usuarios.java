package com.eoi.modelo;
public class Usuarios {
	private int UsuId;
	private String UsuNombre;
	private String UsuApellido;
	private int UsuNacimiento;
	private int UsuAlta;
	private String UsuMail;
	private String UsuPass;
	private String UsuRol;
	private String UsuCiudad;
	private String UsuDNI;

	public Usuarios() {
		super();

	}
	public Usuarios(int usuId, String usuNombre, String usuApellido, int usuNacimiento, int usuAlta, String usuMail,
			String usuPass, String usuRol, String usuCiudad, String usuDNI) {
		super();
		UsuId = usuId;
		UsuNombre = usuNombre;
		UsuApellido = usuApellido;
		UsuNacimiento = usuNacimiento;
		UsuAlta = usuAlta;
		UsuMail = usuMail;
		UsuPass = usuPass;
		UsuRol = usuRol;
		UsuCiudad = usuCiudad;
		UsuDNI = usuDNI;
	}
	public int getUsuId() {
		return UsuId;
	}
	public void setUsuId(int usuId) {
		UsuId = usuId;
	}
	public String getUsuNombre() {
		return UsuNombre;
	}
	public void setUsuNombre(String usuNombre) {
		UsuNombre = usuNombre;
	}
	public String getUsuApellido() {
		return UsuApellido;
	}
	public void setUsuApellido(String usuApellido) {
		UsuApellido = usuApellido;
	}
	public int getUsuNacimiento() {
		return UsuNacimiento;
	}
	public void setUsuNacimiento(int usuNacimiento) {
		UsuNacimiento = usuNacimiento;
	}
	public int getUsuAlta() {
		return UsuAlta;
	}
	public void setUsuAlta(int usuAlta) {
		UsuAlta = usuAlta;
	}
	public String getUsuMail() {
		return UsuMail;
	}
	public void setUsuMail(String usuMail) {
		UsuMail = usuMail;
	}
	public String getUsuPass() {
		return UsuPass;
	}
	public void setUsuPass(String usuPass) {
		UsuPass = usuPass;
	}
	public String getUsuRol() {
		return UsuRol;
	}
	public void setUsuRol(String usuRol) {
		UsuRol = usuRol;
	}
	public String getUsuCiudad() {
		return UsuCiudad;
	}
	public void setUsuCiudad(String usuCiudad) {
		UsuCiudad = usuCiudad;
	}
	public String getUsuDNI() {
		return UsuDNI;
	}
	public void setUsuDNI(String usuDNI) {
		UsuDNI = usuDNI;
	}
	@Override
	public String toString() {
		return "Usuarios [UsuId=" + UsuId + ", UsuNombre=" + UsuNombre + ", UsuApellido=" + UsuApellido
				+ ", UsuNacimiento=" + UsuNacimiento + ", UsuAlta=" + UsuAlta + ", UsuMail=" + UsuMail + ", UsuPass="
				+ UsuPass + ", UsuRol=" + UsuRol + ", UsuCiudad=" + UsuCiudad + ", UsuDNI=" + UsuDNI + "]";
	}
	
}