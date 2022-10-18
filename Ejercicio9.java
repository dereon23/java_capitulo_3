package capitulo3;

public class Ejercicio9 {

	
	public static void main(String[] args) {
		
		String entrada;
		
		System.out.println("Introduce la altura del cono");
		entrada = System.console().readLine();
		float altura = Float.parseFloat(entrada);
		
		
		System.out.println("Introduce el radio del cono");
		entrada = System.console().readLine();
		float radio = Float.parseFloat(entrada);
		
		final float PI = (float)3.1416;
		
		System.out.println("Su volumen es igual a " + (PI*radio*radio*altura/3));
	
	}
	
}
