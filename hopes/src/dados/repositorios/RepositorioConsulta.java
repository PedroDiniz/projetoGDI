package dados.repositorios;

import java.util.ArrayList;
import java.util.Iterator;

import dados.Consulta;


public class RepositorioConsulta {

	private ArrayList<Consulta> arrayListConsulta;

	public RepositorioConsulta(ArrayList<Consulta> repositorioConsulta) {
		super();
		this.arrayListConsulta = repositorioConsulta;
	}

	public ArrayList<Consulta> getRepositorioConsulta() {
		return arrayListConsulta;
	}

	public void setRepositorioConsulta(ArrayList<Consulta> repositorioConsulta) {
		this.arrayListConsulta = repositorioConsulta;
	}

	public boolean add(Consulta e) {
		return arrayListConsulta.add(e);
	}

	public void clear() {
		arrayListConsulta.clear();
	}

	public boolean contains(Object o) {
		return arrayListConsulta.contains(o);
	}

	public Iterator<Consulta> iterator() {
		return arrayListConsulta.iterator();
	}

	public boolean remove(Object o) {
		return arrayListConsulta.remove(o);
	}
	
	
	
}
