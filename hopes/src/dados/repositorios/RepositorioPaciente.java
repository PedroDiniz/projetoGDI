package dados.repositorios;

import java.util.ArrayList;
import java.util.Iterator;

import dados.Paciente;


public class RepositorioPaciente {
	
	private ArrayList<Paciente> arrayListPacientes;

	public RepositorioPaciente(ArrayList<Paciente> repositorioPacientes) {
		super();
		this.arrayListPacientes = repositorioPacientes;
	}

	public ArrayList<Paciente> getRepositorioPacientes() {
		return arrayListPacientes;
	}

	public void setRepositorioPacientes(ArrayList<Paciente> repositorioPacientes) {
		this.arrayListPacientes = repositorioPacientes;
	}	

	public boolean add(Paciente e) {
		return arrayListPacientes.add(e);
	}

	public void clear() {
		arrayListPacientes.clear();
	}

	public boolean contains(Object o) {
		return arrayListPacientes.contains(o);
	}

	public boolean remove(Object o) {
		return arrayListPacientes.remove(o);
	}

	public Iterator<Paciente> iterator() {
		return arrayListPacientes.iterator();
	}
	
}
