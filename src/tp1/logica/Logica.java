package tp1.logica;

import tp1.objetos.Mascota;
import tp1.objetos.Persona;
import tp1.tda.Cola;
import tp1.tda.ColaSerial;
import tp1.tda.Pila;
import tp1.ui.UiHelper;

public class Logica {

	UiHelper ui = new UiHelper();
	GestorLogico gl = new GestorLogico();
	Persona per = new Persona();
	Mascota mas = new Mascota();

	public void executeSerial() {
		int opc;
		ui.ShowParteUnoPersona();
		gl.CargarPersona(per);
		ui.ShowParteUnoMascota();
		gl.CargarMascota(mas);
		do {
			ui.showSerialMenu();
			opc = ui.readOpcion();
			switch (opc) {
			case 1:
				ui.print(per.SerializarXML());
				ui.print(mas.SerializarXML());
				break;
			case 2:
				ui.print(per.SerializarJson());
				ui.print(mas.SerializarJson());
				break;
			case 3:
				ui.print("Ahora vamos a la siguiente parte de la tarea programada.");
				break;
			default:
				ui.print("Opcion invalida");
				break;
			}

		} while (opc != 3);

	}

	public void executePilasColas() throws Exception {
		int opc = 0;
		// aqui creo la pila
		Pila pi = new Pila();
		ui.print("Se ha creado una pila....");
		// aqui creo la cola
		Cola co = new Cola();
		ui.print("Se ha creado una cola....");
		// aqui creo la cola con ejemplo de serializador
		ui.ShowParteDos();
		do {
			ui.showMenuPilasColas();
			opc = ui.readOpcion();
			switch (opc) {
			case 1:
				gl.CargarPila(pi);
				break;
			case 2:
				pi.pop();
				break;
			case 3:
				if (pi.getTop() > 0) {
					ui.printDouble(pi.menorAltura());
				} else {
					ui.print("La pila esta vacia");
				}
				break;
			case 4:
				gl.CargarCola(co);
				break;
			case 5:
				co.remover();
				break;
			case 6:
				this.executeColaSerial();
				break;
			case 7:
				ui.print("Gracias por utilizar el programa....");
				break;
			default:
				ui.print("Opcion invalida...");
			}

		} while (opc != 7);

	}

	private void executeColaSerial() {
		// TODO Auto-generated method stub
		ColaSerial cos = new ColaSerial();
		ui.print("Se ha creado una cola que implementa la interfaz SerializadorUlead...");
		int opc = 0;
		do {
			ui.showMenuSerial();
			opc = ui.readOpcion();
			switch (opc) {
			case 1:
				if (!cos.estaLlena()) {
					Persona per = new Persona();
					gl.CargarPersona(per);
					cos.insertar(per);
				} else {
					ui.print("La cola esta llena");
				}
				break;
			case 2:
				if (!cos.estaLlena()) {
					Mascota mas = new Mascota();
					gl.CargarMascota(mas);
					cos.insertar(mas);
				} else {
					ui.print("La cola esta llena");
				}
				break;
			case 3:
				cos.remover();
				break;
			case 4:
				cos.SerializarXML();
				break;
			case 5:
				cos.SerializarJson();
				break;
			case 6:
				break;
			default:
				ui.print("Opcion invalida");
			}
		} while (opc != 6);

	};

}
