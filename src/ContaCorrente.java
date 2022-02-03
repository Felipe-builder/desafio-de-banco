
public class ContaCorrente extends Conta {

	@Override
	public void imprimirExtrado() {
		System.out.println("Extrato Conta-Corrente");
		super.imprimirInfosComuns();
	}

}
