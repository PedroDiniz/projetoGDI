package negocios;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;

import dados.*;

public interface INegocios {
	
	void inserirConsulta(Object objeto) throws SQLException, IOException, ClassNotFoundException; 
	void inserirEnfermaria(Object objeto) throws SQLException, IOException, ClassNotFoundException;;
	void inserirFichaAtendimento(Object objeto) throws SQLException, IOException, ClassNotFoundException;;
	void inserirFichaClinica(Object objeto) throws SQLException, IOException, ClassNotFoundException;;
	void inserirMedico(Object objeto) throws SQLException, IOException, ClassNotFoundException;;
	void inserirPaciente(Object objeto) throws SQLException, IOException, ClassNotFoundException;;
	void inserirServidorGeral(Object objeto) throws SQLException, IOException, ClassNotFoundException;;
	
	Iterator<Consulta> selecionarConsulta(Object objeto) throws ClassNotFoundException, SQLException;
	Iterator<Enfermaria> selecionarEnfermaria(Object objeto) throws ClassNotFoundException, SQLException;
	Iterator<FichaAtendimento> selecionarFichaAtendimento(Object objeto) throws ClassNotFoundException, SQLException;
	Iterator<FichaClinica> selecionarFichaClinica(Object objeto) throws ClassNotFoundException, SQLException;
	Iterator<Medico> selecionarMedico(Object objeto) throws ClassNotFoundException, SQLException;
	Iterator<Paciente> selecionarPaciente(Object objeto) throws ClassNotFoundException, SQLException;
	Iterator<ServidorGeral> selecionarServidorGeral(Object objeto) throws ClassNotFoundException, SQLException;
	
	//######################### NAO NECESSARIO ####################################33
	
	void removerConsulta(Object objeto);
	void removerEnfermaria(Object objeto);
	void removerFichaAtendimento(Object objeto);
	void removerFichaClinica(Object objeto);
	void removerMedico(Object objeto);
	void removerPaciente(Object objeto);
	void removerServidorGeral(Object objeto);
	
	void atualizarConsulta(Object objeto);
	void atualizarEnfermaria(Object objeto);
	void atualizarFichaAtendimento(Object objeto);
	void atualizarFichaClinica(Object objeto);
	void atualizarMedico(Object objeto);
	void atualizarPaciente(Object objeto);
	void atualizarServidorGeral(Object objeto);
	
}
