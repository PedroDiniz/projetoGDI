package fachada;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import dados.*;
import negocios.Negocios;

public class Fachada implements IFachada{

	private Negocios negocios;
	private Iterator<Consulta> iteratorConsulta;
	private Iterator<Enfermaria> iteratorEnfermaria;
	private Iterator<FichaAtendimento> iteratorFichaAtendimento;
	private Iterator<FichaClinica> iteratorFichaClinica;
	private Iterator<Medico> iteratorMedico;
	private Iterator<Paciente> iteratorPaciente;
	private Iterator<ServidorGeral> iteratorServidorGeral;
	
	public Fachada() {
		this.negocios = new Negocios();
	}
	
	/*
	 * SE 'tipo' FOR:
	 * 1 - Inserir Consulta
	 * 2 - Inserir Enfermaria
	 * 3 - FichaAtendimento
	 * 4 - FichaClinica
	 * 5 - Medico
	 * 6 - Paciente
	 * 7 - ServidorGeral
	 */

	@Override
	public void inserir(int tipo, Object objeto) throws SQLException, IOException, ClassNotFoundException {

		switch (tipo) {
		case 1:
			this.negocios.inserirConsulta(objeto);
			break;

		case 2:
			this.negocios.inserirEnfermaria(objeto);
			break;

		case 3:
			this.negocios.inserirFichaAtendimento(objeto);
			break;

		case 4:
			this.negocios.inserirFichaClinica(objeto);
			break;
			
		case 5:
			this.negocios.inserirMedico(objeto);
			break;
			
		case 6:
			this.negocios.inserirPaciente(objeto);
			break;
			
		case 7:
			this.negocios.inserirServidorGeral(objeto);
			break;

		default:
			break;
		}

	}

	@Override
	public void selecionar(int tipo, Object objeto) throws ClassNotFoundException, SQLException {
		switch (tipo) {
		case 1:
			this.setIteratorConsulta(this.negocios.selecionarConsulta(objeto));
			break;

		case 2:
			 this.setIteratorEnfermaria(this.negocios.selecionarEnfermaria(objeto));
			break;

		case 3:
			this.setIteratorFichaAtendimento(this.negocios.selecionarFichaAtendimento(objeto));
			break;

		case 4:
			this.setIteratorFichaClinica(this.negocios.selecionarFichaClinica(objeto));
			break;
			
		case 5:
			this.setIteratorMedico(this.negocios.selecionarMedico(objeto));
			break;
			
		case 6:
			this.setIteratorPaciente(this.negocios.selecionarPaciente(objeto));
			break;
			
		case 7:
			this.setIteratorServidorGeral(this.negocios.selecionarServidorGeral(objeto));
			break;

		default:
			break;
		}
	}
	
	public Negocios getNegocios() {
		return this.negocios;
	}

	public void setNegocios(Negocios negocios) {
		this.negocios = negocios;
	}
	
	//##################################### NAO NECESSARIO ###########################################
	
	public Iterator<Consulta> getIteratorConsulta() {
		return iteratorConsulta;
	}

	public void setIteratorConsulta(Iterator<Consulta> iteratorConsulta) {
		this.iteratorConsulta = iteratorConsulta;
	}

	public Iterator<Enfermaria> getIteratorEnfermaria() {
		return iteratorEnfermaria;
	}

	public void setIteratorEnfermaria(Iterator<Enfermaria> iteratorEnfermaria) {
		this.iteratorEnfermaria = iteratorEnfermaria;
	}

	public Iterator<FichaAtendimento> getIteratorFichaAtendimento() {
		return iteratorFichaAtendimento;
	}

	public void setIteratorFichaAtendimento(
			Iterator<FichaAtendimento> iteratorFichaAtendimento) {
		this.iteratorFichaAtendimento = iteratorFichaAtendimento;
	}

	public Iterator<FichaClinica> getIteratorFichaClinica() {
		return iteratorFichaClinica;
	}

	public void setIteratorFichaClinica(Iterator<FichaClinica> iteratorFichaClinica) {
		this.iteratorFichaClinica = iteratorFichaClinica;
	}

	public Iterator<Medico> getIteratorMedico() {
		return iteratorMedico;
	}

	public void setIteratorMedico(Iterator<Medico> iteratorMedico) {
		this.iteratorMedico = iteratorMedico;
	}

	public Iterator<Paciente> getIteratorPaciente() {
		return iteratorPaciente;
	}

	public void setIteratorPaciente(Iterator<Paciente> iteratorPaciente) {
		this.iteratorPaciente = iteratorPaciente;
	}

	public Iterator<ServidorGeral> getIteratorServidorGeral() {
		return iteratorServidorGeral;
	}

	public void setIteratorServidorGeral(
			Iterator<ServidorGeral> iteratorServidorGeral) {
		this.iteratorServidorGeral = iteratorServidorGeral;
	}

	@Override
	public void remover(int tipo, Object objeto) {
		switch (tipo) {
		case 1:
			this.negocios.removerConsulta(objeto);
			break;

		case 2:
			this.negocios.removerEnfermaria(objeto);
			break;

		case 3:
			this.negocios.removerFichaAtendimento(objeto);
			break;

		case 4:
			this.negocios.removerFichaClinica(objeto);
			break;
			
		case 5:
			this.negocios.removerMedico(objeto);
			break;
			
		case 6:
			this.negocios.removerPaciente(objeto);
			break;
			
		case 7:
			this.negocios.removerServidorGeral(objeto);
			break;

		default:
			break;
		}

	}

	@Override
	public void atualizar(int tipo, Object objeto) {
		switch (tipo) {
		case 1:
			this.negocios.atualizarConsulta(objeto);
			break;

		case 2:
			this.negocios.atualizarEnfermaria(objeto);
			break;

		case 3:
			this.negocios.atualizarFichaAtendimento(objeto);
			break;

		case 4:
			this.negocios.atualizarFichaClinica(objeto);
			break;
			
		case 5:
			this.negocios.atualizarMedico(objeto);
			break;
			
		case 6:
			this.negocios.atualizarPaciente(objeto);
			break;
			
		case 7:
			this.negocios.atualizarServidorGeral(objeto);
			break;

		default:
			break;
		}
	}

}
