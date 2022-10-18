package capitulo3;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		String entrada;
		
		System.out.println("¿Qué nota sacaste en el primer examen?");
		entrada = System.console().readLine();
		float nota_primer_examen = Float.parseFloat(entrada);
		
		
		System.out.println("¿Qué media deseas obtener?");
		entrada = System.console().readLine();
		float nota_deseada = Float.parseFloat(entrada);
		
		
		System.out.println("Necesitas una nota de " + 
		((nota_deseada - 0.4*nota_primer_examen)/0.6) );
		
	}
	
}
