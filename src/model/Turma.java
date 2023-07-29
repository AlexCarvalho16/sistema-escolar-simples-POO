package model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private String nome;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private List<Materia> materias = new ArrayList<Materia>();
	
	public Turma(String nome) {
		this.nome = nome;
	}
	
	public void cadastrarAlunos(Aluno aluno) {
		alunos.add(aluno);
		aluno.setTurma(this);
	}
	
	public void cadastrarMaterias(Materia materia) {
		materias.add(materia);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public List<Aluno> getListaAlunos() {
		return this.alunos;
	}
	
	public List<Materia> getMaterias() {
		return this.materias;
	}
}
