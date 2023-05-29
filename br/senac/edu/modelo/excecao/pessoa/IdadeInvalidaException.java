package br.senac.edu.modelo.excecao.pessoa;

public class IdadeInvalidaException extends Exception {


	private static final long serialVersionUID = 7782340776187113117L;

	public IdadeInvalidaException(String mensagem) {
		super(mensagem);
	}
}
