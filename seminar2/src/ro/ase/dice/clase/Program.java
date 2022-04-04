package ro.ase.dice.clase;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		List<Aplicant> listaAngajati;
		IReader angajatiReader = new AngajatiReader("angajati.txt");
		try {
			listaAngajati = angajatiReader.readAplicants();
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
