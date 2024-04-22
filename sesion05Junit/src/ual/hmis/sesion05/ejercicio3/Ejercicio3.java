package ual.hmis.sesion05.ejercicio3;

public class Ejercicio3 {
	static String resultado = "";

	public String enmascararPassword(String password) {
		int length = password.length();
		
		if (length < 5) {
			return "password demasiado corto";
		} else if (length <= 8)  {
			return "********";
		}
		if (length >= 12 && length <= 40) {
			return "************";
		}
		if (length > 40) {
			return "password demasiado largo";
		}
		for (int i = 0; i < length; i++) {
			resultado += "*";
		}
		return resultado;
	}
}
