package tp1.objetos;

import tp1.interfaces.SerializadorUlead;

public class Mascota implements SerializadorUlead {

	private String nombre;
	private String tipo;
	private int edad;

	public String SerializarXML() {
		String cadena = "<mascota>\n" + " <nombre>" + this.nombre + "</nombre>\n" + " <tipo>" + this.tipo + "</tipo>\n"
				+ " <edad>" + this.edad + "</edad>\n" + "</mascota>";
		return cadena;
	};

	public String SerializarJson() {
		String cadena = "{\n" 
				+" \"nombre" + "\""+":"+this.nombre + ",\n" +
				" \"tipo" + "\""+":"+this.tipo + ",\n" +
				" \"edad" + "\""+":"+this.edad + ",\n}";
		return cadena;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return nombre +"," +tipo + "," + edad;
	};

	
	
	
}
