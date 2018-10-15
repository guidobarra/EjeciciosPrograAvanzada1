package DescubriendoNombresRepetidos;

import java.io.FileNotFoundException;

public class Prueba {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
//		Nombre n=new Nombre("guido");
		ListaNombre nombres = new ListaNombre();
//		nombres.add(new Nombre("guido"));
//		nombres.add(new Nombre("guido"));
//		nombres.add(new Nombre("guido"));
//		nombres.add(new Nombre("juan"));
//		nombres.add(new Nombre("juan"));
//		nombres.add(new Nombre("daria"));
//		nombres.add(new Nombre("daria"));
//		nombres.add(new Nombre("pedro"));
//		nombres.add(new Nombre("pedro"));
//		nombres.add(new Nombre("pedro"));
//		nombres.setCantRepetidos(3);
//		for (Nombre nom : nombres.getNombres()) {
//			System.out.println(nom.getNombre() + " " + nom.getCant());
//		}
		nombres = ( Archivo.leer("C:\\Users\\guido\\eclipse-workspace\\DescubriendoNombresRepetidos\\premioA.in"));
		Archivo.escribir("C:\\Users\\guido\\eclipse-workspace\\DescubriendoNombresRepetidos\\salida.out",nombres);
	}

}
