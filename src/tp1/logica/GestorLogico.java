package tp1.logica;

import tp1.objetos.Mascota;
import tp1.objetos.Persona;
import tp1.tda.Cola;
import tp1.tda.Pila;
import tp1.ui.UiHelper;

public class GestorLogico {

	UiHelper ui = new UiHelper();

	public void CargarPersona(Persona per) {
		per.setNombre(ui.readNombre());
		per.setApellido(ui.readApellido());
		per.setFecha_nac(ui.readFechaNac());
		per.setEstatura(ui.readEstatura());
		per.setPeso(ui.readPeso());
	}

	public void CargarMascota(Mascota mas) {
		mas.setNombre(ui.readNombre());
		mas.setTipo(ui.readTipo());
		mas.setEdad(ui.readEdad());
	}

	public void CargarPila(Pila pi) throws Exception {
		if (pi.getTop() == 10) {
			ui.print("Prevencion de desbordamiento de pila...no puedes ingresar mas datos");
		} else {
			Persona per = new Persona();
			this.CargarPersona(per);
			pi.push(per);
		}
	}

	public void CargarCola(Cola co) {
		Mascota mas = new Mascota();
		if (co.estaLlena()) {
			ui.print("La cola esta llena");
		} else {
			this.CargarMascota(mas);
			co.insertar(mas);
		}
	}
}
