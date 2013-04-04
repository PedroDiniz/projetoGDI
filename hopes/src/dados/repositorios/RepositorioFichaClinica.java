package dados.repositorios;

import java.util.ArrayList;
import java.util.Iterator;

import dados.FichaClinica;


public class RepositorioFichaClinica {

	private ArrayList<FichaClinica> arrayListFichaClinica;
	
	
	public RepositorioFichaClinica(
			ArrayList<FichaClinica> repositorioFichaClinica) {
		super();
		this.arrayListFichaClinica = repositorioFichaClinica;
	}

	public ArrayList<FichaClinica> getRepositorioFichaClinica() {
		return arrayListFichaClinica;
	}

	public void setRepositorioServidores(
			ArrayList<FichaClinica> repositorioServidores) {
		this.arrayListFichaClinica = repositorioServidores;
	}

	public boolean add(FichaClinica e) {
		return arrayListFichaClinica.add(e);
	}

	public void clear() {
		arrayListFichaClinica.clear();
	}

	public boolean contains(Object o) {
		return arrayListFichaClinica.contains(o);
	}

	public Iterator<FichaClinica> iterator() {
		return arrayListFichaClinica.iterator();
	}

	public boolean remove(Object o) {
		return arrayListFichaClinica.remove(o);
	}
}
