package tp1.ui;

import java.io.PrintStream;
import java.util.Scanner;


public class UiHelper {
	private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);
   
    
    public void ShowParteUnoPersona() {
    	output.println("Primera parte de la tarea programada 1");
    	output.println("Se leen los datos de una persona y una mascota para imprimir sus datos en la serializacion deseada:");
    	output.println("-----------------------------------------------------------------");
    	output.println("Ahora vamos a digitar los valores de la persona:");
    
    }
    
   
    public void ShowParteUnoMascota() {
    	output.println("Ahora vamos a digitar los valores de la mascota");
    }
    
    public void ShowParteDos() {
    	output.println("Segunda parte de la tarea programada 1");
    	output.println("Pilas y colas");
    	output.println("-----------------------------------------------------------------");
    };
    
    
    public void showMenuPilasColas() {
    	output.println("Acontinuacion eliga un opcion....");
    	output.println("1.Ingresar un objeto a la pila de personas");
    	output.println("2.Extraer de la pila de personas");
    	output.println("3.Obtener el dato de la menor estatura en la pila");
    	output.println("4.Insertar un objeto a la cola de mascotas");
    	output.println("5.Extraer de la cola de mascotas");
    	output.println("6.Acceder al ejemplo de cola heredando la clase SeralizadorUlead");
    	output.println("7.Salir del programa");
    }
    
    public String readNombre() {
        output.println("Digite el nombre:");
        return input.next();
    }
    
    public String readApellido() {
        output.println("Digite el apellido:");
        return input.next();
    }
    
    public String readFechaNac() {
        output.println("Digite la fecha de nacimiento:");
        return input.next();
    }
    
    public double readEstatura() {
        output.println("Digite la estatura:");
        return input.nextDouble();
    }
    
    public String readTipo() {
    	output.println("Digite el tipo:");
    	return input.next();
    }
    
    public int readEdad() {
    	output.println("Digite la edad:");
    	return input.nextInt();
    }
    
    public void print(String msg) {
    	output.println(msg);
    };
    
    public double readPeso() {
        output.println("Digite el peso: ");
        return input.nextDouble();
    }

	public void showSerialMenu() {
		output.println("1.Serializar objetos en XML");
		output.println("2.Serializar objetos en Json");
		output.println("3.Continuar a la segunda parte de la tarea");
	}

	public int readOpcion() {
		output.println("Digite el numero de la opcion que desea realizar: ");
		return input.nextInt();
	}
	
	public void printDouble(double value) {
		output.println("El valor deseado es: " + value);
	}


	public void print(int value) {
		// TODO Auto-generated method stub
		output.println(value);
	}


	public void showMenuSerial() {
		output.println("1.Insertar una persona a la cola");
		output.println("2.Insertar una mascota a la cola");
		output.println("3.Remover objeto de la cola");
		output.println("4.Imprimir cola en formato XML");
		output.println("5.Imprimir cola en formato Json");
		output.println("6.Salir");
		
	}
    
}
