/*
 * CREATE OR REPLACE TYPE tp_enfermaria AS OBJECT
(
	id_enfermaria NUMBER,
	qtd_leitos NUMBER,
	leitos_ocupados NUMBER
);
/ 
 */
package dados;

public class Enfermaria {
	
	private String id_enfermaria;
	private String qtd_leitos;
	private String leitos_ocupados;

	public Enfermaria(String id_enfermaria, String qtd_leitos,
			String leitos_ocupados) {
		super();
		this.id_enfermaria = id_enfermaria;
		this.qtd_leitos = qtd_leitos;
		this.leitos_ocupados = leitos_ocupados;
	}
	
	public String getId_enfermaria() {
		return id_enfermaria;
	}
	public void setId_enfermaria(String id_enfermaria) {
		this.id_enfermaria = id_enfermaria;
	}
	public String getQtd_leitos() {
		return qtd_leitos;
	}
	public void setQtd_leitos(String qtd_leitos) {
		this.qtd_leitos = qtd_leitos;
	}
	public String getLeitos_ocupados() {
		return leitos_ocupados;
	}
	public void setLeitos_ocupados(String leitos_ocupados) {
		this.leitos_ocupados = leitos_ocupados;
	}
	
}
