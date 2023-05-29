package br.senac.edu.modelo.entidade.pessoa.aluno;

import br.senac.edu.modelo.entidade.pessoa.Pessoa;
import br.senac.edu.modelo.entidade.turma.Turma;
import br.senac.edu.modelo.enumeracao.aluno.Status;
import br.senac.edu.modelo.excecao.pessoa.CpfInvalidoException;
import br.senac.edu.modelo.excecao.pessoa.IdadeInvalidaException;
import br.senac.edu.modelo.excecao.pessoa.NomeInvalidoException;

public class Aluno extends Pessoa {
	
	
	private Turma turma;
	private String matricula; 
	private Status status;
	
	
    protected Aluno(String nome, byte idade, String cpf, Turma turma, String matricula)  throws NomeInvalidoException, IdadeInvalidaException, CpfInvalidoException {
        super(nome, idade, cpf);
		setTurma(turma);
        setMatricula(matricula);
        setStatus(Status.MATRICULADO);
	}

    protected Aluno(String nome, byte idade, String cpf, Turma turma, String matricula, Status status)  throws NomeInvalidoException, IdadeInvalidaException, CpfInvalidoException{
        super(nome, idade, cpf);
		setTurma(turma);
        setMatricula(matricula);
        setStatus(status);
	}

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

	public void responderChamada() {
	System.out.println("Presente!");
	
	}

}
