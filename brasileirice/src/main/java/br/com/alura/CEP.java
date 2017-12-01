package br.com.alura;

import java.io.IOException;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

public class CEP {
	
	public static void main(String[] args) {
		ViaCEPClient cliente = new ViaCEPClient();
		try {
			ViaCEPEndereco endereco = cliente.getEndereco("82010340");
			System.out.println(endereco.getBairro());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
