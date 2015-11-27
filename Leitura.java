import java.util.Scanner;

public class Leitura {
static Scanner scanner = new java.util.Scanner(System.in);
	
	
	//Leitura de dados tipo double
	public static double lerDouble(String mensagem){
		double retorno = 0;
		System.out.println(mensagem);
		retorno = scanner.nextDouble();
		scanner.nextLine();
		return retorno;
	}
	
	//Leitura de dados tipo Float
	public static float lerFloat(String mensagem){
		float retorno = 0;
		System.out.println(mensagem);
		retorno = scanner.nextFloat();
		scanner.nextLine();
		return retorno;
	}	
	

	public static int lerInt(String mensagem){
		int retorno = 0;
		System.out.println(mensagem);
		retorno = scanner.nextInt();
		return retorno;
	}
	
	//Leitura de dados tipo char
	public static char lerChar(String mensagem){
		char retorno = ' ';
		System.out.println(mensagem);
		retorno = scanner.next().charAt(0);
		return retorno;
	}
	
	//metodo para limpeza do buffer
	public static String limparBuffer (){
		String retorno;
		retorno = scanner.nextLine();
		return retorno;
	}
	
	//Leitura de dados tipo String
	public static String lerString(String mensagem){
		String retorno = null;
		System.out.println(mensagem);
		retorno = scanner.nextLine();
		return retorno;
	}

}
