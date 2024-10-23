package mundo;

import java.util.ArrayList;

public class Disco {

	private ArrayList<Cancion> canciones;
	private String nombre;
	private String artista;
	private int anio;
	
	public Disco(String nombre, String artista, int anio) {
		canciones = new ArrayList<Cancion>();
		this.nombre = nombre;
		this.artista = artista;
		this.anio = anio;
	}
	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}
	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public  String toString() {
		return "Nombre: "+ nombre + "||"+ "Artista: "+artista+"||"+"Año: "+anio;
	}
}
