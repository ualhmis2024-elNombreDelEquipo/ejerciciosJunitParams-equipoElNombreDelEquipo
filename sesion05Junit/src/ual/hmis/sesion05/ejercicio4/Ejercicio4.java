package ual.hmis.sesion05.ejercicio4;
import java.util.*;

public class Ejercicio4<T> {

	
	public List<T> MezclaLineal(List<T> lista1, List<T> lista2){
		
		if(lista1 == null && lista2 == null) {
			return null;
		}
		
		if(lista1 == null) {
			lista2.sort(null);
			return lista2;
		}
		
		if(lista2 == null) {
			lista1.sort(null);
			return lista1;
		}
		
		if(lista1.isEmpty() && lista2.isEmpty()) {
			return lista1;
		}
		
		if(lista2.isEmpty()) {
			lista1.sort(null);
			return lista1;
		}
		
		if(lista1.isEmpty()) {
			lista2.sort(null);
			return lista2;
		}
		
		for (T elemento : lista2) {
			
			if(!lista1.contains(elemento)) {
				lista1.add(elemento);
			}
			
		}
		
		lista1.sort(null);	
		return lista1;
	}
}
