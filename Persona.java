package tarea;

public class Persona {
	
	//Atributos
	private String nombre;
	private int edad;
	private String DNI;
	private String sexo;
	private double peso;
	private double altura;
	
	//Constructor por defecto
	public Persona() {
		this.nombre = nombre="";
		this.edad = edad=0;
		this.sexo = sexo="H";
		this.peso = peso=0;
		this.altura = altura=0;
	}
	
	//Constructor con el nombre, edad y sexo, el resto por defecto
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;	
		this.sexo = sexo;
	}
	
	//Constructor con todos los atributos como parametros
	public Persona(String nombre, int edad, String DNI, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
		
		public String getNombre() {
			return nombre;
		}
		
		public int getEdad() {
			return edad;
		}
		
		public String getDNI() {
			return DNI;
		}
		
		public String getSexo() {
			return sexo;
		}
		
		public double getPeso() {
			return peso;
		}
		
		public double getAltura() {
			return altura;
		}
		
		public void Datos() {
			System.out.println("Nombre: "+ getNombre());
			System.out.println("Edad: "+getEdad());
			System.out.println("Sexo: "+ getSexo());
			System.out.println("DNI: "+getDNI());
			System.out.println("Peso: "+ getPeso());
			System.out.println("Altura: "+ getAltura());
		}
		
		public static void main(String[] args) {
			//Persona Biel = new Persona();
			Persona Biel = new Persona("Biel",19,"H","39955382N",80,164);
			Biel.Datos();
		 }

}
