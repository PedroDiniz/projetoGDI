/*CREATE OR REPLACE TYPE tp_pessoa AS OBJECT(
	cpf VARCHAR2(11),
    nome VARCHAR2(50),
	data_nascimento DATE,
	sexo CHAR,
    endereco tp_endereco, 
    telefones va_telefone
) NOT FINAL NOT INSTANTIABLE;
*/
package dados;

public class Pessoa {
	
	private String cpf;
	private String nome;
	private String data_nascimento;
	private String sexo;
	private Endereco endereco;
	private String[] telefones;
	
	public Pessoa(String cpf, String nome, String data_nascimento, String sexo,
			Endereco endereco, String[] telefones) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.data_nascimento = data_nascimento;
		this.sexo = sexo;
		this.endereco = endereco;
		this.telefones = telefones;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String[] getTelefones() {
		return telefones;
	}

	public void setTelefones(String[] telefones) {
		this.telefones = telefones;
	}
}
