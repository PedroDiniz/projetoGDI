package oracle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.sql.Statement;
import dados.*;

public class Deletar {
	
	/*
	 * data_entrada PRIMARY KEY, 0
	paciente WITH ROWID REFERENCES tb_paciente, 1
	medico WITH ROWID REFERENCES tb_medico, 2
	enfermaria WITH ROWID REFERENCES tb_enfermaria, 3
	 */
	public static void deletarConsulta(Consulta consulta) throws SQLException, IOException{

		Statement stmt = Conexao.con.createStatement();

		BufferedReader keyboard= new BufferedReader (new InputStreamReader(System.in));  
		String i;

		System.out.println("Digite o Código do Cliente que deseja Deletar: ");
		i = keyboard.readLine();  
		int codigo = Integer.parseInt(i);

		stmt.executeUpdate("DELETE FROM cliente Where Cod_Cliente = "+codigo+"");

		System.out.println("Dados deletados com sucesso!!! \n\n");

		//ResultSet rs1 = stmt.executeQuery("DELETE FROM cliente Where Cod_Cliente = '2'");

		//ResultSet rs2 = stmt.executeQuery("DELETE FROM cliente Where Cod_Cliente = '3'");
	}
	
	/*
	 * cpf PRIMARY KEY
	 */
	public static void deletarPaciente(String cpf) throws SQLException, IOException{
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("DELETE FROM tb_paciente WHERE cpf = "+cpf);
	}
	
	/*
	 * id_enfermaria PRIMARY KEY
	 */
	public static void deletarEnfermaria(String id_enfermaria) throws SQLException, IOException{
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("DELETE FROM tb_enfermaria WHERE id_enfermaria = "+id_enfermaria);
	}
	
	/*
	 * paciente WITH ROWID REFERENCES tb_paciente, 0
	id_ficha_clinica WITH ROWID REFERENCES tb_ficha_clinica, 1
	servidor WITH ROWID REFERENCES tb_servidor_geral, 2
	 */
	public static void deletarFichaAtendimento(String[] referencia) throws SQLException, IOException{
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("DELETE FROM tb_ficha_atendimento " +
				"WHERE paciente = "+referencia[0]+" AND id_ficha_clinica = "+referencia[1]+" AND servidor = "+referencia[2]);
	}
	
	/*
	 * id_ficha_clinica PRIMARY KEY
	 */
	public static void deletarFichaClinica(String id_ficha_clinica) throws SQLException, IOException{
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("DELETE FROM tb_ficha_clinica WHERE id_ficha_clinica = "+id_ficha_clinica);
	}
	
	/*
	 * data_hora_entrada PRIMARY KEY, 0
	paciente WITH ROWID REFERENCES tb_paciente, 1
	matricula WITH ROWID REFERENCES tb_servidor_geral, 2
	id_ficha_clinica WITH ROWID REFERENCES tb_ficha_clinica, 3
	 */
	public static void deletarGeraFicha(String[] referencia) throws SQLException, IOException{
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("DELETE FROM tb_gera_ficha " +
				"WHERE data_hora_entrada = "+referencia[0]+" AND paciente = "+referencia[1]+" AND matricula = "+referencia[2]+
				" AND id_ficha_clinica = "+referencia[3]);
	}

	/*
	 *  crm PRIMARY KEY,
	supervisor WITH ROWID REFERENCES tb_medico 
	 */
	public static void deletarMedico(String crm) throws SQLException, IOException{
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("DELETE FROM tb_medico WHERE crm = "+crm);
	}
	
	/*
	 * matricula PRIMARY KEY
	 */
	public static void deletarServidorGeral(String matricula) throws SQLException, IOException{
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("DELETE FROM tb_servidor_geral WHERE matricula = "+matricula);
	}

}

