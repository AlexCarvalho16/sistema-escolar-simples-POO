package model;

import java.util.Random;

public abstract class Pessoa {
	protected String nome;
	protected String sobreNome;
	protected String email;
	protected Long cadastro;
	
	protected void cadastrar(){
		this.cadastro = new Random().nextLong();
	}
}
