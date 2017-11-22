package br.com.alura;

import java.math.BigDecimal;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class NumeroPorExtensoMetodo {
	
	public static void main(String[] args) {
		System.out.println(toExtensiveNumber(new BigDecimal(1)));
	}
	
	public static String toExtensiveNumber(BigDecimal numero) {
		return new NumericToWordsConverter(new FormatoDeReal()).toWords(numero.doubleValue());
	}

}
