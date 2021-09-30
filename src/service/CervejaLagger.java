package service;

import model.Cerveja;
//Cada classe do tipo de cerveja extende a classe pai (Cerveja) para estar de acordo com o segundo princípio do SOLID: PRINCÍPIO ABERTO-FECHADO(ABERTO 
//para extensão e Fechado para modificação)
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
