package capitulo3;

public class Ejercicio6 {
	
	
	public static void main(String[] args) {
		
		
		String entrada;
		
		System.out.println("Introduce la altura del triángulo");
		entrada = System.console().readLine();
		int altura = Integer.parseInt(entrada);
		
		
		System.out.println("Introduce el ancho del triángulo");
		entrada = System.console().readLine();
		int ancho = Integer.parseInt(entrada);
		
		System.out.println("Su área es igual a " + (float)(altura*ancho/2));
		
		
		
		
	}

}
