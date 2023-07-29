package model;

import java.util.Date;

public class Livro {
	private String nome;
	private String autor;
	private Date dataEmprestimo;
	private Aluno aluno;
	private boolean situacaoEmprestimo = false;
	
	public Livro(String nome, String autor) {
		this.nome = nome;
		this.autor = autor;
	}
	
	public void setDataEmprestimo() {
		this.dataEmprestimo = new Date(); 
	}
	
	public void setSituacaoEmprestimo() {
		if(this.situacaoEmprestimo == false) {
			this.situacaoEmprestimo = true;
		}
		else {
			this.situacaoEmprestimo = false;
		}
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public String getAluno() {
		if(this.aluno == null) {
			return "Este livro não está sendo alugado por ninguém";
		}
		else {
			return this.aluno.getNome();
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public boolean getSituacao() {
		return this.situacaoEmprestimo;
	}
}
