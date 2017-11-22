package br.com.alura;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.NITValidator;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class ValidacaoDocumento {
	public static void main(String[] args) {
		try {
			validarDocumentos(new CPFValidator(), "222.222.222-22");
			System.out.println("CPF V�LIDO");
		}catch(InvalidStateException e) {
			System.out.println("CPF INV�LIDO : " + e);
		}
		
		try {
			validarDocumentos(new CNPJValidator(), "82588641000173");
			System.out.println("CNPJ V�LIDO");
		}catch(InvalidStateException e) {
			System.out.println("CNPJ INV�LIDO : " + e);
		}
		
		try {
			validarDocumentos(new TituloEleitoralValidator(), "417453530116");
			System.out.println("TITULO V�LIDO");
		}catch(InvalidStateException e) {
			System.out.println("TITULO INV�LIDO : " + e);
		}
		
		try {
			validarDocumentos(new NITValidator(), "585.78029.76-8");
			System.out.println("NIT V�LIDO");
		}catch(InvalidStateException e) {
			System.out.println("N�MERO DE IDENTIFICA��O DO TRABALHADOR : " + e);
		}
		
	}
	
	public static void validarDocumentos(Validator<String> validador,String documento) {
		validador.assertValid(documento);
	}
}
