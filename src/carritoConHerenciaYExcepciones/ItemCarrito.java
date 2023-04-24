package carritoConHerenciaYExcepciones;

public class ItemCarrito extends Producto{
	
	double itemPrecioTotal;
	int cantidad;
	
	public ItemCarrito(String nombre, double precio, int cantidad) {
		super(nombre, precio);
		this.cantidad = cantidad;
	}


}
