package ual.hmis.sesion05.ejercicio5;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

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

	public ArrayList<Pair<String, Integer>> ordenOcurrencia(String filename) {
		String line = "";
		Scanner scan = null;
		ArrayList<Pair<String, Integer>> result = new ArrayList<>();

		try {
			scan = new Scanner(new File(filename));
		} catch (Exception e) {
			System.out.println("Error al cargar el archivo --> " + e.getMessage());
			System.exit(-1);
		}

		line = scan.nextLine();

		String[] temp = line.toLowerCase().split(" ");

		for (String palabra : temp) {
			Pair<String, Integer> patata = new Pair<>(palabra, 1);
			int posicion = result.indexOf(patata);
			if (posicion != -1) {
				result.get(posicion).setValue(result.get(posicion).getValue() + 1);
			} else {
				result.add(patata);
			}
		}
		
		Collections.sort(result, new Comparator<Pair<String, Integer>>() {
			@Override
			public int compare(Pair<String, Integer> p1, Pair<String, Integer> p2) {
				return Integer.compare(p2.getValue(), p1.getValue());
			}
		});
	
		return result;
	}

}
