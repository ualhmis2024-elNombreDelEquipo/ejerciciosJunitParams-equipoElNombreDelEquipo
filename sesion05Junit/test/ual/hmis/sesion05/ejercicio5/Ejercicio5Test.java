package ual.hmis.sesion05.ejercicio5;

import java.io.File;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ual.hmis.sesion05.ejercicio5.*;

public class Ejercicio5Test {

	private static String directorioEntrada = System.getProperty("user.dir") + File.separator + "src" + File.separator
			+ "ual" + File.separator + "hmis" + File.separator + "sesion05" + File.separator + "ejercicio5"
			+ File.separator;

	@ParameterizedTest
	@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio5/archivoEj5OrdenAlfabetico.csv")
	void TestEjercicio5OrdenAlfabetico(String input, String output) {

		Ejercicio5 ejPrueba = new Ejercicio5();

		String[] temp;

		ArrayList<String> result = new ArrayList<>();

		if (output != null) {
			temp = output.split(";");

			for (String string : temp) {
				result.add(string);

			}
		}

		ArrayList<String> solucion = ejPrueba.ordenAlfabetico(directorioEntrada + input);

		Assert.assertEquals(solucion, result);

	}
	
	
	@ParameterizedTest
	@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio5/archivoEj5OrdenOcurrencia.csv")
	void TestEjercicio5OrdenOcurrencia(String input, String output) {

		Ejercicio5 ejPrueba = new Ejercicio5();

		String[] temp;
		String[] temp1;

		ArrayList<Pair<String, Integer>> result = new ArrayList<>();

		if (output != null) {
			temp = output.split(";");
			
			for (String string : temp) {
				temp1 = string.split("-");
				Pair<String, Integer> par = new Pair<String, Integer>(temp1[0], Integer.parseInt(temp1[1]));
				result.add(par);

			}
		}

		ArrayList<Pair<String, Integer>> solucion = ejPrueba.ordenOcurrencia(directorioEntrada + input);

		Assert.assertEquals(solucion, result);

	}
	
}
