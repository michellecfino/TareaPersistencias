package mundo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;


public class ManejadorPersistencia {

	private Discotienda discotienda; 
	
	public ManejadorPersistencia(Discotienda disc) {
		
		discotienda = disc;
		
	}
    public void cargarInformacionDiscotienda()throws FileNotFoundException, IOException, ClassNotFoundException {
	
    	ObjectInputStream objeto = new ObjectInputStream(new FileInputStream(new File("./data/discos.mic")));
    	ArrayList<Disco> discos = (ArrayList<Disco>)objeto.readObject();
    	discotienda.setDiscos(discos);
    }
    
    public void presistirInfo() throws FileNotFoundException, IOException {
    	ObjectOutputStream objeto = new ObjectOutputStream(new FileOutputStream(new File("./data/discos.mic")));
    	objeto.writeObject(discotienda.getDiscos());
    	objeto.close();
    }

}



