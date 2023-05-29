package br.senac.edu;

import br.senac.edu.modelo.entidade.pessoa.empregado.Empregado;
import br.senac.edu.modelo.entidade.pessoa.empregado.diretor.Diretor;
import br.senac.edu.modelo.entidade.pessoa.empregado.professor.Professor;
import br.senac.edu.modelo.excecao.pessoa.CpfInvalidoException;
import br.senac.edu.modelo.excecao.pessoa.IdadeInvalidaException;
import br.senac.edu.modelo.excecao.pessoa.NomeInvalidoException;

public class Principal {
	
	public static void main(String[] args) {
		
		try {
		
		Empregado[] empregados = new Empregado[3];
	
		empregados[0] = new Professor("João", (byte) 27, "12345678901", "123123", 15f, null,  null);
		empregados[1] = new Professor("Lucas", (byte) 36, "10987654321", "54321", 15f, null,  null);
		empregados[2] = new Diretor("Maria", (byte) 40, "45612378954", "56789", 25f,  null);
		
		System.out.println("Relatório:/n ");
		
		for (Empregado empregado : empregados) {
			
			System.out.println("Nome do empregado: "+empregado.getNome());
			System.out.println("Salário do empregado: "+empregado.calcularSalario());
			System.out.println("");
		}	
			
		}
		
		catch(NomeInvalidoException exception) { 
			
			exception.printStackTrace();
		}
		
		catch(IdadeInvalidaException exception) {
			
			exception.printStackTrace();	
		}
		
		catch(CpfInvalidoException exception) {
			
			exception.printStackTrace();
		}
	}
}