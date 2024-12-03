package Ex_03;

public class Retangulo {
    double altura;
    double largura;

    Retangulo(double altura, double largura){
        this.altura=altura;
        this.largura=largura;
    }

    public double calcArea(){
        return (this.largura*this.altura);
    }
    public double calcPerim(){
        return ((this.largura*2)+(this.altura*2));
    }
}
