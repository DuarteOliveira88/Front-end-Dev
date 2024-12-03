package Ex_04;


public class Circulo {
    private final double pi=3.1416;
    private double raio;

    Circulo(double raio){
        this.raio=raio;
    }

    public double calcArea(){
        return this.raio*this.raio*this.pi;
    }
    public double calcPerim(){
        return this.raio*this.pi*2;
    }
}
