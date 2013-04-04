/*
 * CREATE TABLE tb_medico OF tp_medico
(
    crm PRIMARY KEY,
	supervisor WITH ROWID REFERENCES tb_medico 
);
 */
package dados;

public class Medico extends Pessoa{
	
	private String crm;
	private Medico supervisor;
	private String ativo;
	//private BLOB foto;
	
	public Medico(String cpf, String nome, String data_nascimento, String sexo,
			Endereco endereco, String[] telefones, String crm, Medico supervisor,String ativo) {
		super(cpf, nome, data_nascimento, sexo, endereco, telefones);
		this.crm = crm;
		this.supervisor = supervisor;
		this.ativo = ativo;
	}
	
	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	
	public String getCrm() {
		return crm;
	}
	
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	public Medico getSupervisor() {
		return supervisor;
	}
	
	public void setSupervisor(Medico supervisor) {
		this.supervisor = supervisor;
	}
	
}
