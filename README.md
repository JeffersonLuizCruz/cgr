Padrão de Projeto Strategy

Nesse projeto foi realizado o padrão Strategy. Com ele conseguimos realizar a mesma operação de diferentes maneiras.

Start do Proejto

´´´
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
  ´´´
