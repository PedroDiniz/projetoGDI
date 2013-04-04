package oracle;

import java.sql.*;
import java.util.Iterator;
import dados.*;

public class Selecionar {
	public static Iterator<Consulta> selecionarConsulta() throws SQLException, ClassNotFoundException{
		Conexao.abrirConexao();
		Iterator<Consulta> iterator = null;   
		
		Statement stmt = Conexao.con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT Cod_Cliente,Nome,EMAIL FROM cliente");
		
		while(rs.next()) {
			String Cod_Cliente = rs.getString("Cod_Cliente");
			String Nome = rs.getString("Nome");
			String EMAIL = rs.getString("EMAIL");

		}
		
		Conexao.fecharConexao();
		return iterator;
	}

	public static Iterator<Enfermaria> selecionarEnfermaria() throws SQLException, ClassNotFoundException{
		Conexao.abrirConexao();
		Iterator<Enfermaria> iterator = null;
		
		//TODO Corpo do select
		
		Conexao.fecharConexao();
		return iterator;
	}
	
	public static Iterator<FichaAtendimento> selecionarFichaAtendimento() throws SQLException, ClassNotFoundException{
		Conexao.abrirConexao();
		Iterator<FichaAtendimento> iterator = null;
		
		//TODO Corpo do select
		
		Conexao.fecharConexao();
		return iterator;
	}
	
	public static Iterator<FichaClinica> selecionarFichaClinica() throws SQLException, ClassNotFoundException{
		Conexao.abrirConexao();
		Iterator<FichaClinica> iterator = null;
		
		//TODO Corpo do select
		
		
		Conexao.fecharConexao();
		return iterator;
	}
	
	public static Iterator<Medico> selecionarMedico() throws SQLException, ClassNotFoundException{
		Conexao.abrirConexao();
		Iterator<Medico> iterator = null;
		
		//TODO Corpo do select
		
		Conexao.fecharConexao();
		return iterator;
	}
	
	public static Iterator<Paciente> selecionarPaciente() throws SQLException, ClassNotFoundException{
		Conexao.abrirConexao();
		Iterator<Paciente> iterator = null;
		
		//TODO Corpo do select
		
		Conexao.fecharConexao();
		return iterator;
	}
	
	public static Iterator<ServidorGeral> selecionarServidorGeral() throws SQLException, ClassNotFoundException{
		Conexao.abrirConexao();
		Iterator<ServidorGeral> iterator = null;
		
		//TODO Corpo do select
		
		Conexao.fecharConexao();
		return iterator;
	}
}
