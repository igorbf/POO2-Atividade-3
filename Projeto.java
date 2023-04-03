import java.util.Date;
import java.util.ArrayList;

public class Projeto {
	
	private String nome;
	private Date dt_Inicio;
	private Date dt_Termino;
	public ArrayList<Contratacao>funcionarios = new ArrayList<Contratacao>();
	
	public Projeto(String nome, Date date, Date date2) {
		this.nome = nome;
		this.dt_Inicio = date;
		this.dt_Termino = date2;
	}
	
	public boolean adicionarContratação(Contratacao c) {
		if(c.status == Status.PENDENTE) {
			this.funcionarios.add(c);
			return true;
		}
			return false;
		
	}
	
	public boolean removerContratação(Contratacao c) {
		if(c.status == Status.CONTRATADO) {
			this.funcionarios.remove(c);
		}
			return false;
		
	}
	
	public void listarContratacao() {
		System.out.println("**CONTRATACOES**");
		System.out.println("Projeto: " + this.nome);
		for(Contratacao i : funcionarios) {
			if(!(i.status == Status.DEMITIDO)) {
			System.out.println("	" + i.toString());
			}
		}
	}
	
}
