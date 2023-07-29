package testes;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import model.Livro;
import model.Materia;
import model.Professor;
import model.Turma;

public class Teste {
	public static void main(String[] args) {
		try {
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Professor> professores = new ArrayList<Professor>();
		List<Materia> materias = new ArrayList<Materia>();
		List<Turma> turmas = new ArrayList<Turma>();
		List<Livro> livros = new ArrayList<Livro>();
		
		// Criando livros
		livros.add(new Livro("Hobbit", "J.R.R Tolkien"));
		livros.add(new Livro("Clean Code", "Robert Cecil Martin"));
		
		// Criando alunos
		alunos.add(new Aluno("Gabriel", "Barbosa", "gabriel_barbosa@hotmail.com"));
		alunos.add(new Aluno("Bruno", "Henrique", "bruno_henrique@gmail.com"));
		alunos.add(new Aluno("Everton", "Ribeiro", "everton_ribeiro@hotmail.com"));
		alunos.add(new Aluno("Thiago", "Maia", "thiago_maia@hotmail.com"));
		alunos.add(new Aluno("Filipe", "Luis", "filipe_lui@outlook.com"));
		alunos.add(new Aluno("Davi", "Luiz", "davi_luiz@hotmail.com"));
		alunos.add(new Aluno("Léo", "Pereira", "leo_pereira@gmail.com"));
		
		// Criando professores
		professores.add(new Professor("Vanderlei", "Luxenburgo", "vanderlei.luxa@hotmail.com", "Licenciatura em matemática"));
		professores.add(new Professor("Jorge", "Jesus", "jorge.jeez@gmail.com"));
		
		// Criando matéria
		materias.add(new Materia("Matemática"));
		materias.add(new Materia("Português"));
		materias.add(new Materia("Física"));
		
		// Adicionando matérias recebendo professor
		materias.get(0).setProfessor(professores.get(0));
		materias.get(2).setProfessor(professores.get(0));
		materias.get(1).setProfessor(professores.get(1));
		
		// Criando turmas
		turmas.add(new Turma("1º A"));
		turmas.add(new Turma("1º B"));
		
		// Cadastrar materias e alunos nas turmas
		int controle = 0;
		for (Aluno aluno : alunos) {
			if(controle%2 == 0) {
				turmas.get(0).cadastrarAlunos(aluno);
			}
			else {
				turmas.get(1).cadastrarAlunos(aluno);
			}
			controle++;
		}
		
		for (Materia materia : materias) {
			turmas.get(0).cadastrarMaterias(materia);
			turmas.get(1).cadastrarMaterias(materia);
		}
		
		// Acessando matérias, alunos e professores cadastrados nas turmas.
		
		for (Turma turma : turmas) {
			System.out.println("Nome da turma: " + turma.getNome());
			System.out.println("Alunos matriculados:");
			for (Aluno aluno : turma.getListaAlunos()) {
				System.out.println(" - " + aluno.getNome() + " " + aluno.getSobrenome());
			}
			System.out.println("Matérias cadastradas:");
			for (Materia materia : turma.getMaterias()) {
				System.out.println(" - " + materia.getNome() + " com o professor: " + materia.getProfessor().getNome());
			}
			
			System.out.println("\n");
		}
		
		// Pegando livro emprestado
		alunos.get(0).pegarLivroEmprestado(livros.get(0));
		
		System.out.println("Alunos que pegaram livros emprestados: ");
		for (Livro livro : livros) {
			System.out.println("Livro: '"+ livro.getNome() + "' emprestado para " + livro.getAluno());
		}
	}
}
