class Corrente extends Conta{

private double juros;
private double rendimento;

public boolean sacarValidando(double valor){
	if(valor<=(this.getSaldo()+this.juros+this.getLimite()){
		this.sacar(valor);
		this.sacar(juros);
		return true;
	}else{
		return false;
	}
}

public void depositar(double valor){
	this.saldo+=valor - 0.10;
}

public getJuros(){
	return this.juros;
}

public setJuros(double juros){
	this.juros = juros;
}

public atualiza(double taxa){
	this.saldo += this.saldo*2*taxa; 

}

}