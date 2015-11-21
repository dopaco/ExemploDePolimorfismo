
public class Retangulo extends Figura {

	private float lado;
	private float altura;
	
	public Retangulo(float lado, float altura) {
		// TODO Auto-generated constructor stub
		this.lado = lado;
		this.altura = altura;
	}

	@Override
	// FINAL impede que quadrado sobrescreva o metodo.
	public final float calcularArea() {
		// TODO Auto-generated method stub
		return  lado * altura;
	}

	@Override
	// FINAL impede que quadrado sobrescreva o metodo.
	public final float calcularPerimetro() {
		// TODO Auto-generated method stub
		return (lado * 2) + (altura * 2);
	}
	
	public String nome(){
		return "Retangulo ";
	}

}
