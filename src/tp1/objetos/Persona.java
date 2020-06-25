package tp1.objetos;

import tp1.interfaces.SerializadorUlead;

public class Persona implements SerializadorUlead {

	
	private String nombre;
	private String apellido;
	private String fecha_nac;
	private double peso;
	private double estatura;

	public String SerializarXML() {

		String cadena = "<persona>\n" + " <nombre>" + this.nombre + "</nombre>\n" + " <apellido>" + this.apellido
				+ "</apellido>\n" + " <fecha_nacimiento>" + this.fecha_nac + "</fecha_nacimiento>\n" + " <peso>"
				+ this.peso + "</peso>\n" + " <estatura>" + this.estatura + "</estatura>\n" + "</persona>";
		return cadena;
	};

	public String SerializarJson() {
		String cadena = "{\n" + " \"nombre" + "\"" + ":" + this.nombre + ",\n" + " \"apellido" + "\"" + ":"
				+ this.apellido + ",\n" + " \"fecha_nac" + "\"" + ":" + this.fecha_nac + ",\n" + " \"peso" + "\"" + ":"
				+ this.peso + ",\n" + " \"estatura" + "\"" + ":" + this.estatura + "," + "\n}";
		return cadena;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	@Override
	public String toString() {
		return nombre +"," + apellido + "," + fecha_nac + "," + peso +","+ estatura;
	};

	
}
