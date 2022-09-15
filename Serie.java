package tarea;

public class Serie {
	
	//Atributos
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	//Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}
	
	//Contructor con el titulo y creador, resto por defecto
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	
	//Constructor con todos atributos
	public Serie(String titulo, int numeroTemporadas, boolean entregado, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}
	public boolean getEntregado() {
		return entregado;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public String getCreador() {
		return creador;
	}
	
	public void Datos() {
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Numero Temporadas: " + getNumeroTemporadas());
		System.out.println("Entregado: " + getEntregado());
		System.out.println("Genero: " + getGenero());
		System.out.println("Creador: " + getCreador());
	}
		
	public static void main(String[] args) {
		//Generamos el default
		Serie Defecto = new Serie();
		Defecto.Datos();
		System.out.println();
		
		//Generamos el full		
		Serie Biel = new Serie("Squid Game",6,true,"Drama","Hwang Dong-Hyuk"); 
		Biel.Datos();
	}
}
