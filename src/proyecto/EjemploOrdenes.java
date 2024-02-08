package proyecto;

import java.util.Date;

public class EjemploOrdenes {
	public static void main(String[] args) {
    	
    	//Creo 3 objetos o instancias para la clase cliente
	Cliente cliente1 = new Cliente("Romina", "Martinez");
	Cliente cliente2 = new Cliente("Julieta", "Lopez");
	Cliente cliente3 = new Cliente("Ana", "Diaz");
		
	//Creo 12 objetos o instancias para la clase producto
	Producto producto1 = new Producto("Maybelline", "Brillo labial", 3300);
	Producto producto2 = new Producto("L'Oréal Paris", "Base en polvo", 8200);
	Producto producto3 = new Producto("Maybelline", "Mascara de pestañas", 6000);
	Producto producto4 = new Producto("La Roche-Posay", "Rubor en polvo", 5500);
	
	Producto producto5 = new Producto("L'Oréal Paris", "Corrector", 3500);
	Producto producto6 = new Producto("Maybelline", "Iluminador", 3700);
	Producto producto7 = new Producto("Maybelline", "Delineador de ojos", 2500);
	Producto producto8 = new Producto("Vogue", "Base", 1900);
	
	Producto producto9 = new Producto("Maybelline", "Corrector", 3100);
	Producto producto10 = new Producto("Vogue", "Labial liquido", 1600);
	Producto producto11 = new Producto("Maybelline", "Delineador de cejas", 2800);
	Producto producto12= new Producto("Rimmel", "Mascara de pestañas", 4300);
	
	//Creo 3 ordenes con diferentes clientes, fechas y productos 
	OrdenCompra orden1 = new OrdenCompra("Orden 1");
	orden1.setCliente(cliente1);
	orden1.setFecha(new Date());
	orden1.addProducto(producto1);
	orden1.addProducto(producto2);
	orden1.addProducto(producto3);
	orden1.addProducto(producto4);
 
        OrdenCompra orden2 = new OrdenCompra("Orden 2");
        orden2.setCliente(cliente2);
        orden2.setFecha(new Date());
        orden2.addProducto(producto5);
        orden2.addProducto(producto6);
        orden2.addProducto(producto7);
        orden2.addProducto(producto8);
 
    
        OrdenCompra orden3 = new OrdenCompra("Orden 3");
        orden3.setCliente(cliente3);
        orden3.setFecha(new Date());
        orden3.addProducto(producto9);
        orden3.addProducto(producto10);
        orden3.addProducto(producto11);
        orden3.addProducto(producto12);
    
        //Imprimo todos los valores de cada orden pasando como parametro la descripcion
        imprimir(orden1);
        imprimir(orden2);
        imprimir(orden3);
   
	}
	
        //Creo un metodo que me permitira imprimir por pantalla
        public static void imprimir(OrdenCompra orden) {
		System.out.println("Orden N°: " + orden.getDescripcion());
	        System.out.println("Fecha: " + orden.getFecha());
	        System.out.println("Cliente: " + orden.getCliente().getNombre() + " " + orden.getCliente().getApellido());
	        System.out.println("Productos:");
	        for (Producto producto : orden.getProductos()) {
	    		if (producto != null) {
	    			System.out.println("-" + producto.getFabricante() + " " + producto.getNombre() + " $" + producto.getPrecio());
	       		 }
        	}
	    	System.out.println("El total es: $" + orden.getTotalProductos());
	    	System.out.println("-------------------------------------------");
   }
}


