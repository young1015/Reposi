package br.senac.edu.modelo.entidade.turma;

import br.senac.edu.modelo.entidade.pessoa.aluno.Aluno;
import br.senac.edu.modelo.entidade.pessoa.empregado.professor.Professor;

public class Turma {
	
	
	private String nome;
	private byte cargaHoraria;
	private Professor professor; 
	private Aluno[] alunos;
	private byte quantidadeAlunosMatriculados = 0; 
	
	public Turma(String nome, byte cargaHoraria, byte tamanho) {
		setNome(nome);
		setCargaHoraria(cargaHoraria);
		alunos = new Aluno[tamanho];
		quantidadeAlunosMatriculados = 0;
	}
	
	public Turma(String nome, byte cargaHoraria, Professor professor, byte tamanho) {
		setNome(nome);
		setCargaHoraria(cargaHoraria);
		setProfessor(professor);
		alunos = new Aluno[tamanho];
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public byte getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(byte cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Aluno[] getAlunos() {
		return alunos;
	}
	
	public boolean inserirAluno(Aluno aluno) {
		
		if (quantidadeAlunosMatriculados == alunos.length)
			return false;
		
		alunos[quantidadeAlunosMatriculados] = aluno;
		quantidadeAlunosMatriculados++;
		return true;
	}
	
	public boolean removerAluno(String cpf) {
		
		if (quantidadeAlunosMatriculados == 0)
			return false;
		
		for (int i = 0; i < alunos.length; i++) {
			
			if (alunos[i].getCpf() .equals(cpf) && alunos[i] != null) {
				alunos[i] = null;
				quantidadeAlunosMatriculados--;
			}
		}
			
		
		
		return false;
	}
	
	public void recuperarAluno(String cpf) {
		
	}	
	
	private Aluno[] realocarAlunos(Aluno[] alunos) {
		
		Aluno[] alunosRealocados = new Aluno[alunos.length]; 
		
		int indice = 0; 
		
		for (int i = 0; i < alunos.length; i++) {
			
			if (alunos[i] != null) {
				
				alunosRealocados[indice] = alunos[i];
				indice++;
			}
		}
		
		return null;
	}
	
	
}
