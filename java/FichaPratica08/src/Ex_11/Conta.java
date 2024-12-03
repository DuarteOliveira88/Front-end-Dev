package Ex_11;

public class Conta {
    private int numConta;
    private double saldo=0;
    private String titularConta;

    Conta(int numConta, String titularConta){
        this.numConta=numConta;
        this.titularConta=titularConta;
    }

    public void transferencia(double valor, Conta contaDestinada){
        if(this.saldo>valor){
            contaDestinada.saldo=valor;
            System.out.println("Transferencia efetuada com sucesso");
            this.saldo-=valor;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void depositar(double deposito){
        this.saldo+=deposito;
    }
    public void levantar(double levantamento){
        if(this.saldo>levantamento){
            this.saldo-=levantamento;
            System.out.println("Levantamento aprovado.");
        }else {
            System.out.println("Levantamento superior ao saldo existente");
        }
    }
    public void mostrarSaldo(){
        System.out.println("O saldo e: " + this.saldo);
    }
}
