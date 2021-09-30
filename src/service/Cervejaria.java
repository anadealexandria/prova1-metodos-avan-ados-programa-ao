package service;

import model.Cerveja;

public class Cervejaria implements CriarCerveja {
	private Cerveja cerveja1;
	private FactoryInterface factoryInterface;
	private FactoryCerveja factoryCerveja;
	
	
	public Cervejaria() {
		//Aqui para implementar o princ�pio da INVERS�O DE DEPEND�NCIA, princ�pio 5 do SOLID,
		//ao inv�s de instanciar um objeto da classe FactoryCerveja diretamente, eu acesso a classe por meio da sua interface
		//implementando a inje��o de depend�ncia via construtor (a inje��o de depend�ncia � a maneira de se implementar a INVERS�O DE DEPEND�NCIA)
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
