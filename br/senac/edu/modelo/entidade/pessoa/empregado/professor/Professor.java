package br.senac.edu.modelo.entidade.pessoa.empregado.professor;

import br.senac.edu.modelo.entidade.pessoa.empregado.Empregado;
import br.senac.edu.modelo.enumeracao.gestor.Status;
import br.senac.edu.modelo.excecao.pessoa.CpfInvalidoException;
import br.senac.edu.modelo.excecao.pessoa.IdadeInvalidaException;
import br.senac.edu.modelo.excecao.pessoa.NomeInvalidoException;

public class Professor extends Empregado{
		
	private String nome; 
	private byte idade; 
	private String cpf; 
	private String turma; 
	
	public Professor(String nome, byte idade, String cpf, String ctps, float valorHora, String  turma, Status status)  throws NomeInvalidoException, IdadeInvalidaException, CpfInvalidoException{
		
		super( turma, idade, cpf, ctps, valorHora, status);
		setNome(nome);
		setIdade(idade);
		setCpf(cpf);
		setTurma( turma);
	}
	
	public String getNome() {
	return nome;
	}

	public byte getIdade() {
	return  idade;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getMateria() {
		return turma;
	}

	public void setNome(String nome) {
	this.nome = nome;
	}

	public void setIdade(byte idade) {
	this.idade = idade;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	public void fazerChamada() {
		System.out.println("Olha a chamada!");
	}
	
	public float calcularSalario() {

		return 1500;
	}
}
