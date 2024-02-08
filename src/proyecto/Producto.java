package proyecto;

public class Producto {

	//Creo los atributos correspondientes
	String fabricante;
	String nombre;
	int precio;
	
	//Creo el constructor de mi clase Producto  
	public Producto(String fabricante, String nombre, int precio) {
		super();
		this.fabricante = fabricante;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//Creo los metodos getter
	public String getFabricante() {
		return fabricante;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getPrecio() {
		return precio;
	}

}
