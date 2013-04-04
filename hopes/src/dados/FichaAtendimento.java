/*
 * 
CREATE OR REPLACE TYPE tp_ficha_atendimento AS OBJECT
(
	data_hora_entrada DATE,
	servidor REF tp_servidor_geral,
	paciente REF tp_paciente,
	id_ficha_clinica REF tp_ficha_clinica
);
/ 

 */
package dados;

public class FichaAtendimento {

	private String data_hora_entrada;
	private String matricula_servidor;
	private String cpf_paciente;
	private String id_ficha_clinica;

	public FichaAtendimento(String data_hora_entrada, String servidor,
			String paciente, String id_ficha_clinica) {
		super();
		this.data_hora_entrada = data_hora_entrada;
		this.matricula_servidor = servidor;
		this.cpf_paciente = paciente;
		this.id_ficha_clinica = id_ficha_clinica;
	}
	
	public String getData_hora_entrada() {
		return data_hora_entrada;
	}
	public void setData_hora_entrada(String data_hora_entrada) {
		this.data_hora_entrada = data_hora_entrada;
	}
	public String getId_ficha_clinica() {
		return id_ficha_clinica;
	}
	public void setId_ficha_clinica(String id_ficha_clinica) {
		this.id_ficha_clinica = id_ficha_clinica;
	}
	public String getMatricula_servidor() {
		return matricula_servidor;
	}
	public void setMatricula_servidor(String matricula_servidor) {
		this.matricula_servidor = matricula_servidor;
	}
	public String getCpf_paciente() {
		return cpf_paciente;
	}
	public void setCpf_paciente(String cpf_paciente) {
		this.cpf_paciente = cpf_paciente;
	}
	
}
