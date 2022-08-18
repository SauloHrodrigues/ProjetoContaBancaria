package HerancaEPolimorfismo.material.classes;

public abstract class Conta {
    private String nomeTitularConta;
    private int numeroDaConta;
    private String agencia;
    protected Double saldo;

    // Construtores
    public Conta(){
    }

    public Conta(String nomeTitularConta, int numeroDaConta, String agencia, Double saldo) {
        this.nomeTitularConta = nomeTitularConta;
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    //Metodos
    public void depositoConta(double valorDeposito){
        this.saldo += valorDeposito;
    }
    public void saqueConta(double valorSaque){
        if (valorSaque>this.saldo) {
            System.out.println("SALDO INSUFICIENTE!");
        }else{
            this.saldo -= valorSaque;
        }
    }

    // Gets e Setters

    public String getNomeTitularConta() {
        return nomeTitularConta;
    }

    public void setNomeTitularConta(String nomeTitularConta) {
        this.nomeTitularConta = nomeTitularConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
