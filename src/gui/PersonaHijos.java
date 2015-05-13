package gui;

import java.util.ArrayList;

public class PersonaHijos {
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	private PersonaHijos padre;
	
	private ArrayList<PersonaHijos> hijos;

	public PersonaHijos(String nombre, String apellido1, String apellido2) {
		this.padre = null;
		this.hijos = new ArrayList<PersonaHijos>();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	
	}
	
	public void setPadre(PersonaHijos padre){
		this.padre = padre;
	}
	
	public void addHijo(PersonaHijos hijo){
		hijos.add(hijo);
		hijo.setPadre(this);
	}
	
	public PersonaHijos getHijo(int i){
		return hijos.get(i);
	}
	
	public int numeroHijos(){
		return hijos.size();
	}
	
	public boolean tieneHijo(){
		return !hijos.isEmpty();
	}
	
	public void pintaArbol(){
		if(!this.tieneHijo())
			System.out.println(this.toString());
		else{
			System.out.println(this.toString());
			for (PersonaHijos personaHijos : hijos) {
				personaHijos.pintaArbol();
			}
		}
	}
	
	public String toString(){
		return nombre+" "+apellido1+" "+apellido2;
	}
}
