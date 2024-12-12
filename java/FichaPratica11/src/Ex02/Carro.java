package Ex02;

public class Carro extends Veiculo{
    private int quantPassageiros;

    public Carro(String marca, String modelo, int anoLancamento, double potencia, double cilindrada, TipoCombustivel tipoCombustivel, double litros100KM, int quantPassageiros) {
        super(marca, modelo, anoLancamento, potencia, cilindrada, tipoCombustivel, litros100KM);
        this.quantPassageiros=quantPassageiros;
    }
    public double calcularCusto(double distancia){
        switch (this.getTipoCombustivel()){
            case GPL -> {
                return distancia*1.15;
            }
            case DIESEL -> {
                return distancia*1.95;
            }
            case GASOLINA -> {
                return distancia*2.10;
            }
            case ELETRICO -> {
                return distancia*0.12;
            }
        }
        return 0;
    }
}
