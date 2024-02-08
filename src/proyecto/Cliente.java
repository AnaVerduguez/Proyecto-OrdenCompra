package proyecto;

public class Cliente {

	//Creo los atributos correspondientes
	String nombre;
	String apellido;
	
	//Creo el constructor de mi clase Cliente 
	public Cliente(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//Creo los metodos getter
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

}
