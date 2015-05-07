package gui;


import java.util.List;

import javax.swing.table.AbstractTableModel;

public class JTableModelJugadores extends AbstractTableModel{
	
	List<Jugador> jugadores;
	
	public JTableModelJugadores(List<Jugador> listaJugador) {
		this.jugadores = listaJugador;
	}

	@Override
	public int getRowCount() {
		return jugadores.size();
	}

	@Override
	public int getColumnCount() {
		return 2;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Jugador j = jugadores.get(rowIndex);
		if(columnIndex == 0) return j.getNombre();
		else if (columnIndex == 1) return j.getEquipo();
		else return "";
	}
	
	

}
