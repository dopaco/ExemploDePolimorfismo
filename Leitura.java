import java.util.Scanner;

public class Leitura {
static Scanner scanner = new java.util.Scanner(System.in);
	
	public static double lerDouble(String mensagem){
		double retorno = 0;
		System.out.println(mensagem);
		retorno = scanner.nextDouble();
		scanner.nextLine();
		return retorno;
	}
	
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
	
	public static char lerChar(String mensagem){
		char retorno = ' ';
		System.out.println(mensagem);
		retorno = scanner.next().charAt(0);
		return retorno;
	}
	
	public static String limparBuffer (){
		String retorno;
		retorno = scanner.nextLine();
		return retorno;
	}
	
	
	public static String lerString(String mensagem){
		String retorno = null;
		System.out.println(mensagem);
		retorno = scanner.nextLine();
		
		return retorno;
	}

}
