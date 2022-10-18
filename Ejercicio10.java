package capitulo3;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		
		String entrada;
		
		System.out.println("Introduce la cantidad de Mbs a convertir");
		entrada = System.console().readLine();
		float megabytes = Float.parseFloat(entrada);
		
		
		float kilobytes = (megabytes*1024);
		
		System.out.println("Eso equivale a " + kilobytes);
		
		
	}

}
