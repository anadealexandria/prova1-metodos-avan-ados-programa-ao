package service;

import model.Cerveja;

public class Cervejaria implements CriarCerveja {
	private Cerveja cerveja1;
	private FactoryInterface factoryInterface;
	private FactoryCerveja factoryCerveja;
	
	
	public Cervejaria() {
		//Aqui para implementar o princípio da INVERSÃO DE DEPENDÊNCIA, princípio 5 do SOLID,
		//ao invés de instanciar um objeto da classe FactoryCerveja diretamente, eu acesso a classe por meio da sua interface
		//implementando a injeção de dependência via construtor (a injeção de dependência é a maneira de se implementar a INVERSÃO DE DEPENDÊNCIA)
		factoryInterface = new CriarFactory();
		 
	}		
	
	public Cerveja criarCerveja(Cerveja cerveja1, String tipo) {
		this.cerveja1 = cerveja1;
		
				
		 factoryCerveja = factoryInterface.criarFactory();
		 
		 return factoryCerveja.criar(cerveja1, tipo);		 
	}
	
	public String toString() {
		return " " + cerveja1;
	}
}
