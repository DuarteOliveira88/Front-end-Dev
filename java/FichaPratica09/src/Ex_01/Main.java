package Ex_01;

public class Main {
    public static void main(String[] args) {
        Carro mercedes= new Carro("Merc","a",1925,250,200,TipoCombustivel.DIESEL,10);
        Carro bmw= new Carro("bm","a",2026,200,200,TipoCombustivel.GASOLINA,10);
        mercedes.ligar();
        mercedes.corrida(bmw);
        System.out.println("A mercedes em 100 consome: "+mercedes.consomeQaunto(100));
    }
}
