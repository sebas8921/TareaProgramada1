package tp1.tda;

import tp1.logica.GestorLogico;
import tp1.objetos.Persona;
import tp1.ui.UiHelper;

public class Pila {
	GestorLogico gl = new GestorLogico();
	UiHelper ui = new UiHelper();
	Persona data[] = new Persona[20];
	int top = 0;

	public boolean isFull() {
		if (this.top == 20) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isEmpty() {
		if (this.top == 0) {
			return true;
		} else {
			return false;
		}

	}

	public void push(Persona newValue)  {
		if (this.isFull()) {
			ui.print("La pila esta llena");
		} else {
			this.data[top] = newValue;
			this.top++;
		}
	}
	
	public void pop()  {
		String cadena;
		if (this.isEmpty()) {
			cadena = "La pila esta vacia";
		} else {
			cadena = this.data[top-1].SerializarJson();
			this.top = this.top - 1;
				
		}
		ui.print(cadena);
	}
	
	
	
	
	public double menorAltura() {
		double menorEstatura = 1000000.0;
		int tmptop = this.top;
		Pila pilatemp = new Pila();
		while(tmptop > 0) {
			pilatemp.push(this.data[tmptop-1]);
			if(pilatemp.data[pilatemp.getTop()-1].getEstatura() < menorEstatura) {
				menorEstatura = pilatemp.data[pilatemp.getTop()-1].getEstatura();
			}
			tmptop--;
		}
		
		return menorEstatura;
	};
	
	public int getTop() {
		return this.top;
	}
	
	public void setTop(int top) {
		this.top = top;
	}

}
