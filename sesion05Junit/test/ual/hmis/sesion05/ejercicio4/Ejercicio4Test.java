package ual.hmis.sesion05.ejercicio4;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ual.hmis.sesion05.ejercicio4.*;
import java.util.*;

class Ejercicio4Test {

	@ParameterizedTest
	@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio4/archivoEj4.csv")
	void TestEjercicio4(String input1, String input2, String output) {

		List<String> lista1 = new ArrayList<>();
		List<String> lista2 = new ArrayList<>();
		List<String> result = new ArrayList<>();

		String[] temp;

		if (input1 != null) {
			temp = input1.split(";");
			System.out.println(temp);
			if (temp != null) {
				for (String string : temp) {
					lista1.add(string);
				}
			}
		}

		if (input2 != null) {
			temp = input2.split(";");

			if (temp != null) {
				for (String string : temp) {
					lista2.add(string);
				}
			}
		}

		if (output != null) {
			temp = output.split(";");

			if (temp != null) {
				for (String string : temp) {
					result.add(string);
				}
			}
		}

		Ejercicio4<String> ejercicio4 = new Ejercicio4<>();

		List<String> solucion = ejercicio4.MezclaLineal(lista1, lista2);

		Assert.assertEquals(solucion, result);
	}
}
