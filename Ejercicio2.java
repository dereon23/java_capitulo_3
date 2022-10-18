package capitulo3;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		String entrada;
		
		System.out.println("Introduce la cantidad de euros a convertir");
		entrada = System.console().readLine();
		float euros = Float.parseFloat(entrada);
		
		
		int pesetas = (int)(euros*166.3860);
		
		System.out.printf("%.2f", euros);
		System.out.print(" euros son " + pesetas);
		System.out.print(" pesetas");
		
		
	}

}
