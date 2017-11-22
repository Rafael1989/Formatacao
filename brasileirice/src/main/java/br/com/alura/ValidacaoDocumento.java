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
			System.out.println("CPF VÁLIDO");
		}catch(InvalidStateException e) {
			System.out.println("CPF INVÁLIDO : " + e);
		}
		
		try {
			validarDocumentos(new CNPJValidator(), "82588641000173");
			System.out.println("CNPJ VÁLIDO");
		}catch(InvalidStateException e) {
			System.out.println("CNPJ INVÁLIDO : " + e);
		}
		
		try {
			validarDocumentos(new TituloEleitoralValidator(), "417453530116");
			System.out.println("TITULO VÁLIDO");
		}catch(InvalidStateException e) {
			System.out.println("TITULO INVÁLIDO : " + e);
		}
		
		try {
			validarDocumentos(new NITValidator(), "585.78029.76-8");
			System.out.println("NIT VÁLIDO");
		}catch(InvalidStateException e) {
			System.out.println("NÚMERO DE IDENTIFICAÇÃO DO TRABALHADOR : " + e);
		}
		
	}
	
	public static void validarDocumentos(Validator<String> validador,String documento) {
		validador.assertValid(documento);
	}
}
