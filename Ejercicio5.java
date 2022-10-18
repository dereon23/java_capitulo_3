package capitulo3;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		
		String entrada;
		
		System.out.println("Introduce el la altura del rectángulo");
		entrada = System.console().readLine();
		int altura = Integer.parseInt(entrada);
		
		
		System.out.println("Introduce el ancho del rectángulo");
		entrada = System.console().readLine();
		int ancho = Integer.parseInt(entrada);
		
		System.out.println("Su área es igual a " + (altura*ancho));
		
		
		
		
	}

}
