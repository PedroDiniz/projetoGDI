/*
 * CREATE OR REPLACE TYPE tp_paciente UNDER tp_pessoa
(  
lista_acompanhates tp_nt_acompanhante;
);
/ 
 */
package dados;

import java.util.ArrayList;

public class Paciente extends Pessoa{
	
	private ArrayList<Acompanhante> lista_acompanhantes;
	
	public Paciente(String cpf, String nome, String data_nascimento,
			String sexo, Endereco endereco, String[] telefones,
			ArrayList<Acompanhante> lista_acompanhantes) {
		super(cpf, nome, data_nascimento, sexo, endereco, telefones);
		this.lista_acompanhantes = lista_acompanhantes;
	}

	public ArrayList<Acompanhante> getLista_acompanhantes() {
		return lista_acompanhantes;
	}

	public void setLista_acompanhantes(ArrayList<Acompanhante> lista_acompanhantes) {
		this.lista_acompanhantes = lista_acompanhantes;
	}
	
}
