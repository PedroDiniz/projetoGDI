package dados.repositorios;

import java.util.ArrayList;
import java.util.Iterator;

import dados.Enfermaria;


public class RepositorioEnfermaria {
	
	private ArrayList<Enfermaria> arrayListEnferamria;

	public RepositorioEnfermaria(ArrayList<Enfermaria> repositorioEnferamria) {
		super();
		this.arrayListEnferamria = repositorioEnferamria;
	}

	public ArrayList<Enfermaria> getRepositorioEnferamria() {
		return arrayListEnferamria;
	}

	public void setRepositorioEnferamria(ArrayList<Enfermaria> repositorioEnferamria) {
		this.arrayListEnferamria = repositorioEnferamria;
	}

	public boolean add(Enfermaria e) {
		return arrayListEnferamria.add(e);
	}

	public void clear() {
		arrayListEnferamria.clear();
	}

	public boolean contains(Object o) {
		return arrayListEnferamria.contains(o);
	}

	public Iterator<Enfermaria> iterator() {
		return arrayListEnferamria.iterator();
	}

	public boolean remove(Object o) {
		return arrayListEnferamria.remove(o);
	}
	
	

}
