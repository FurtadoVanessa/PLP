class Principal{

	public static void main(String[] args){

		Banco banco = new Banco();
		Conta minhaConta = new Conta();
		banco.add(minhaConta);
		minhaConta.setDono("Vanessa");
		minhaConta.depositar(5000);
		System.out.println("O nome do cliente eh "+minhaConta.getDono()+" e o saldo eh "+minhaConta.getSaldo());
		if(minhaConta.sacarValidando(6000))
			System.out.println("Foi realizado o saque e seu novo saldo eh "+minhaConta.getSaldo);
		else
			System.out.println("Não foi realizado o saque. Saldo insuficiente");
		
		Poupanca p = new Poupanca();
		banco.add(p);
		p.setDono = "Joao";
		p.setRendimento(0.05);
		p.depositar(100);
		System.out.println("O rendimento foi de"+p.calcularRendimento());
		atualizaBanco(banco);
	}


	public atualizaBanco(Banco banco){
		banco.saldoTotal = 0;
		for(Conta conta : banco.listaContas){
			banco.saldoTotal+=conta.getSaldo();
		}
		
	}

}
//protected - acessavel pelo pai e suas filhas
//private - acessavel apenas pela classe
//public - publico a todas as classes que possuem acesso a classe