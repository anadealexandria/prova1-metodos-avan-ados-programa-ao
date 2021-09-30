package service;

import model.Cerveja;
 //Aqui são aplicados dois princípios do SOLID: o princípio da responsabilidade única e o princípio da segregação de interface

public interface CriarCerveja {
	
	public Cerveja criarCerveja(Cerveja cerveja, String tipo);
}
