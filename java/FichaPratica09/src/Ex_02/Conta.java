package Ex_02;

public class Conta {
    private int numConta;
    private double saldo=0;
    private String titularConta;
    private String anoAbertura;
    private double margemEmprestimo;
    private double dividaConta=0;

    Conta(int numConta, String titularConta){
        this.numConta=numConta;
        this.titularConta=titularConta;
    }

    public void transferencia(double valor, Conta contaDestinada){
        if(this.saldo>valor){
            contaDestinada.saldo=valor;
            System.out.println("Transferencia efetuada com sucesso");
            this.saldo-=valor;
            setMargemEmprestimo();
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void depositar(double deposito){
        this.saldo+=deposito;
        setMargemEmprestimo();
    }
    public void levantar(double levantamento){
        if(this.saldo>levantamento){
            this.saldo-=levantamento;
            System.out.println("Levantamento aprovado.");
            setMargemEmprestimo();
        }else {
            System.out.println("Levantamento superior ao saldo existente");
        }
    }
    public void mostrarSaldo(){
        System.out.println("O saldo e: " + this.saldo);
    }

    public void setAnoAbertura(String anoAbertura) {
        this.anoAbertura = anoAbertura;
    }

    public void setMargemEmprestimo() {
        this.margemEmprestimo=this.saldo*0.9;
    }
    public void pedirEmprestimo(double valor){
        if(this.dividaConta==0){
            if(valor<=this.margemEmprestimo){
                this.saldo+=valor;
                this.dividaConta=valor;
                System.out.println("Emprestimo aprovado.");
            }else {
                System.out.println("Emprestimo negado, valor superior ao limite.");
            }
        }else {
            System.out.println("Pague a divida primeiro");
        }
    }
}
