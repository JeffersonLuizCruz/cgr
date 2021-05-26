package com.cgr.services;


public interface ValidacaoStrategy {
	String primeiroNome(String nome);
	String sobreNome(String nome);
	String nomeLetraMaiuscula(String nome);
	String nomeAbreviado(String nome);

}
