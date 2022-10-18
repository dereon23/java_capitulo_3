package capitulo3;

public class Ejercicio8 {
	
	public static void main(String[] args) {
		
		String entrada;
		
		System.out.println("Introduce las horas trabajadas durante la semana");
		entrada = System.console().readLine();
		int horas_trabajadas = Integer.parseInt(entrada);
		
		float salario = 12;
		
		float total = (float)horas_trabajadas*salario;
		
		System.out.print("El salario semanal es de " + total);

		}

}
