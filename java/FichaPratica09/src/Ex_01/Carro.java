package Ex_01;

public class Carro {
    private String marca;
    private String modelo;
    private int anoLancamento;
    private double potencia;
    private double cilindrada;
    private TipoCombustivel tipoCombustivel;
    private double litros100KM;

    public Carro(String marca, String modelo, int anoLancamento, double potencia, double cilindrada, TipoCombustivel tipoCombustivel, double litros100KM) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoLancamento = anoLancamento;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.litros100KM = litros100KM;
    }

    public void ligar(){
        if(2024-this.anoLancamento<=30){
            if(this.potencia>=250){
                System.out.println("O carro esta lidao!");
                System.out.println("VRUUUUUUUUUUUUUUM");
            }else {
                System.out.println("O carro esta lidao!");
                System.out.println("vruuuuuuuum");
            }
        }else {
            if(this.tipoCombustivel.equals(TipoCombustivel.DIESEL)){
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro esta ligado!");
                System.out.println("Vrum-vrum-vrum");
            }else {
                System.out.println("Custa a pegar... O carro esta ligado!");
                System.out.println("Vrum-vrum-vrum");
            }
        }
    }

    public void corrida(Carro adversario){
        if(this.potencia>adversario.potencia){
            System.out.println("Vencedor: eu");
        } else if (this.potencia<adversario.potencia) {
            System.out.println("Vencedor: "+adversario);
        } else {
            if(this.cilindrada>adversario.cilindrada){
                System.out.println("Vencedor: eu");
            }else if (this.cilindrada<adversario.cilindrada) {
                System.out.println("Vencedor: " + adversario);
            } else {
                if(this.anoLancamento>adversario.anoLancamento){
                    System.out.println("Vencedor: eu");
                }else {
                    System.out.println("Vencedor: "+adversario);
                }
            }
        }
    }
    public double consomeQaunto(double distancia){
        return distancia*(this.litros100KM/100);
    }
}
