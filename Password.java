package tarea;

import java.security.SecureRandom;

public class Password {

	//Atributos
	private int longitud;
	private String contrasenya;
	//Array para generar contasenya aleatoria
	private String letrasNumeros = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private StringBuilder sb = new StringBuilder();
	private SecureRandom random = new SecureRandom();
	int i;
	
	//Constructor por defecto
	public Password() {
		this.longitud = longitud=8;
		this.contrasenya = "";
	}
	
	//Generador de contrasenyas a partir de la longitud
	public String Generador(int longitud) {
		for (i = 0; i < longitud; i++) {
			int randomSimbolo = random.nextInt(letrasNumeros.length());
	        sb.append(letrasNumeros.charAt(randomSimbolo));
	    }
		return sb.toString();
	}
	
	public int getLongitud() {
		return longitud;
	}
	
	public String getContrasenya() {
		return contrasenya;
	}
	
	public void Datos() {
		System.out.println("Longitud: " + getLongitud());
		System.out.println("Contraseña: " + getContrasenya());
	}
	
	public static void main(String[] args) {
		//Asignamos valores
		int longitud=5;
		String contrasenya;
		//Generamos el default
		Password Biel = new Password();
		Biel.Datos();
		
		//Generamos el generador
		contrasenya=Biel.Generador(longitud); 
		System.out.println(contrasenya);
	 }
}
