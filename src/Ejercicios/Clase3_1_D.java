package Ejercicios;

public class Clase3_1_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productos[] = {"Pelota","Remera","Short","Botines"};
		double precios[] = {100.35, 150.20, 50.99, 200.10};
		
		for(int i=0;i < productos.length;i++) {
			System.out.println("Producto: "+productos[i]+" - "+"Precio: "+precios[i]);
		}
	}
}