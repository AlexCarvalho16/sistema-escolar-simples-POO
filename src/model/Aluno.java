package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
	private List<Livro> livros = new ArrayList<Livro>(); 
	private Turma turma;
	
	public Aluno(String nome, String sobreNome, String email) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.email = email;
		
		cadastrar();
	}
	
	public Aluno(String nome, String sobreNome, String email, Turma turma) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.email = email;
		
		cadastrar();
		setTurma(turma);
	}
	
	public void pegarLivroEmprestado(Livro livro) {
		livro.setDataEmprestimo();
		livro.setSituacaoEmprestimo();
		livro.setAluno(this);
		this.livros.add(livro);
	}
	
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getSobrenome() {
		return this.sobreNome;
	}
}
