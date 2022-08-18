package HerancaEPolimorfismo.material.classes;

public class ContaPessoaFisica extends Conta{
    private String cpfCliente;

    // construtores
    public ContaPessoaFisica(){
        super();
    }

    public ContaPessoaFisica(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public ContaPessoaFisica(String nomeTitularConta, int numeroDaConta, String agencia, Double saldo, String cpfCliente) {
        super(nomeTitularConta, numeroDaConta, agencia, saldo);
        this.cpfCliente = cpfCliente;
    }
    //metodos


    // Gets e Setters

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
}
