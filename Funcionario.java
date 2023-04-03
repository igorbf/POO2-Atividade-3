import java.util.ArrayList;

public class Funcionario {
	
	private String nome;
	private String numeroDocumento;
	private TipoDeDocumento documento;
	
	public Funcionario(String nome, TipoDeDocumento documento, String numeroDocumento) {
		this.nome = nome;
		this.numeroDocumento = numeroDocumento;
		this.documento = documento;		
	}

	public String getNome() {
		return nome;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public TipoDeDocumento getDocumento() {
		return documento;
	}

		
	
}
