/*
Autor....:	Paulo Roberto Correia Junior
Matricula:	T50262-4
Data.....:	10/11/2015
Problema.: 1) Implemente, em Java, uma classe abstrata de nome Figura onde são declarados dois 
				métodos abstratos:  float calcularArea();  float calcularPerimetro(); 

				2) Crie, como subclasse de Figura, uma classe de nome Retângulo cujas instâncias são
				caracterizadas pelos atributos lado e altura ambos do tipo float. Implemente na classe
				Retângulo os métodos herdados de Figura  e outros que ache necessários.
				
				3) Crie, como subclasse de Figura, uma classe de nome Circulo cujas instâncias são 
				caracterizadas pelo atributo raio do tipo float. Implemente na classe Circulo os métodos
				herdados de Figura e outros que ache necessários. 
				
				Nota: poderá obter o valor de Pi fazendo Math.PI.
				
				4) Crie, como subclasse de Retangulo, uma classe de nome Quadrado cujas instâncias são 
				caracterizadas por terem os atributos lado e altura com o mesmo valor.
				
				5) Elabore um programa de teste onde é declarado um ArrayList, do tipo Figura. Nesse 
				ArrayList devem ser guardadas instâncias de Retângulo, Circulo e Quadrado.  Depois 
				implemente um ciclo que percorra o ArrayList evocando, relativamente a cada um dos objetos 
				guardados, os métodos calcularArea e calcularPerimetro.

*/
import java.util.ArrayList;

public class CriaFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int    qtd    = 0;
		int    tipo   = 0;
		float base   = 0;
		float altura = 0;
		float raio   = 0;
		float lado   = 0;

		ArrayList<Figura> figuras = new ArrayList<Figura>();



		qtd = Leitura.lerInt("Informe a quantidade de figuras desejada: ");

		for ( int i = 0; i < qtd; i++) {
						
			tipo = Leitura.lerInt("(1)Retângulo (2)Quadrado (3)Círculo\nInforme o número da figura: ");
			
			if (tipo == 1){
				base = Leitura.lerFloat ("Informe a base do retângulo: ");
				altura = Leitura.lerFloat ("Informe a altura do retângulo: ");
				Retangulo retangulo = new Retangulo(base,altura);
				figuras.add(retangulo);
			}else if (tipo == 2){
				lado = Leitura.lerFloat ("Informe o lado do quadrado: ");
				Quadrado quadrado = new Quadrado(lado);
				figuras.add(quadrado);
			
			}else if (tipo == 3){
				raio = Leitura.lerFloat ("Informe o raio do círculo: ");
				Circulo circulo = new Circulo(raio);
				figuras.add(circulo);			
			
			}else{			
				System.out.println ("Valor inválido!\n");
				qtd--;
			}
			
		}
		

		
		// Lista toda as figuras
		for (Figura figura : figuras){	
			System.out.println(figura.toString());
		}
		
	}

}
