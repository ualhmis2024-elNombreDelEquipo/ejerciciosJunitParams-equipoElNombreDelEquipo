package ual.hmis.sesion05.ejercicio3;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ual.hmis.sesion05.ejercicio3.*;

 class Ejercicio3Test {

	 @ParameterizedTest
	    @CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio3/archivo3.csv")
	    public void testEnmascararPassword(String input, String expectedOutput) {
		 Ejercicio3 ejprueba = new Ejercicio3();
	        assertEquals(expectedOutput, ejprueba.enmascararPassword(input));
	    }
}
