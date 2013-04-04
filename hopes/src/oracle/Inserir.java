package oracle;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import dados.*;

public class Inserir {

	/*
	 * INSERT INTO tb_consulta VALUES(TO_DATE('10/03/2013', 'DD/MM/YYYY'), null, TO_DATE('10/05/2013', 'DD/MM/YYYY'),'AIDS', 
	(select ref(p) from tb_paciente p where p.cpf = '17082218591'), (select ref(m) from tb_medico m where m.crm = '201368524670'), 
	(select ref(enf) from tb_enfermaria enf where enf.id_enfermaria = 1));
	 */
	public static void inserirConsulta(Consulta consulta) throws SQLException, IOException, ClassNotFoundException{
		Conexao.abrirConexao();
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("INSERT INTO cliente VALUES(TO_DATE('"+consulta.getData_entrada()+
				"', 'DD/MM/YYYY'), TO_DATE('"+consulta.getData_alta()+
				"', 'DD/MM/YYYY'), TO_DATE('"+consulta.getPrevisao_alta()+
				"', 'DD/MM/YYYY'), '"+consulta.getDiagnostico()+
				"', (select ref(p) from tb_paciente p where p.cpf = '"+consulta.getCpf_paciente()+
				"'), (select ref(m) from tb_medico m where m.crm = '"+consulta.getCrm_medico()+
				"'), (select ref(enf) from tb_enfermaria enf where enf.id_enfermaria = "+consulta.getId_enfermaria()+"))");
		stmt.close();
		Conexao.fecharConexao();
	}

	/*
	 * INSERT INTO tb_paciente VALUES 
	('17082218591', 'Joaquim José da Silva Xavier', TO_DATE('01/02/1845', 'DD/MM/YYYY'), 'M', tp_endereco('Av. Agamenon Magalhães', 'Derby', 350, 'apt.201', 'PE'), va_telefone('21214242', '21011111'), 
	lista_acompanhantes(
		tp_acompanhante('85465563427', 'Bruna Surfistinha', TO_DATE('08/09/1985', 'DD/MM/YYYY'), 'F',
	tp_endereco('Av. Conselheiro Aguiar', 'Boa Viagem', 1420, 'apt.302', 'PE'), va_telefone('82203189', '92199190', '72112702', '99217291'),
	(select ref(p) from tb_paciente p where p.cpf = '17082218591'), 'Cliente')
	)
	);
	 */
	public static void inserirPaciente(Paciente paciente) throws SQLException, IOException, ClassNotFoundException{
		Conexao.abrirConexao();
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("INSERT INTO tb_paciente VALUES()");
		stmt.close();
		Conexao.fecharConexao();
	}

	/*
	 * INSERT INTO tb_enfermaria VALUES (1, 10, 5);
	 */
	public static void inserirEnfermaria(Enfermaria enfermaria) throws SQLException, IOException, ClassNotFoundException{
		Conexao.abrirConexao();
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("INSERT INTO tb_enfermaria VALUES("+enfermaria.getId_enfermaria()+", "+enfermaria.getQtd_leitos()+
				", "+enfermaria.getLeitos_ocupados()+")");
		stmt.close();
		Conexao.fecharConexao();
	}

	/*
	 * INSERT INTO tb_ficha_atendimento VALUES (TO_DATE('02/03/2012', 'DD/MM/YYYY'), (select ref(serv) from tb_servidor_geral serv where serv.cpf = '10391820987'),
	(select ref(p) from tb_paciente p where p.cpf = '17082218591'), (select ref(fc) from tb_ficha_clinica fc where fc.id_ficha_clinica = 1));

	 */
	public static void inserirFichaAtendimento(FichaAtendimento fichaAtendimento) throws SQLException, IOException, ClassNotFoundException{
		Conexao.abrirConexao();
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("INSERT INTO tb_ficha_atendimento VALUES(TO_DATE('"+fichaAtendimento.getData_hora_entrada()+"', 'DD/MM/YYYY'), " +
				"(select ref(p) from tb_paciente p where p.cpf = '"+fichaAtendimento.getCpf_paciente()+
				"'), select ref(sv) from tb_servidor_geral sv where sv.cpf = '"+fichaAtendimento.getMatricula_servidor()+
				"'), select ref(fc) from tb_ficha_clinica fc where fc.id_ficha_clinica ="+fichaAtendimento.getId_ficha_clinica()+"))");
		stmt.close();
		Conexao.fecharConexao();
	}

	/*
	 * INSERT INTO tb_ficha_clinica VALUES(1, 3, '1');
	 */
	public static void inserirFichaClinica(FichaClinica fichaClinica) throws SQLException, IOException, ClassNotFoundException{
		Conexao.abrirConexao();
		Statement stmt = Conexao.con.createStatement();
		stmt.executeUpdate("INSERT INTO tb_ficha_clinica VALUES("+fichaClinica.getId_ficha_clinica()+", "+fichaClinica.getGrau()+", '"+fichaClinica.getStatus()+"')");
		stmt.close();
		Conexao.fecharConexao();
	}

	/*
	 * INSERT INTO tb_medico VALUES ('20136852467', 'Gregory House', TO_DATE('15/10/1961', 'DD/MM/YYYY'), 'M',
	tp_endereco('Rua do Espinheiro', 'Espinheiro', 723, 'apt.1102', 'PE'), va_telefone('88993432'), '201368524670', '1', null);
	 */
	public static void inserirMedico(Medico medico) throws SQLException, IOException, ClassNotFoundException{
		Conexao.abrirConexao();
		Statement stmt = Conexao.con.createStatement();
		String telefones = "";
		for (int i = 0; i < medico.getTelefones().length; i++) {
			if(medico.getTelefones().length != 0){
				if(i == medico.getTelefones().length-1){
					telefones += "'"+medico.getTelefones()[i]+"'";
				} else {
					telefones += "'"+medico.getTelefones()[i]+"', ";
				}
			} else {
				telefones = "";
			}
		}
		stmt.executeUpdate("INSERT INTO tb_medico VALUES('"+medico.getCpf()+"', '"+medico.getNome()+
				"', TO_DATE("+medico.getData_nascimento()+", 'DD/MM/YYYY'), '"+medico.getSexo()+"', tp_endereco('"+medico.getEndereco().getLogradouro()+
				"', '"+medico.getEndereco().getBairro()+"', "+medico.getEndereco().getNumero()+", '"+medico.getEndereco().getComplemento()+
				"', '"+medico.getEndereco().getUf()+"'), va_telefone("+telefones+"), '"+medico.getCrm()+"', '"+medico.getAtivo()+
				"', '"+medico.getSupervisor()+"')");
		stmt.close();
		Conexao.fecharConexao();
	}

	/*
	 * INSERT INTO tb_servidor_geral VALUES ('10391820987', 'Vera Fischer', TO_DATE('23/09/1923', 'DD/MM/YYYY'), 'F', 
	tp_endereco('Rua da Hora', 'Espinheiro', 200, 'apt.102', 'PE'), va_telefone('42190121'), '103918209870', '1');
	 */
	public static void inserirServidorGeral(ServidorGeral servidorGeral) throws SQLException, IOException, ClassNotFoundException{
		Conexao.abrirConexao();
		Statement stmt = Conexao.con.createStatement();
		String telefones = "";
		for (int i = 0; i < servidorGeral.getTelefones().length; i++) {
			if(servidorGeral.getTelefones().length != 0){
				if(i == servidorGeral.getTelefones().length-1){
					telefones += "'"+servidorGeral.getTelefones()[i]+"'";
				} else {
					telefones += "'"+servidorGeral.getTelefones()[i]+"', ";
				}
			} else {
				telefones = "";
			}
		}
		stmt.executeUpdate("INSERT INTO tb_servidor_geral VALUES('"+servidorGeral.getCpf()+", "+servidorGeral.getNome()+
				", TO_DATE("+servidorGeral.getData_nascimento()+", 'DD/MM/YYYY'), '"+servidorGeral.getSexo()+"', tp_endereco('"+servidorGeral.getEndereco().getLogradouro()+
				"', '"+servidorGeral.getEndereco().getBairro()+"', '"+servidorGeral.getEndereco().getNumero()+"', '"+servidorGeral.getEndereco().getComplemento()+
				"', '"+servidorGeral.getEndereco().getUf()+"'), va_telefone("+telefones+"), '"+servidorGeral.getMatricula()+"', '"+servidorGeral.getAtivo()+"')");
		stmt.close();
		Conexao.fecharConexao();
	}
}