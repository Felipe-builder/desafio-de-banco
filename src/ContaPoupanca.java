
public class ContaPoupanca extends Conta {

	@Override
	public void imprimirExtrado() {
		System.out.println("Extrato Conta-Poupança");
		super.imprimirInfosComuns();
	}

	
}
