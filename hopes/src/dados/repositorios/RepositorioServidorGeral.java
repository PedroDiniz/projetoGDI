package dados.repositorios;

import java.util.ArrayList;
import java.util.Iterator;

import dados.ServidorGeral;


public class RepositorioServidorGeral {

	private ArrayList<ServidorGeral> arrayListServidores;

	public RepositorioServidorGeral(
			ArrayList<ServidorGeral> repositorioServidores) {
		super();
		this.arrayListServidores = repositorioServidores;
	}
	
	public ArrayList<ServidorGeral> getRepositorioServidores() {
		return arrayListServidores;
	}

	public void setRepositorioServidores(
			ArrayList<ServidorGeral> repositorioServidores) {
		this.arrayListServidores = repositorioServidores;
	}

	public boolean add(ServidorGeral e) {
		return arrayListServidores.add(e);
	}

	public void clear() {
		arrayListServidores.clear();
	}

	public boolean contains(Object o) {
		return arrayListServidores.contains(o);
	}

	public Iterator<ServidorGeral> iterator() {
		return arrayListServidores.iterator();
	}

	public boolean remove(Object o) {
		return arrayListServidores.remove(o);
	}

	
}
