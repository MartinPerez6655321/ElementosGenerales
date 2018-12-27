package Entidades;

public class Curso {
	
	//Atributos de un Curso
	
	private Integer idCurso;
	private String anioCurso;
	private String turnoCurso;
	
	//Constructor de Curso
	
	public Curso (Integer id, String anio, String turno) {
		idCurso = id;
		anioCurso = anio;
		turnoCurso = turno;
	}

	//Getters & Setters de Curso
	
	public String getAnioCurso() {
		return anioCurso;
	}

	public void setAnioCurso(String anioCurso) {
		this.anioCurso = anioCurso;
	}

	public String getTurnoCurso() {
		return turnoCurso;
	}

	public void setTurnoCurso(String turnoCurso) {
		this.turnoCurso = turnoCurso;
	}

	public Integer getIdCurso() {
		return idCurso;
	}

	
	
}
