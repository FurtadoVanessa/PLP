class Conta{

private int numero;
protected String dono;
private double saldo;
private double limite;

private void sacar(double valor){
	this.saldo-=valor;
	
}

public void depositar(double valor){
	this.saldo+=valor;
}

public boolean sacarValidando(double valor){
	if(valor<=this.saldo){
		this.sacar(valor);
		return true;
	}else{
		return false;
	}
}

public getSaldo(){
	return this.saldo;
}

public getLimite(){
	return this.limite;
}

public getDono(){
	return this.dono;
}

public setDono(String dono){
	this.dono = dono;
}


}