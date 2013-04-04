/*CREATE OR REPLACE TYPE tp_endereco AS OBJECT
(
    logradouro VARCHAR2(50),
    bairro VARCHAR2(20),
	numero NUMBER,
    complemento VARCHAR2(10), 
	uf VARCHAR2(2)
);
/ 
*/
package dados;

public class Endereco {
	
	private String logradouro;
	private String bairro;
	private String numero;
	private String complemento;
	private String uf;
	
	public Endereco(String logradouro, String bairro, String numero,
			String complemento, String uf) {
		super();
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.numero = numero;
		this.complemento = complemento;
		this.uf = uf;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
}
