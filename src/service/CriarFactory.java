package service;

public class CriarFactory implements FactoryInterface{
	
	public FactoryCerveja criarFactory() {
		
		FactoryCerveja cerveja = new FactoryCerveja();
		
		return cerveja;
	}
}
