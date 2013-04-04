/*
 * CREATE TABLE tb_servidor_geral OF tp_servidor_geral
(
    matricula PRIMARY KEY
);
 */
package dados;

public class ServidorGeral extends Pessoa {
	
	private String matricula;
	private String ativo;

	public ServidorGeral(String cpf, String nome, String data_nascimento,
			String sexo, Endereco endereco, String[] telefones, String matricula, String ativo) {
		super(cpf, nome, data_nascimento, sexo, endereco, telefones);
		this.matricula = matricula;
		this.ativo = ativo;
	}
	
	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
