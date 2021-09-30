package service;

public interface FactoryInterface {
	//Aqui são aplicados dois princípios do SOLID: o princípio da responsabilidade única e o princípio da segregação de interface
	public FactoryCerveja criarFactory();
}
