package Ejercicios;
import java.util.Random;

public class Clase3_1_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int numeros[] = new int[10];
		
		for(int i=0;i < 10;i++) {
			numeros[i] = random.nextInt(5000);
		}
		
		float resultado = (float)numeros[5] / 3;
		System.out.println("El sexto numero del array es "+numeros[5]+" y divido por 3 da "+ resultado);
	}

}
