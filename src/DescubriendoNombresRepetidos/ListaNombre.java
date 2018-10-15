package DescubriendoNombresRepetidos;


import java.util.ArrayList;

public class ListaNombre {
	private ArrayList<Nombre> nombres = new ArrayList<Nombre>();
	private int cantRepetidos;
	
	public void add(Nombre nomb) {
		for (Nombre nombre : nombres) {
			if(nombre.equals(nomb)) 
				return;
			
		}
		this.nombres.add(nomb);
	}
	public int cantNombres() {
		return this.nombres.size();
	}
	
	public Nombre get(int pos) {
		return this.get(pos);
	}
	public ArrayList<Nombre> getNombres() {
		return nombres;
	}
	public void setNombres(ListaNombre listaNombre) {
		this.nombres = listaNombre.getNombres();
	}
	public int getCantRepetidos() {
		return cantRepetidos;
	}
	public void setCantRepetidos(int cantRepetidos) {
		this.cantRepetidos = cantRepetidos;
	}
	
}
