package br.senac.edu.modelo.excecao.pessoa;

public class CpfInvalidoException extends Exception {


	private static final long serialVersionUID = -7241053648933613428L;

	public CpfInvalidoException(String mensagem) {
		super(mensagem);
		
	}
}
