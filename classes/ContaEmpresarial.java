package HerancaEPolimorfismo.material.classes;

public class ContaEmpresarial extends Conta {
    private String cnpjDoCliente;

    // Construtores
    public ContaEmpresarial(){
        super();
    }

    public ContaEmpresarial(String cnpjDoCliente) {
        this.cnpjDoCliente = cnpjDoCliente;
    }

    public ContaEmpresarial(String nomeTitularConta, int numeroDaConta, String agencia, Double saldo, String cnpjDoCliente) {
        super(nomeTitularConta, numeroDaConta, agencia, saldo);
        this.cnpjDoCliente = cnpjDoCliente;
    }
    //metodos


    // Gets e Setters


    public String getCnpjDoCliente() {
        return cnpjDoCliente;
    }

    public void setCnpjDoCliente(String cnpjDoCliente) {
        this.cnpjDoCliente = cnpjDoCliente;
    }
}
