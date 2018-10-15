package DescubriendoNombresRepetidos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivo {
	public static ListaNombre leer(String path) throws FileNotFoundException {
		ListaNombre nombres = new ListaNombre();
		int cantNombre,cantRepetido;
		Scanner sc= new Scanner(new File(path));
		cantNombre = sc.nextInt();
		cantRepetido = sc.nextInt();
		sc.nextLine();
		for(int i=0 ; i<cantNombre;i++) {
			Nombre nomb= new Nombre(sc.nextLine());
			nombres.add(nomb);
		}
		
		nombres.setCantRepetidos(cantRepetido);
		sc.close();
		return nombres;
	}
	
	public static void escribir(String path, ListaNombre nombres) throws FileNotFoundException {
		PrintWriter pw= new PrintWriter(new File(path));
		boolean noHayRespuesta = true;
		for(Nombre nomb: nombres.getNombres()) {
			if(nomb.getCant()>=nombres.getCantRepetidos()) {
				pw.println( nomb.getNombre() + " " + nomb.getCant());
				if(noHayRespuesta) noHayRespuesta = false;
			}	
		}
		
		if(noHayRespuesta)
			pw.println("No se encontró nombres repetidos.");
		pw.close();
	}
}
