
public class Main {

	public static void main(String[] args) {
		Cliente Arthur = new Cliente();
		arthur.setNome("Arthur");
		
		Conta cc = new ContaCorrente(arthur);
		Conta poupanca = new ContaPoupanca(arthur);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
