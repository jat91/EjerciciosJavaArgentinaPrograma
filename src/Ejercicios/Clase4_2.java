package Ejercicios;
import java.util.Scanner;

public class Clase4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese los datos
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        // Mostrar los datos ingresados por el usuario
        System.out.println("\nDatos del usuario:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        
        // Mostrar si es mayor de edad
        if (edad >= 18) {
			System.out.println(nombre + " es mayor de edad.");
		} else {
			System.out.println(nombre + " es menor de edad.");
		}
    }
}





