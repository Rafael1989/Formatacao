package br.com.alura;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidacaoDocumento {
	public static void main(String[] args) {
		String cpf = "55555555555";
		CPFValidator validador = new CPFValidator();
		try {
			validador.assertValid(cpf);
			System.out.println("CPF VÁLIDO");
		}catch(InvalidStateException e) {
			System.out.println("CPF INVÁLIDO : " + e);
		}
		
	}
}
