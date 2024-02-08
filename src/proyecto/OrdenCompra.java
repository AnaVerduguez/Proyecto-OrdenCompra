package proyecto;

import java.util.Date;

public class OrdenCompra {
	
	//Creo mis campos privados o atributos correspondientes
	private Integer identificador;
	private String descripcion;
	private Date fecha;
	private Cliente cliente;
	private Producto[] productos =  new Producto[4];
	
	//Creo el constructor solamente para descripcion
	public OrdenCompra(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	//Creo los metodos getter
	public Integer getIdentificador() {
		return identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Producto[] getProductos() {
		return productos;
	}

	//Creo los metodos setter solamente para cliente y fecha
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	//Metodo que me permite agregar productos
	public void addProducto(Producto producto) {
        for(int i=0; i<productos.length; i++) {
            if(productos[i] == null) {
            	productos[i] = producto;
            	break; //fuerza la salida del bucle
            }
        }
	}

	//Metodo que me devuelve el gran total -> suma de productos
	public int getTotalProductos(){
		int granTotal = 0;
		for(int i=0; i<productos.length; i++) {
			if (productos[i] != null) {
				granTotal += productos[i].getPrecio(); //+= sentencia de asignacion
			}
		}		
		return granTotal; //finaliza el metodo y regresa un valor
	}
	
}
