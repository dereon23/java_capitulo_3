package capitulo3;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		
		String entrada;
		
		System.out.println("Introduce el primer número");
		entrada = System.console().readLine();
		int numero1 = Integer.parseInt(entrada);
		
		
		System.out.println("Introduce el segundo número");
		entrada = System.console().readLine();
		int numero2 = Integer.parseInt(entrada);
		
		System.out.println("Su suma es igual a " + (numero1+numero2));
		System.out.println("Su resta es igual a " + (numero1-numero2));
		System.out.println("Su multiplicación es igual a " + (numero1*numero2));
		System.out.println("Su división es igual a " + (int)(numero1/numero2));
		
		
		
		
	}

}
