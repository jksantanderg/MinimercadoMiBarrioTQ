package model;

import java.util.ArrayList;
import java.util.List;


public class MinimercadoMiBarrio {
	
	private static List<Person> person;

	public MinimercadoMiBarrio(ArrayList<Person> person) {
		person = new ArrayList <Person>();
		person.add(new Person("Cedula",1075412361));

	}
	
	/*public static boolean add(Person newPerson) {
		//person.add(new Person(typeId, id));
		if(person.add(newPerson)) {
			System.out.println("-------successfully added--------");
			return true;
		}else {
			return false;
		}
	}*/
	
	public List<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		MinimercadoMiBarrio.person = person;
	}


	public void addPerson(String typeId, int id) {
		//person = new ArrayList <Person>();
		person.add(new Person(typeId,id));
		
	}
	
	public static boolean imparId() {
		boolean impar=false;
		boolean continuar=true;
		for(int i=0; i<person.size() && continuar; i++) {
			Person p= person.get(i);
			
			if(p!=null) { 
				if(p.getId()==1 || p.getId()==3 || p.getId()==5 || p.getId()==7 || p.getId()==9) {
					impar=true;
					continuar=false;
				}
			}
		}return impar;
	}
	
	public static boolean validarTypeId() {
		//cedula?
		boolean validar=false;
		boolean continuar=true;
		for(int i=0; i<person.size() && continuar; i++) {
			Person p= person.get(i);
			String ti = "TI";
			if(p!=null) { 
				if(p.getTypeId().equals(ti)) {
					System.out.println("-------you are a minor, you can NOT enter the establishment--------");
					validar=true;
					continuar=false;
				}else {
					System.out.println("------you can enter the establishment--------");
				}
			}
		}return validar;
	}
	 public static void addNewPerson() { 
		 if(validarTypeId() == false) {
			 if(imparId() == true) {
				 
			 }else {
				 
			 }
		 }
		 
	 }

}
