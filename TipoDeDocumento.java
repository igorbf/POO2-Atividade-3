
public enum TipoDeDocumento {
	
	RG("Registro Geral"),
	CPF("Cadastro de Pessoa física"),
	CNPJ("Cadastro de Pessoal Júridica");
	
	private String descricao;

	private TipoDeDocumento(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
