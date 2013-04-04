package dados.repositorios;

import java.util.ArrayList;
import java.util.Iterator;

import dados.Medico;

public class RepositorioMedico {
	
	private ArrayList<Medico> arrayListMedicos;

	public RepositorioMedico(ArrayList<Medico> repositorioMedicos) {
		super();
		this.arrayListMedicos = repositorioMedicos;
	}

	public ArrayList<Medico> getRepositorioMedicos() {
		return arrayListMedicos;
	}

	public void setRepositorioMedicos(ArrayList<Medico> repositorioMedicos) {
		this.arrayListMedicos = repositorioMedicos;
	}

	public boolean add(Medico e) {
		return arrayListMedicos.add(e);
	}

	public void clear() {
		arrayListMedicos.clear();
	}

	public boolean contains(Object o) {
		return arrayListMedicos.contains(o);
	}

	public Iterator<Medico> iterator() {
		return arrayListMedicos.iterator();
	}

	public boolean remove(Object o) {
		return arrayListMedicos.remove(o);
	}
	
	
}
