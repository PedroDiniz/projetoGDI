package dados.repositorios;

import java.util.ArrayList;
import java.util.Iterator;

import dados.FichaAtendimento;


public class RepositorioFichaAtendimento {

	private ArrayList<FichaAtendimento> arrayListFichaAtendimento;

	public RepositorioFichaAtendimento(
			ArrayList<FichaAtendimento> repositorioFichaAtendimento) {
		super();
		this.arrayListFichaAtendimento = repositorioFichaAtendimento;
	}

	public ArrayList<FichaAtendimento> getRepositorioFichaAtendimento() {
		return arrayListFichaAtendimento;
	}

	public void setRepositorioFichaAtendimento(
			ArrayList<FichaAtendimento> repositorioFichaAtendimento) {
		this.arrayListFichaAtendimento = repositorioFichaAtendimento;
	}

	public boolean add(FichaAtendimento e) {
		return arrayListFichaAtendimento.add(e);
	}

	public void clear() {
		arrayListFichaAtendimento.clear();
	}

	public boolean contains(Object o) {
		return arrayListFichaAtendimento.contains(o);
	}

	public Iterator<FichaAtendimento> iterator() {
		return arrayListFichaAtendimento.iterator();
	}

	public boolean remove(Object o) {
		return arrayListFichaAtendimento.remove(o);
	}
	
	
}
