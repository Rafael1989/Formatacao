package br.com.alura;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.ExchangeRateProvider;
import javax.money.convert.MonetaryConversions;

import org.javamoney.moneta.FastMoney;
import org.javamoney.moneta.convert.ExchangeRateType;

public class Cotacao {
	public static void main(String[] args) {
		CurrencyUnit dolar = Monetary.getCurrency("USD");
		CurrencyUnit real = Monetary.getCurrency("BRL");
		
		FastMoney valorProdutoDolar = FastMoney.of(90, dolar);
		FastMoney valorImporstoReal = FastMoney.of(30, real);
		
		ExchangeRateProvider provider = MonetaryConversions.getExchangeRateProvider(ExchangeRateType.ECB);
		
		CurrencyConversion conversaoAtual = provider.getCurrencyConversion(dolar);
		
		MonetaryAmount valorImportoDolar = conversaoAtual.apply(valorImporstoReal);
		
		MonetaryAmount valorFinalProdutoDolar = valorProdutoDolar.add(valorImportoDolar);
		
		System.out.println(valorFinalProdutoDolar);
		
		
	}
}
