package ual.hmis.sesion05.ejercicio5;

import java.io.File;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ual.hmis.sesion05.ejercicio5.*;

 public class Ejercicio5Test {

	 private static String directorioEntrada = System.getProperty("user.dir") + File.separator + "src"
				+ File.separator + "ual" +  File.separator + "hmis" + File.separator + "sesion05" +File.separator + "ejercicio5" +File.separator;
	 
	 public static void main(String[] args) {
		 
		 
		 Ejercicio5 ejPrueba = new Ejercicio5();
		 
		 ArrayList<String> prueba = ejPrueba.ordenAlfabetico(directorioEntrada + "HMIS.txt");
		 
		 System.out.println(prueba.toString());
	 }
}

