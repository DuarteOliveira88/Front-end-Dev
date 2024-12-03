package Ex_02;

public class Main {
    public static void main(String[] args) {
        Conta conta01=new Conta(01,"Duarte");
        conta01.depositar(1000);
        conta01.pedirEmprestimo(1000);
        conta01.pedirEmprestimo(900);
    }
}
