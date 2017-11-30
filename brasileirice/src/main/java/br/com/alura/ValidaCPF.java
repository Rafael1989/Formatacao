package br.com.alura;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.NumberValue;

import org.javamoney.moneta.Money;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidaCPF {
	
	public static void main(String[] args) {
		String cpf = "51720155232";
		if(validaCPF(cpf)) {
			CurrencyUnit moeda = Monetary.getCurrency("BRL");
			MonetaryAmount cobranca = Money.of(900, moeda);
			NumberValue cobrancaSemMoeda = cobranca.getNumber();
			NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
			String cobrancaPorExtenso = conversor.toWords(cobrancaSemMoeda.doubleValue());
			System.out.println("A sua fatura do cartão de crédito foi de " + cobrancaPorExtenso + ".");
		}
	}
	
	public static boolean validaCPF(String cpf) {
		CPFValidator validador = new CPFValidator();
		try{
			validador.assertValid(cpf);
			return true;
		}catch(InvalidStateException e) {
			System.out.println("Favor atualizar seu cpf, pois ele está inválido.");
		}
		return false;
	}

}
