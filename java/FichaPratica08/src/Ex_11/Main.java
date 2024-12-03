package Ex_11;

public class Main {
    public static void main(String[] args) {
        Conta conta01=new Conta(01,"Duarte");
        conta01.depositar(1000);
        conta01.mostrarSaldo();
        conta01.levantar(120);
        conta01.mostrarSaldo();
        Conta conta02=new Conta(02,"Vitor");
        Conta conta03=new Conta(03,"Sara");
        conta01.transferencia(120,conta02);
        conta01.mostrarSaldo();
        conta02.mostrarSaldo();
        conta03.mostrarSaldo();
    }
}
