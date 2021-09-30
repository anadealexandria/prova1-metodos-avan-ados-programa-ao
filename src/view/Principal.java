package view;

import java.util.Scanner;

import model.Cerveja;
import service.Cervejaria;
import service.TipoCerveja;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o c�digo da cerveja? ");
		String codigo = entrada.next();
		
		System.out.println("Qual o nome da cerveja? ");
		String nome = entrada.next();
		
		System.out.println("Qual a data da produ��o? ");
		String dataProducao = entrada.next();
		
		System.out.println("Qual a data de validade? ");
		String dataValidade = entrada.next();
		
		System.out.println("Qual o pre�o? ");
		double preco = entrada.nextDouble();
		
		//Aqui eu implemento o princ�pio da Subistu���o de Liskov- o terceiro princ�pio do SOLID. Ao inv�s de instanciar Cerveja, que � a classe m�e, 
		//eu instancio um objeto da classe filha que � TipoCerveja. Logo, a aplica��o disso faz com que objetos das subclasses substituam objetos da classe base sem causar dano ao c�digo.
		Cerveja cerveja = new TipoCerveja(codigo, nome, dataProducao, dataValidade, preco);
		
		System.out.println("Qual o tipo de cerveja?\n1- Trigo;\n2-Lagger;\n3-Pilsen;\n4-Laranja;\n5-Cereja;\n6-Puro Malte;\n7-Sem Alcool");
		String escolha = entrada.next();
		String tipo = null;
		
		switch (escolha) {
			case "1":
				tipo = "trigo";
				break;
			case "2":
				tipo = "lagger";
				break;
			case "3":
				tipo = "pilsen";
				break;
			case "4":
				tipo = "laranja";
				break;
			case "5":
				tipo = "cereja";
				break;
			case "6":
				tipo = "puro malte";
				break;
			case "7":
				tipo = "sem alcool";
				break;
		}
		
		Cervejaria cervejaria = new Cervejaria();
		Cerveja cerveja1 = cervejaria.criarCerveja(cerveja, tipo);
		
		System.out.println(cerveja1);
			
	}

}
