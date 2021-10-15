package ui;

import java.util.Scanner;

import model.MinimercadoMiBarrio;

public class Main {

	private static MinimercadoMiBarrio miBarrio;
	
	public static void main(String[] args) {
		menu();
	}

	
	@SuppressWarnings("resource")
	public static void menu() {
		Scanner reader = new Scanner(System.in);
		int option=0;
		
		System.out.println(" ----------BIENVENIDO------\n"+
			"   Seleccione una opcion:\n"+
			"(1) Register the entry of a new person\n"+
			"(2) consultar la cantidad de personas que han intentado ingresar al minimercado\n" +
			"(3) Exit\n" +
			"(0) -----");
				
			option = reader.nextInt();
			reader.nextLine();
				
			switch(option) {
			case 1:{
				addNewPerson();
				break;		
				}
			case 2:{
				break;
				}
			case 3:{
				break;
				}	
			}	
	}
	
	@SuppressWarnings("resource")
	public static void addNewPerson() {
		Scanner reader = new Scanner(System.in);

		
		System.out.println(" ----------REGISTER THE ENTRY OF A NEW PERSON------\n"+
				"Enter the type of document and please enter as follows in capital letters\n"+
				"TI -Tarjeta de Identidad-, CC - Cédula de Ciudadanía-, PP -Pasaporte- o CE -Cédula de Extranjería\n");
		
		String typeId = reader.nextLine();
		System.out.println("Enter the document\n");
		int id = reader.nextInt();
		
		miBarrio.addPerson(typeId,id);
		System.out.println("---------------");
		
	}

	
}
