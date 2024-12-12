package Ex02;

public class Caminhao extends Veiculo{
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int anoLancamento, double potencia, double cilindrada, TipoCombustivel tipoCombustivel, double litros100KM, double capacidadeCarga) {
        super(marca, modelo, anoLancamento, potencia, cilindrada, tipoCombustivel, litros100KM);
        this.capacidadeCarga=capacidadeCarga;
    }

    public void viagem(double distancia, double carga){
        if(this.capacidadeCarga>=carga){
            double distanciaLitros =this.consomeQaunto(distancia);
            double consumo=1.95+carga/1000;
            System.out.println("O consumo e: "+consumo+"\nO custo e: "+(distanciaLitros*consumo));
        }else {
            System.out.println("Peso elevado. Viagem ilegal.");
        }
    }
}
