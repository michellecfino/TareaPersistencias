package mundo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class ManejadorPersistencia {

	private Discotienda discotienda; 
	
	public ManejadorPersistencia(Discotienda disc) {
		
		discotienda = disc;
		
	}
    public void guardarDiscotienda()throws FileNotFoundException {
	
    	PrintWriter escritor = new PrintWriter(new File("./data/discos.txt"));
	
    	ArrayList<Disco> discos = discotienda.getDiscos();
	
    	for(Disco d:discos) {

		escritor.println(d.getNombre()+";"+d.getArtista()+";"+d.getAnio());
	}
	escritor.close();
}
	public void leerCurso() throws IOException {
		ArrayList<Disco> discos = new ArrayList<Disco>();
		
		File f = new File("./data/discos.txt");
		BufferedReader lector = new BufferedReader(new FileReader(f));
		String linea = lector.readLine();
		while(linea!=null) {
			//El formato del archivo es: <nombre>;<artista>;<anio>
			String[] datos = linea.split(";"); // [<nombre>] [<artista>] [<anio>]
			String nombre = datos[0];
			String artista = datos[1];
			int anio = Integer.parseInt(datos[2]);
			Disco nuevo = new Disco(nombre, artista, anio);
			discos.add(nuevo);
			linea = lector.readLine();
		}
		lector.close();
		discotienda.setDiscos(discos);
	}

}



