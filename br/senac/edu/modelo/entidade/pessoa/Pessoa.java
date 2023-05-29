package br.senac.edu.modelo.entidade.pessoa;

import br.senac.edu.modelo.excecao.pessoa.CpfInvalidoException;
import br.senac.edu.modelo.excecao.pessoa.IdadeInvalidaException;
import br.senac.edu.modelo.excecao.pessoa.NomeInvalidoException;

public class Pessoa {
	
	private String nome;
	private byte idade; 
	private String cpf;
	
    protected Pessoa(String nome, byte idade, String cpf) throws IdadeInvalidaException, NomeInvalidoException, CpfInvalidoException {
    	super();
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws NomeInvalidoException {
    	
    	if (nome.isBlank() || nome.length() < 3)
    		throw new NomeInvalidoException("O nome "+nome+ " é invalido.");
    	
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) throws IdadeInvalidaException {
    	
    	if (idade < 1) 
    		throw new IdadeInvalidaException("A idade "+idade+ " é  invalida.");
    		
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws CpfInvalidoException {
    	
    	if (cpf.isBlank() || cpf.length() != 11 && cpf.length() != 14)
    		throw new CpfInvalidoException("O CPF "  +cpf+ " é invalido.");
    	
        this.cpf = cpf;
    }
	
}
