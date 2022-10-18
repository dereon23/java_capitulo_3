package capitulo3;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		String entrada;
		
		System.out.println("Introduce el primer número");
		entrada = System.console().readLine();
		int numero1 = Integer.parseInt(entrada);
		
		
		System.out.println("Introduce el segundo número");
		entrada = System.console().readLine();
		int numero2 = Integer.parseInt(entrada);
		
		
		System.out.println("Su multiplicación es igual a " + (numero1*numero2));
		
	}

}
