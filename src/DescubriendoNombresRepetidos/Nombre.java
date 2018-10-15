package DescubriendoNombresRepetidos;

public class Nombre {
	private String nombre;
	private int cant =1;
	public Nombre (String nombre){
		this.nombre = nombre;
	}
	
	public boolean equals (Nombre nomb) {
		if(!this.nombre.equals(nomb.nombre))
			return false;
		this.cant++;
		return true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}
	
	
}
