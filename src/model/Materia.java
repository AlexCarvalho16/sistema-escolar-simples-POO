package model;

public class Materia {
	private String nome;
	private Professor professor;
	
	public Materia(String nome) {
		this.nome = nome;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
		professor.setMateria(this);
	}
	
	public String getNome() {
		return nome;
	}
	
	public Professor getProfessor() {
		return professor;
	}
}
