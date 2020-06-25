package tp1.tda;

import tp1.objetos.Mascota;
import tp1.ui.UiHelper;

public class Cola {
	
	Mascota data[] = new Mascota[20];
	int inicio, fin, max;
	UiHelper ui = new UiHelper();
	
	public Cola() {
		this.inicio = -1;
		this.fin = -1;
		this.max = 20;
		
	}
	
	public boolean estaVacia() {
		return this.inicio == -1;
	}
	
	public boolean estaLlena() {
		return ((fin == max-1 && inicio == 0)||(fin+1 == inicio));
	}
	
	public void insertar(Mascota elemento) {
		if (this.estaLlena()) {
			ui.print("La cola esta llena");
			return;
		} 
		if (this.fin ==this.max-1 && this.inicio != 0) {
				this.fin = 0;
		}else {
			   this.fin = this.fin+1;
		}
		data[this.fin]  = elemento;
		if (inicio == -1) inicio = 0;
	}
	
	public void remover() {
		if(this.estaVacia()) {
			ui.print("La pila esta vacia");
			return;
		}
		//se imprime el dato eliminado
		ui.print(data[inicio].SerializarJson());
		if (inicio == fin) {
			inicio = -1;
			fin  = -1;
			return;
		}
		
		if (inicio == max) inicio = 0; else inicio++;
		
	}
	
}
