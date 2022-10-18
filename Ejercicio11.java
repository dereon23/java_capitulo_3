package capitulo3;

public class Ejercicio11 {
	
	public static void main(String[] args) {
		
		String entrada;
		
		System.out.println("Introduce la cantidad de Kbs a convertir");
		entrada = System.console().readLine();
		float kilobytes = Float.parseFloat(entrada);
		
		
		float megabytes = (kilobytes/1024);
		
		System.out.println("Eso equivale a " + megabytes);
		
	}

}
