package ual.hmis.sesion05.ejercicio5;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio5 { 
	
	public ArrayList<String> ordenAlfabetico(String filename) {
		String line = "";
		Scanner scan = null;
		ArrayList<String> result = new ArrayList<>();

		try {
			scan = new Scanner(new File(filename));
		} catch (Exception e) {
			System.out.println("Error al cargar el archivo --> " + e.getMessage());
			System.exit(-1);
		}
		
		line = scan.nextLine();
		
		String[] temp = line.toLowerCase().split(" ");
		
		for (String string : temp) {
			result.add(string);
		}
		
		Collections.sort(result);
		
		return result;
	}
}
