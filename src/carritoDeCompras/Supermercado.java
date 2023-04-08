package carritoDeCompras;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Supermercado {
	
	
	public static int mostrarOpciones() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Elija una opcion: \n");
        System.out.print("1 - Registrar producto\n");
        System.out.print("2 - Nueva compra\n");
        System.out.print("3 - Salir\n");
        int opcion = sc.nextInt();
        return opcion;
	}
	
	public static void main(String[] args) {
		List<Producto> productos = new ArrayList<Producto>();
		int opcion = 0;
		int precioFinal = 0;
		do {
			Scanner sc = new Scanner(System.in);
			opcion = mostrarOpciones();
	        switch(opcion) {
	        case 1:
	        	System.out.print("Ingrese el nombre del producto: ");
	            String producto = sc.nextLine();
	            System.out.print("Ingrese el precio: ");
	            int precio = sc.nextInt();
	            Producto p1 = new Producto(producto,precio);
	            productos.add(p1);
	            System.out.print("Producto agregado correctamente\n");
	            break;
	        case 2:
	        	Carrito carrito = new Carrito();
	        	int op = 0;
	        	do {
	        		for(int i=0; i < productos.size(); i++) {
		            	System.out.println(i+1+" - "+productos.get(i).nombre+" - $"+productos.get(i).precio);
		        	}
		        	System.out.print("Ingrese el producto que desea agregar: ");
		        	int itemP = sc.nextInt()-1;
		        	System.out.print("Ingrese la cantidad que desea agregar: ");
		        	int itemCant = sc.nextInt();
		        	ItemCarrito item = new ItemCarrito(productos.get(itemP), itemCant);
		        	carrito.items.add(item);
		        	System.out.print("Elija una opcion: \n");
		            System.out.print("1 - Agregar nuevo producto\n");
		            System.out.print("2 - Cerrar compra\n");
		            System.out.print("3 - Cancelar compra\n");
		            op = sc.nextInt();
	        	}while (op == 1);
	        	if(op == 2) {
	        		System.out.println("Resumen Compra\n");
	        		System.out.println("Producto | Cantidad | Total");
	        		System.out.println("-----------------------------");
	        		for(int i=0; i < carrito.items.size(); i++) {
	        			int totalItem = carrito.items.get(i).producto.precio * carrito.items.get(i).cantidad;
	        			System.out.println(carrito.items.get(i).producto.nombre + " | " + carrito.items.get(i).cantidad + " | $" + totalItem);
	        			precioFinal += totalItem;
		        	}
	        		System.out.println("Total a pagar: $"+precioFinal);
	        		break;
	        	}
	        	if(op == 3) {
	        		System.out.println("Chau gracias!");
	        		break;
	        	}
	        	     	
	            break;
	        case 3:
	            System.out.println("Chau gracias!");
	            break;
	        default:
	            System.out.println("La opción seleccionada no es válida");
	            break;
	        }
		}while(opcion != 3);

			}

}
