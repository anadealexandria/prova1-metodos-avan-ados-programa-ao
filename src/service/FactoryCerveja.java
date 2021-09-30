package service;

import model.Cerveja;
//Esta classe obedece ao Factory Method j� que cria objetos dos diversos tipos de cerveja.
//Aqui tamb�m � aplicado o primeiro princ�pio do SOLID (princ�pio da responsabilidade �nica) j� que a classe possui uma fun��o apenas: a de criar objetos a partir do m�todo criar.
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
