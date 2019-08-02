class Banco{

    private double saldoTotal;
    private ArrayList<Conta> listaContas;

    public getSaldoTotal(){
    return this.saldoTotal;
}

    public atualizaBanco(){
        this.saldoTotal = 0;
        for(Conta conta : this.listaContas){
            this.saldoTotal+=conta.getSaldo();
        }

    }

}