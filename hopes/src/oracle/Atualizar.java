package oracle;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import dados.*;

public class Atualizar {

	/*
	 * data_entrada PRIMARY KEY, 0
	paciente WITH ROWID REFERENCES tb_paciente, 1
	medico WITH ROWID REFERENCES tb_medico, 2
	enfermaria WITH ROWID REFERENCES tb_enfermaria, 3
	 */
	public static void atualizarConsulta(String atributo, String valor, String[] referencia) throws SQLException{
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("UPDATE cliente Set Nome = 'Danusa' SET "+atributo+" = "+valor+" WHERE");
	}
	
	/*
	 * cpf PRIMARY KEY
	 */
	public static void atualizarPaciente(String referencia, String atributo, String valor) throws SQLException, IOException{
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("UPDATE tb_paciente SET "+atributo+" = "+valor+" WHERE cpf = "+referencia);
	}
	
	/*
	 * id_enfermaria PRIMARY KEY
	 */
	public static void atualizarEnfermaria(String referencia, String atributo, String valor) throws SQLException, IOException{
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("UPDATE tb_enfermaria SET "+atributo+" = "+valor+" WHERE id_enfermaria = "+referencia);
	}
	
	/*
	 * paciente WITH ROWID REFERENCES tb_paciente, 0
	id_ficha_clinica WITH ROWID REFERENCES tb_ficha_clinica, 1
	servidor WITH ROWID REFERENCES tb_servidor_geral, 2
	 */
	public static void atualizarFichaAtendimento(String[] referencia, String atributo, String valor) throws SQLException, IOException{
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("UPDATE tb_ficha_atendimento SET "+atributo+" = "+valor+" SET "+atributo+" = "+valor+
				" WHERE paciente = "+referencia[0]+" AND id_ficha_clinica = "+referencia[1]+" AND servidor = "+referencia[2]);
	}
	
	/*
	 * id_ficha_clinica PRIMARY KEY
	 */
	public static void atualizarFichaClinica(String referencia, String atributo, String valor) throws SQLException, IOException{
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("UPDATE tb_ficha_clinica SET "+atributo+" = "+valor+" WHERE id_ficha_clinica = "+referencia);
	}
	
	/*
	 * data_hora_entrada PRIMARY KEY,
	paciente WITH ROWID REFERENCES tb_paciente,
	matricula WITH ROWID REFERENCES tb_servidor_geral,
	id_ficha_clinica WITH ROWID REFERENCES tb_ficha_clinica
	 */
	public static void atualizarGeraFicha(String[] referencia, String atributo, String valor) throws SQLException, IOException{
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("UPDATE tb_gera_ficha SET "+atributo+" = "+valor+
				" WHERE data_hora_entrada = "+referencia[0]+" AND paciente = "+referencia[1]+" AND matricula = "+referencia[2]+
				" AND id_ficha_clinica = "+referencia[3]);
	}
	
	/*
	 *  crm PRIMARY KEY,
	supervisor WITH ROWID REFERENCES tb_medico 
	 */
	public static void atualizarMedico(String referencia, String atributo, String valor) throws SQLException, IOException{
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("UPDATE tb_medico SET "+atributo+" = "+valor+" WHERE crm = "+referencia);
	}

	/*
	 * matricula PRIMARY KEY
	 */
	public static void atualizarServidorGeral(String referencia, String atributo, String valor) throws SQLException, IOException{
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("UPDATE tb_servidor_geral SET "+atributo+" = "+valor+" WHERE matricula = "+referencia);
	}

}


