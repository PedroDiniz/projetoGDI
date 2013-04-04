/*
 * CREATE OR REPLACE TYPE tp_acompanhante UNDER tp_pessoa
(
   vinculo_afetivo VARCHAR2(20)
);
/ 
 */
package dados;

public class Acompanhante extends Pessoa{

	private String vinculo_afetivo;
	
	public Acompanhante(String cpf, String nome, String data_nascimento,
			String sexo, Endereco endereco, String[] telefones,
			String vinculo_afetivo) {
		super(cpf, nome, data_nascimento, sexo, endereco, telefones);
		this.vinculo_afetivo = vinculo_afetivo;
	}

	public String getVinculo_afetivo() {
		return vinculo_afetivo;
	}

	public void setVinculo_afetivo(String vinculo_afetivo) {
		this.vinculo_afetivo = vinculo_afetivo;
	}
	
}
