package Ex_09;

public class Main {
    public static void main(String[] args) {
        Produto wee=new Produto("Cannabis",10);
        wee.comprar(5);
        wee.vender(2);
        wee.getStock();
        wee.comprar(10);
        wee.vender(35);
        wee.getStock();
    }
}
