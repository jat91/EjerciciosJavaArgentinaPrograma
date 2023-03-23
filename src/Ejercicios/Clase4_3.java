package Ejercicios;
import java.util.Scanner;

public class Clase4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Pedir al usuario que ingrese los datos
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
		
		// Array de productos
        String[] productos = {"Manzana", "Naranja", "Banana", "Zanahoria", "Lechuga", "Tomate", "Coca-Cola", "Pepsi", "Sprite"};
        // Array de precios
        double[] precios = {10.5, 15.2, 7.8, 14.6, 16.4, 11.0, 20.9, 19.7, 18.2};
        
        for(int i=0; i < productos.length; i++) {
        	System.out.println(i+1+" - "+productos[i]+" $"+precios[i]);
        }
        
        System.out.print("Buen dia "+nombre+", elija un producto: ");
        int producto = sc.nextInt()-1;
        
        System.out.print("Elija una cantidad: ");
        int cantidad = sc.nextInt();
        
        double total = cantidad * precios[producto];
        
        double descuento = 0;
        if (total > 1000) {
        	descuento = total * 0.2;
        }
        double totalConDescuento = total - descuento;
        
        System.out.println("Cliente: "+nombre);
        System.out.println("Producto: "+productos[producto]);
        System.out.println("Precio: $"+precios[producto]);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Total sin descuento: $"+total);
        System.out.println("Descuento: $"+descuento);
        System.out.println("Total a pagar: $"+totalConDescuento);
    }
}





