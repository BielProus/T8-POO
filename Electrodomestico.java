package tarea;

public class Electrodomestico {

	//Atributos
	private double precioBase;
	private String color;
	private String consumoEnergetico;
	private double peso;
	private String[] consumoLetra = {"A","B","C","D","F"};
	private String[] colores= {"blanco","negro","rojo","azul","gris"};
	int numColor, numConsumo;
	
	//Constructor por defecto
	public Electrodomestico() {
		this.precioBase=100;
		this.color=colores[0];
		this.consumoEnergetico=consumoLetra[4];
		this.peso=5;
	}
	
	//Contructor con el precio y peso, resto por defecto
	public Electrodomestico(double precioBase, double peso) {//contructor precio y peso, resto por defecto
		this.precioBase = precioBase;
		this.peso = peso;	
	}
	
	//Constructor con todos atributos
	public Electrodomestico(double precioBase, int color, double peso, String consumoEnergetico, int i) {
		this.precioBase = precioBase;
		this.color = colores[numColor];
		this.consumoEnergetico = consumoLetra[numConsumo];
		this.peso = peso;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public int getColor() {
		return numColor;
	}
	public int getConsumoEnergetico() {
		return numConsumo;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void Datos() {
		System.out.println("Precio base: " + getPrecioBase());
		System.out.println("Color: " + getColor());
		System.out.println("Consumo energetico: " + getConsumoEnergetico());
		System.out.println("Peso: " + getPeso());
	}
	
	public static void main(String[] args) {
		//Generamos el default
		Electrodomestico Default = new Electrodomestico();
		Default.Datos();
		System.out.println();
		
		Electrodomestico Biel = new Electrodomestico(1200.0,0,1,300.75);
		Biel.Datos();
	 }
}
