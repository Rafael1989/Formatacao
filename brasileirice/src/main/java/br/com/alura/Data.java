package br.com.alura;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Data {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatador));
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		System.out.println(agora.format(formatadorHora));
		DateTimeFormatter formatadorCurto = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(agora.format(formatadorCurto));
		DateTimeFormatter formatadorMedio = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(agora.format(formatadorMedio));
		DateTimeFormatter formatadorMedioChina = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.CHINA);
		System.out.println(agora.format(formatadorMedioChina));
		DateTimeFormatter formatadorMedioBrasil = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(new Locale("pt", "br"));
		System.out.println(agora.format(formatadorMedioBrasil));
		System.out.println(agora.minusHours(5));
		System.out.println(agora.plusHours(5));
	}
}
