package Entidades;

import java.util.Date;

public class Alumno {

	//atributos de Alumno
	
	private Integer idAlumno;
	private String dniAlumno;
	private Date fechaNacimientoAlumno;
	private String nombreAlumno;
	private String apellidoAlumno;
	private String responsableAlumno;
	private String cursoAlumno;
	private String telefonoAlumno;
	
	//Constructor de Alumno
	
	public Alumno(Integer id, String DNI, Date fechaNacimiento,
			String nombre, String apellido, String responsable, String curso, 
			String telefono) {
	idAlumno=id;
	dniAlumno=DNI;
	fechaNacimientoAlumno = fechaNacimiento;
	nombreAlumno = nombre;
	apellidoAlumno = apellido;
	responsableAlumno = responsable;
	cursoAlumno = curso;
	telefonoAlumno = telefono;
	}
	
	//Getters & Setters de Alumno
	
	public String getDniAlumno() {
		return dniAlumno;
	}

	public void setDniAlumno(String dniAlumno) {
		this.dniAlumno = dniAlumno;
	}

	public Date getFechaNacimientoAlumno() {
		return fechaNacimientoAlumno;
	}

	public void setFechaNacimientoAlumno(Date fechaNacimientoAlumno) {
		this.fechaNacimientoAlumno = fechaNacimientoAlumno;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getApellidoAlumno() {
		return apellidoAlumno;
	}

	public void setApellidoAlumno(String apellidoAlumno) {
		this.apellidoAlumno = apellidoAlumno;
	}

	public String getResponsableAlumno() {
		return responsableAlumno;
	}

	public void setResponsableAlumno(String responsableAlumno) {
		this.responsableAlumno = responsableAlumno;
	}

	public String getCursoAlumno() {
		return cursoAlumno;
	}

	public void setCursoAlumno(String cursoAlumno) {
		this.cursoAlumno = cursoAlumno;
	}

	public String getTelefonoAlumno() {
		return telefonoAlumno;
	}

	public void setTelefonoAlumno(String telefonoAlumno) {
		this.telefonoAlumno = telefonoAlumno;
	}

	public Integer getIdAlumno() {
		return idAlumno;
	}

}
