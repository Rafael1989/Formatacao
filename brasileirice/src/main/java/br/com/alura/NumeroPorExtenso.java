package br.com.alura;

import java.math.BigDecimal;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class NumeroPorExtenso {
	
	public static void main(String[] args) {
		//NumericToWordsConverter conversor = new NumericToWordsConverter(new InteiroSemFormato());
		NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
		BigDecimal valor = new BigDecimal("75.00");
		String valorPorExtenso = conversor.toWords(valor.doubleValue());
		System.out.println(valorPorExtenso);
		BigDecimal valor2 = new BigDecimal("75.99");
		String valorPorExtenso2 = conversor.toWords(valor2.doubleValue());
		System.out.println(valorPorExtenso2);
		BigDecimal valor3 = new BigDecimal("1");
		String valorPorExtenso3 = conversor.toWords(valor3.doubleValue());
		System.out.println(valorPorExtenso3);
	}

}
