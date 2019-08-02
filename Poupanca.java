class Poupanca extends Conta{

private double rendimento;

public double CalcularRendimento(){
	return this.getSaldo()*this.rendimento;
}

public getRendimento(){
	return this.rendimento;
}

public setRendimento(double rendimento){
	this.rendimento = rendimento;
}

public atualiza(double taxa){
	this.saldo += this.saldo*3*taxa; 

}

}