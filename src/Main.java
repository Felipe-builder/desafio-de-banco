import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente();
		joao.setNome("João");
		
		Conta cc = new ContaCorrente(joao);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(joao);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrado();
		poupanca.imprimirExtrado();
		
		Banco banco = new Banco();
		banco.setNome("Banco SHOW");
		banco.setContas(Arrays.asList(cc, poupanca));
		
		banco.listarClientes();
	}

}
