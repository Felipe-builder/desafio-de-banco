import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;
	
	public Banco() {
		
	}

	public Banco(String nome, List<Conta> contas) {
		super();
		this.nome = nome;
		this.contas = contas;
	}

	public void listarClientes() {
		contas.forEach(conta -> System.out.println(String.format("Cliente: %s", conta.cliente.getNome())));
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
		
	
}
