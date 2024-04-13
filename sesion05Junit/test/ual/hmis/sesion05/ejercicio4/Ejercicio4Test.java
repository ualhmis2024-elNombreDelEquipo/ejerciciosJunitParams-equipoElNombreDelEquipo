package ual.hmis.sesion05.ejercicio4;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ual.hmis.sesion05.ejercicio4.*;
import java.util.*;

 class Ejercicio4Test {

	 @Test
	 void TestAmbosNull() {
		 
		 List<Integer> lista1 = null;
		 List<Integer> lista2 = null;
		 
		 Ejercicio4<Integer> ejercicio4 = new Ejercicio4<>();
		 
		 List<Integer> solucion = ejercicio4.MezclaLineal(lista1, lista2);
		 
		 Assert.assertEquals(solucion, null);
	 }
	 
	 @Test
	 void TestPrimeroNull() {
		 
		 List<Integer> lista1 = new ArrayList<>();
		 List<Integer> lista2 = null;
		 
		 lista1.add(3);
		 lista1.add(5);
		 lista1.add(1);
		 
		 Ejercicio4<Integer> ejercicio4 = new Ejercicio4<>();
		 
		 List<Integer> solucion = ejercicio4.MezclaLineal(lista1, lista2);
		 
		 lista1.sort(null);
		 
		 Assert.assertEquals(solucion, lista1);
	 }
	 
	 @Test
	 void TestSegundoNull() {
		 
		 List<Integer> lista1 = null;
		 List<Integer> lista2 = new ArrayList<>();
		 
		 lista2.add(3);
		 lista2.add(5);
		 lista2.add(1);
		 
		 Ejercicio4<Integer> ejercicio4 = new Ejercicio4<>();
		 
		 List<Integer> solucion = ejercicio4.MezclaLineal(lista1, lista2);
		 
		 lista2.sort(null);
		 
		 Assert.assertEquals(solucion, lista2);
	 }
	 
	 @Test
	 void TestAmbosVacios() {
		 
		 List<Integer> lista1 = new ArrayList<>();
		 List<Integer> lista2 = new ArrayList<>();
		 
		 Ejercicio4<Integer> ejercicio4 = new Ejercicio4<>();
		 
		 List<Integer> solucion = ejercicio4.MezclaLineal(lista1, lista2);
		 
		 Assert.assertEquals(solucion, new ArrayList<>());
	 }
	 
	 @Test
	 void TestPrimeroVacio() {
		 
		 List<Integer> lista1 = new ArrayList<>();
		 List<Integer> lista2 = new ArrayList<>();
		 
		 lista1.add(3);
		 lista1.add(5);
		 lista1.add(1);
		 
		 Ejercicio4<Integer> ejercicio4 = new Ejercicio4<>();
		 
		 List<Integer> solucion = ejercicio4.MezclaLineal(lista1, lista2);
		 
		 lista1.sort(null);
		 
		 Assert.assertEquals(solucion, lista1);
	 }
	 
	 @Test
	 void TestSegundoVacio() {
		 
		 List<Integer> lista1 = new ArrayList<>();
		 List<Integer> lista2 = new ArrayList<>();
		 
		 lista2.add(3);
		 lista2.add(5);
		 lista2.add(1);
		 
		 Ejercicio4<Integer> ejercicio4 = new Ejercicio4<>();
		 
		 List<Integer> solucion = ejercicio4.MezclaLineal(lista1, lista2);
		 
		 lista2.sort(null);
		 
		 Assert.assertEquals(solucion, lista2);
	 }
	 
	 @Test
	 void TestNingunoVacio() {
		 List<Integer> lista1 = new ArrayList<>();
		 List<Integer> lista2 = new ArrayList<>();
		 List<Integer> lista3 = new ArrayList<>();
		 
		 lista1.add(1);
		 lista1.add(2);
		 lista1.add(3);
		 lista1.add(4);
		 
		 
		 lista2.add(3);
		 lista2.add(5);
		 lista2.add(1);
		 
		 lista3.add(1);
		 lista3.add(2);
		 lista3.add(3);
		 lista3.add(4);
		 lista3.add(5);
		 
		 Ejercicio4<Integer> ejercicio4 = new Ejercicio4<>();
		 
		 List<Integer> solucion = ejercicio4.MezclaLineal(lista1, lista2);
		 
		 lista2.sort(null);
		 
		 Assert.assertEquals(solucion, lista3);
	 }
}
