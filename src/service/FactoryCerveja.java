package service;

import model.Cerveja;
//Esta classe obedece ao Factory Method já que cria objetos dos diversos tipos de cerveja.
//Aqui também é aplicado o primeiro princípio do SOLID (princípio da responsabilidade única) já que a classe possui uma função apenas: a de criar objetos a partir do método criar.
public class FactoryCerveja {

	public Cerveja criar(Cerveja cerveja, String tipo) {
		
		switch (tipo){
			case "lagger":
				return new CervejaLagger(cerveja);				
			case "pilsen":
				return new CervejaPilsen(cerveja);				
			case "cereja":
				return new CervejaCereja(cerveja);				
			case "puro malte":
				return new CervejaPuroMalte(cerveja);				
			case "sem alcool":
				return new CervejaSemAlcool(cerveja);				
			case "trigo":
				return new CervejaTrigo(cerveja);
			case "laranja":
				return new CervejaLaranja(cerveja);
			default:
				return null;
		}			
	}
}
