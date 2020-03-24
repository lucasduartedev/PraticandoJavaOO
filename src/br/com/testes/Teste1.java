package br.com.testes;

import br.com.pratica.Cliente;
import br.com.pratica.Contato;
import br.com.pratica.Endereco;

public class Teste1 {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("123.123.123-45", "Gustavo Gomes");
		Contato contato1 = new Contato("61 3322-3322", "61 97788-4455", "email@email.com");
		Endereco endereco1 = new Endereco("12345-123", "Distrito Federal", "Brasília", "Rua subir pra cima", "12B", "APTO 205");
		
		cliente1.setContato(contato1);
		cliente1.setEndereco(endereco1);
		

		
	}

}
