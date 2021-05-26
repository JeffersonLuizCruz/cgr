package com.cgr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cgr.entity.Nome;
import com.cgr.services.impl.Cliente;
import com.cgr.services.impl.Gerente;
import com.cgr.services.impl.Robo;

@SpringBootApplication
public class CgrApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CgrApplication.class, args);	
	}
	

	@Override
	public void run(String... args) throws Exception {
		
		Robo robo = new Robo();
		Cliente cliente = new Cliente();
		Gerente gerente = new Gerente();
		
		/**
		 * Atenção: Os objetos abaixo devem ser executado um por vez. 
		 * */

		Nome nome = new Nome(gerente,"Severino de Oliveira Silva", null);
		//Nome nome = new Nome(robo,"Juliana Pires Silva", null);
		//Nome nome = new Nome(cliente,"Jefferson Luiz Cruz", null);
		
		/**
		 * Atenção: Os métodos abaixo devem ser executado um por vez.
		 */
		
		nome.validarPrimeiroNome(); 
		//nome.validarSobreNome();
		//nome.validarParaMaiuscula();
		//nome.validarNomeAbreviado();
		System.out.println(nome);
		
		
	}

}
