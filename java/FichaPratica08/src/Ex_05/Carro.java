package Ex_05;

public class Carro {
    private String marca;
    private String modelo;
    private int anoLancamento;

    Carro(String marca, String modelo, int anoLancamento){
        this.marca=marca;
        this.modelo=modelo;
        this.anoLancamento=anoLancamento;
    }

    public void ligar(){
        System.out.println("O carro esta ligado");
    }
}
