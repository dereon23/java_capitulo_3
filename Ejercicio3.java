package capitulo3;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		String entrada;
		
		System.out.println("Introduce la cantidad de pesetas a convertir");
		entrada = System.console().readLine();
		int pesetas = Integer.parseInt(entrada);
		
		
		float euros = (float)(pesetas*166.3860);
		
		System.out.print(pesetas + " pesetas son ");
		System.out.printf("%.2f", euros);
		System.out.print(" euros");
		
		
	}
	
}
