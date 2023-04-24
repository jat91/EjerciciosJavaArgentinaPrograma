package carritoConHerenciaYExcepciones;

public class Descuento extends ItemCarrito{
	
	double descuento;
	
	public Descuento(String nombre, double precio, int cantidad, double descuento) {
		super(nombre, precio, cantidad);
		this.descuento = descuento;
	}
	
	//Descuento 10% si lleva más de 3
	public double hacerDescuento(int cant,double precio) {
		if(cant > 3) {
			return precio * 0.1;
		} else {
			return 0;
		}
	}

}
