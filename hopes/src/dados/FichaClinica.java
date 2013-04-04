/*
 * 

CREATE OR REPLACE TYPE tp_ficha_clinica AS OBJECT
(
   id_ficha_clinica NUMBER,
   grau NUMBER,
   status VARCHAR(1) 
);
/ 
 */
package dados;

public class FichaClinica {
	
	private String id_ficha_clinica;
	private String grau;
	private String status;
	
	public FichaClinica(String id_ficha_clinica, String grau, String status) {
		super();
		this.id_ficha_clinica = id_ficha_clinica;
		this.grau = grau;
		this.status = status;
	}

	public String getId_ficha_clinica() {
		return id_ficha_clinica;
	}
	public void setId_ficha_clinica(String id_ficha_clinica) {
		this.id_ficha_clinica = id_ficha_clinica;
	}
	public String getGrau() {
		return grau;
	}
	public void setGrau(String grau) {
		this.grau = grau;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
