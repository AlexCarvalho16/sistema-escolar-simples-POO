package model;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
	private List<String> formacoes = new ArrayList<String>();
	private List<Materia> materias = new ArrayList<Materia>();
	
	public Professor(String nome, String sobreNome, String email) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.email = email;
		
		cadastrar();
	}
	
	public Professor(String nome, String sobreNome, String email, String formacao) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.email = email;
		
		cadastrar();
		setFormacao(formacao);
	}
	
	public void setFormacao(String formacao) {
		this.formacoes.add(formacao);
	}
	
	public void setMateria(Materia materia) {
		this.materias.add(materia);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getNomeCompleto() {
		return nome + " " + sobreNome;
	}
}
