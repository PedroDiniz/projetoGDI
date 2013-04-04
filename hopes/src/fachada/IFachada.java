package fachada;

import java.io.IOException;
import java.sql.SQLException;


public interface IFachada {
	
	void inserir(int tipo, Object objeto) throws SQLException, IOException, ClassNotFoundException;
	void selecionar(int tipo, Object objeto) throws ClassNotFoundException, SQLException;
	void remover(int tipo, Object objeto);
	void atualizar(int tipo, Object objeto);
	
}
