package view;

import java.util.Scanner;

import model.Cerveja;
import service.Cervejaria;
import service.TipoCerveja;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o código da cerveja? ");
		String codigo = entrada.next();
		
		System.out.println("Qual o nome da cerveja? ");
		String nome = entrada.next();
		
		System.out.println("Qual a data da produção? ");
		String dataProducao = entrada.next();
		
		System.out.println("Qual a data de validade? ");
		String dataValidade = entrada.next();
		
		System.out.println("Qual o preço? ");
		double preco = entrada.nextDouble();
		
		//Aqui eu implemento o princípio da Subistuíção de Liskov- o terceiro princípio do SOLID. Ao invés de instanciar Cerveja, que é a classe mãe, 
		//eu instancio um objeto da classe filha que é TipoCerveja. Logo, a aplicação disso faz com que objetos das subclasses substituam objetos da classe base sem causar dano ao código.
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
