package gui;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Persona> lista;

	public Agenda() {
		lista = new ArrayList<Persona>();
	}
	public void addPersona(Persona p){
		lista.add(p);
	}
	
}
