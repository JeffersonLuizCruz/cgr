package com.cgr.services;


public interface ValidacaoStrategy {
	String validarPrimeiroNome(String nome);
	String sobreNome(String nome);
	String nomeLetraMaiuscula(String nome);
	String nomeAbreviado(String nome);

}
