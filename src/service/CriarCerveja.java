package service;

import model.Cerveja;
 //Aqui s�o aplicados dois princ�pios do SOLID: o princ�pio da responsabilidade �nica e o princ�pio da segrega��o de interface

public interface CriarCerveja {
	
	public Cerveja criarCerveja(Cerveja cerveja, String tipo);
}
