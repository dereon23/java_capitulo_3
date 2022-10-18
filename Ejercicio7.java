package capitulo3;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		
		String entrada;
		
		System.out.println("Introduce la base imponible");
		entrada = System.console().readLine();
		float base_imponible = Float.parseFloat(entrada);
		
		int IVA = 21;
		
		float total = base_imponible + base_imponible*IVA/100;
		
		System.out.print("El total es ");
		System.out.printf("%.2f", total);
		System.out.print(" euros");

		}
}