package service;

import model.Cerveja;
//Cada classe do tipo de cerveja extende a classe pai (Cerveja) para estar de acordo com o segundo princ�pio do SOLID: PRINC�PIO ABERTO-FECHADO(ABERTO 
//para extens�o e Fechado para modifica��o)
public class CervejaLagger extends Cerveja{
	private Cerveja cerveja;
		
	public CervejaLagger(Cerveja cerveja) {
		this.cerveja = cerveja;
	}
	
	@Override
	public String toString() {
		return "Dados da cerveja tipo Lagger:\n" + cerveja;
	}
	
	
}
