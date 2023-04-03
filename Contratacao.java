import java.util.Date;

public class Contratacao {
	
	Funcionario funcionario;
	Date data;
	Cargo cargo;
	Status status = Status.PENDENTE;
	
	
	public Contratacao(Date parse, Cargo c, Funcionario f, Projeto p) {
		this.data = parse;
		this.cargo = c;
		this.funcionario = f;
		p.adicionarContratação(this);
		
	}

	public void pendente() {
		this.status = Status.PENDENTE;
	}
	
	public void contratar() {
		this.status = Status.CONTRATADO;
	}
	
	public void demitir() {
		this.status = Status.DEMITIDO;
	}

	@Override
	public String toString() {
		return funcionario.getNome() + "[Status: " + status + "]";
	}
}
