package mundo;

import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Discotienda {

	private ArrayList<Disco> discos;

	public Discotienda() {
		discos = new ArrayList<Disco>();
	}

	public ArrayList<Disco> getDiscos() {
		return discos;
	}

	public void setDiscos(ArrayList<Disco> discos) {
		this.discos = discos;
	}
	
	public void agregarDisco(String nombre, String artista, int anio) {
		Disco nuevo = new Disco(nombre, artista, anio);
		discos.add(nuevo);
	}
	
	public void imprimirDiscos() {
		for(Disco disco:discos) {
			System.out.println(disco);
			
			
		}
	}

	public static void main(String[] args) {
		Discotienda d = new Discotienda();
		d.agregarDisco( "Bangerz","Hanna Montana", 2014);
		d.agregarDisco("Moonlit Floor", "Lisa", 2024);
		d.agregarDisco("1989", "Taylor Swift", 2014);
		d.agregarDisco("The Fame", "Lady Gaga", 2008);
	
		ManejadorPersistencia manejador = new ManejadorPersistencia(d);
		try {
			manejador.presistirInfo();}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	
	
		try {
			manejador.cargarInformacionDiscotienda();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	   	d.imprimirDiscos();
	   	
	}
	
	
	
	
}
