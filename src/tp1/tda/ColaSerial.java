package tp1.tda;

import tp1.interfaces.SerializadorUlead;
import tp1.ui.UiHelper;

public class ColaSerial implements SerializadorUlead {

	Object data[] = new Object[20];
	int inicio, fin, max;
	UiHelper ui = new UiHelper();

	public ColaSerial() {
		this.inicio = -1;
		this.fin = -1;
		this.max = 20;

	}

	public boolean estaVacia() {
		return this.inicio == -1;
	}

	public boolean estaLlena() {
		return ((fin == max - 1 && inicio == 0) || (fin + 1 == inicio));
	}

	public void insertar(Object elemento) {
		if (this.estaLlena()) {
			ui.print("La cola esta llena");
			return;
		}
		if (this.fin == this.max - 1 && this.inicio != 0) {
			this.fin = 0;
		} else {
			this.fin = this.fin + 1;
		}
		data[this.fin] = elemento;
		if (inicio == -1)
			inicio = 0;
	}

	public void remover() {
		if (this.estaVacia()) {
			ui.print("La cola esta vacia");
			return;
		}
		// se imprime el dato eliminado
		ui.print(data[inicio].toString());
		if (inicio == fin) {
			inicio = -1;
			fin = -1;
			return;
		}

		if (inicio == max)
			inicio = 0;
		else
			inicio++;

	}

	@Override
	public String SerializarXML() {
		String cadena;
		int i = 0;
		if (!this.estaVacia()) {
			i = this.inicio;
			ui.print("Acontinuacion los objetos de la cola en formato XML");
			ui.print("----------------------------------------------------------------");
			do {
				Object valoresObjeto[];
				valoresObjeto = data[i].toString().split(","); 
				switch(valoresObjeto.length) {
				case 3:
					ui.print("<mascota>\n" + " <nombre>" + valoresObjeto[0] + "</nombre>\n" + " <tipo>" + valoresObjeto[1] + "</tipo>\n"
					+ " <edad>" + valoresObjeto[2] + "</edad>\n" + "</mascota>");
					break;
				case 5:
					ui.print("<persona>\n" + " <nombre>" + valoresObjeto[0] + "</nombre>\n" + " <apellido>" + valoresObjeto[1]
					+ "</apellido>\n" + " <fecha_nacimiento>" + valoresObjeto[2] + "</fecha_nacimiento>\n" + " <peso>"
					+ valoresObjeto[3] + "</peso>\n" + " <estatura>" + valoresObjeto[4] + "</estatura>\n" + "</persona>");
					break;
				default:
					break;
				}				
				i++;
			}while(i!=fin+1);
			cadena = "";
		} else {
			cadena = "La cola esta vacia";
		}
		return cadena;
	}

	@Override
	public String SerializarJson() {
		String cadena;
		int i = 0;
		if (!this.estaVacia()) {
			i = this.inicio;
			ui.print("Acontinuacion los objetos de la cola en formato XML");
			ui.print("----------------------------------------------------------------");
			do {
				Object valoresObjeto[];
				valoresObjeto = data[i].toString().split(","); 
				switch(valoresObjeto.length) {
				case 3:
					ui.print("{\n" 
							+" \"nombre" + "\""+":"+valoresObjeto[0] + ",\n" +
							" \"tipo" + "\""+":"+valoresObjeto[1]+ ",\n" +
							" \"edad" + "\""+":"+valoresObjeto[2] + ",\n}");
					break;
				case 5:
					ui.print("{\n" + " \"nombre" + "\"" + ":" + valoresObjeto[0] + ",\n" + " \"apellido" + "\"" + ":"
							+ valoresObjeto[1] + ",\n" + " \"fecha_nac" + "\"" + ":" + valoresObjeto[2] + ",\n" + " \"peso" + "\"" + ":"
							+ valoresObjeto[3] + ",\n" + " \"estatura" + "\"" + ":" + valoresObjeto[4] + "," + "\n}");
					break;
				default:
					break;
				}				
				i++;
			}while(i!=fin+1);
			cadena = "";
		} else {
			cadena = "La cola esta vacia";
		}
		return cadena;
	}

}
