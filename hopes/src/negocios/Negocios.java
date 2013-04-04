package negocios;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import dados.*;
import oracle.*;

public class Negocios implements INegocios{

	//Pelo exemplo dela parece não precisar instanciar os atributos.
	//	private Deletar deletarBanco;
	//	private Inserir inserirBanco;
	//	private Atualizar atualizarBanco;
	//	private Selecionar selectBanco;

	public Negocios(){
	}

	@Override
	public void inserirConsulta(Object objeto) throws SQLException, IOException, ClassNotFoundException {
		Consulta consulta = (Consulta) objeto;
		Inserir.inserirConsulta(consulta);
	}

	@Override
	public void inserirEnfermaria(Object objeto) throws SQLException, IOException, ClassNotFoundException{
		Enfermaria enfermaria = (Enfermaria) objeto;
		Inserir.inserirEnfermaria(enfermaria);
	}

	@Override
	public void inserirFichaAtendimento(Object objeto) throws SQLException, IOException, ClassNotFoundException{
		FichaAtendimento fichaAtendimento = (FichaAtendimento) objeto;
		Inserir.inserirFichaAtendimento(fichaAtendimento);
	}

	@Override
	public void inserirFichaClinica(Object objeto) throws SQLException, IOException, ClassNotFoundException{
		FichaClinica fichaClinica = (FichaClinica) objeto;
		Inserir.inserirFichaClinica(fichaClinica);
	}
	
	
	@Override
	public void inserirMedico(Object objeto) throws SQLException, IOException, ClassNotFoundException{
		Medico medico = (Medico) objeto;
		Inserir.inserirMedico(medico);
	}

	@Override
	public void inserirPaciente(Object objeto) throws SQLException, IOException, ClassNotFoundException{
		Paciente paciente = (Paciente) objeto;
		Inserir.inserirPaciente(paciente);
	}

	@Override
	public void inserirServidorGeral(Object objeto) throws SQLException, IOException, ClassNotFoundException{
		ServidorGeral servidorGeral = (ServidorGeral) objeto;
		Inserir.inserirServidorGeral(servidorGeral);
	}


	@Override
	public Iterator<Consulta> selecionarConsulta(Object objeto) throws ClassNotFoundException, SQLException {
		return Selecionar.selecionarConsulta();
	}

	@Override
	public Iterator<Enfermaria> selecionarEnfermaria(Object objeto) throws ClassNotFoundException, SQLException {
		return Selecionar.selecionarEnfermaria();
	}

	@Override
	public Iterator<FichaAtendimento> selecionarFichaAtendimento(Object objeto) throws ClassNotFoundException, SQLException {
		return Selecionar.selecionarFichaAtendimento();
	}

	@Override
	public Iterator<FichaClinica> selecionarFichaClinica(Object objeto) throws ClassNotFoundException, SQLException {
		return Selecionar.selecionarFichaClinica();
	}
	
	@Override
	public Iterator<Medico> selecionarMedico(Object objeto) throws ClassNotFoundException, SQLException {
		return Selecionar.selecionarMedico();
	}

	@Override
	public Iterator<Paciente> selecionarPaciente(Object objeto) throws ClassNotFoundException, SQLException {
		return Selecionar.selecionarPaciente();
	}

	@Override
	public Iterator<ServidorGeral> selecionarServidorGeral(Object objeto) throws ClassNotFoundException, SQLException {
		return Selecionar.selecionarServidorGeral();
	}

	//################################# NAO NECESSARIO ##########################################
	
	@Override
	public void removerConsulta(Object objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removerEnfermaria(Object objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removerFichaAtendimento(Object objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removerFichaClinica(Object objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removerMedico(Object objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removerPaciente(Object objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removerServidorGeral(Object objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarConsulta(Object objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarEnfermaria(Object objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarFichaAtendimento(Object objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarFichaClinica(Object objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarMedico(Object objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarPaciente(Object objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarServidorGeral(Object objeto) {
		// TODO Auto-generated method stub

	}
}

