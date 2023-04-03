import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		Projeto p1 = new Projeto("Construcao", df.parse("01/01/2020"), df.parse("01/02/2020"));
		Funcionario f1 = new Funcionario ("Igor", TipoDeDocumento.CPF, "999.999.999-99");
		Funcionario f2 = new Funcionario ("Viviane", TipoDeDocumento.CPF, "999.999.999-99");
		Contratacao c1 = new Contratacao (df.parse("01/01/2020"), Cargo.DIRETOR, f1, p1);
		Contratacao c2 = new Contratacao (df.parse("01/01/2020"), Cargo.DIRETOR, f2, p1);
	
		p1.listarContratacao();
		
		c1.contratar();
		p1.listarContratacao();
		
		c1.demitir();
		c2.contratar();
		p1.listarContratacao();

	
	}

}
