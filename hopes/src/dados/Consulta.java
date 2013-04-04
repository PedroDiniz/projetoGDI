/*
 * CREATE OR REPLACE TYPE tp_consulta AS OBJECT
(
	data_entrada DATE,
	data_alta DATE,
	previsao_alta DATE,
	diagnostico VARCHAR2(150),
	paciente REF tp_paciente,
	medico REF tp_medico,
	enfermaria REF tp_enfermaria
);
/ 
 */
package dados;

public class Consulta {
	
	private String data_entrada;
	private String data_alta;
	private String previsao_alta;
	private String diagnostico;
	private String cpf_paciente;
	private String crm_medico;
	private String id_enfermaria;

	public Consulta(String data_entrada, String data_alta,
			String previsao_alta, String diagnostico, String paciente,
			String medico, String enfermaria) {
		super();
		this.data_entrada = data_entrada;
		this.data_alta = data_alta;
		this.previsao_alta = previsao_alta;
		this.diagnostico = diagnostico;
		this.cpf_paciente = paciente;
		this.crm_medico = medico;
		this.id_enfermaria = enfermaria;
	}
	
	public String getData_entrada() {
		return data_entrada;
	}
	public void setData_entrada(String data_entrada) {
		this.data_entrada = data_entrada;
	}
	public String getData_alta() {
		return data_alta;
	}
	public void setData_alta(String data_alta) {
		this.data_alta = data_alta;
	}
	public String getPrevisao_alta() {
		return previsao_alta;
	}
	public void setPrevisao_alta(String previsao_alta) {
		this.previsao_alta = previsao_alta;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getCpf_paciente() {
		return cpf_paciente;
	}

	public void setCpf_paciente(String cpf_paciente) {
		this.cpf_paciente = cpf_paciente;
	}

	public String getCrm_medico() {
		return crm_medico;
	}

	public void setCrm_medico(String crm_medico) {
		this.crm_medico = crm_medico;
	}

	public String getId_enfermaria() {
		return id_enfermaria;
	}

	public void setId_enfermaria(String id_enfermaria) {
		this.id_enfermaria = id_enfermaria;
	}
	
}
