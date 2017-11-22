package br.com.alura;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDocumento {
	public static void main(String[] args) {
		System.out.println(desformatarDocumentos(new CPFFormatter(), "862.883.667-57"));
		System.out.println(desformatarDocumentos(new CNPJFormatter(), "98.610.832/0001-24"));
		System.out.println(formatarDocumentos(new TituloEleitoralFormatter(), "417453530116"));
		
		
	}
	
	public static String formatarDocumentos(Formatter formatador, String documento) {
		return formatador.format(documento);
	}
	
	public static String desformatarDocumentos(Formatter formatador, String documento) {
		return formatador.unformat(documento);
	}
}
