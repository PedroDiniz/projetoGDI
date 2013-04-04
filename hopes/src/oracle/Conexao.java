package oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection con;
	public static String url = "jdbc:oracle:thin@itapissuma.cin.ufpe.br/oracle11g_Instance01";
	public static String user = "G122IF685CC_EQ05";
	public static String password = "G122IF685CC_EQ05";

	public static void abrirConexao() throws ClassNotFoundException, SQLException {

		// Login: G122IF685CC_EQ05
		// Pass: G122IF685CC_EQ05
		// String: oracle11g_Instance01

		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url,user,password);
		System.out.println("Conexao Realizada");
		
	}

	public static void fecharConexao() throws SQLException{
		con.close();
	}
	
	public static boolean testarConexao() throws SQLException {
		if(con.isClosed()){
			return false;
		} else{
			return true;
		}
	}

}
