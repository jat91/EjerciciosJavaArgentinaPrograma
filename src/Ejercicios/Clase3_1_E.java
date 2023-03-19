package Ejercicios;

public class Clase3_1_E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String materias[] = {"Matemática","Física","Química"};
		double notas[] = {8.50, 4, 6.50};
		double promedio = (double)(notas[0]+notas[1]+notas[2])/3;
		
		for(int i=0;i < materias.length;i++) {
			System.out.println("Materia: "+materias[i]+" - "+"Nota: "+notas[i]);
		}
		
		System.out.println("Su promedio es: "+String.format("%.2f", promedio));
	}
}