package FichaExtraFuncoes;

import java.util.Scanner;

public class Ex_10 {
    public static double quadrado() {
        Scanner input = new Scanner(System.in);
        System.out.print("Diga o lado: ");
        double lado = input.nextDouble();
        return lado * lado;
    }

    public static double triangulo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Diga a base: ");
        double base = input.nextDouble();
        System.out.print("Diga a altura: ");
        double altura = input.nextDouble();
        return (base * altura) / 2;
    }

    public static double retangulo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Diga a base: ");
        double base = input.nextDouble();
        System.out.print("Diga a altura: ");
        double altura = input.nextDouble();
        return base * altura;
    }

    public static double circulo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Diga o raio: ");
        double raio = input.nextDouble();
        return raio * raio * 3.1416;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area=0;
        System.out.print("Diga o formato do terreno: ");
        String terreno = input.next();
        switch (terreno) {
            case "quadrado":
                area = quadrado();
                break;
            case "retangulo":
                area = retangulo();
                break;
            case "triangulo":
                area = triangulo();
                break;
            case "circulo":
                area = circulo();
                break;
            default:
                System.out.println("Formato desconhecido.");
        }
        System.out.print("Diga o preco do terrono: ");
        double preco=input.nextDouble();
        System.out.print("Diga a tipologia(URBANO,URBANIZAVEL,RUSTICOS): ");
        String tipo=input.next();
        switch (tipo){
            case "URBANO":
                if(preco/area>=450&&preco/area<=750){
                    System.out.println("Dentro do valor");
                }else if(preco/area<=450){
                    System.out.println("Esta a baixo do mercado "+(450-(preco/area))+"€ do mercado");
                }else {
                    System.out.println("Esta a acia do mercado "+((preco/area)-750)+"€ do mercado");
                }
                break;
            case "URBANIZAVEL":
                if(preco/area>=150&&preco/area<=500){
                    System.out.println("Dentro do valor");
                }else if(preco/area<=150){
                    System.out.println("Esta a baixo do mercado "+(150-(preco/area))+"€ do mercado");
                }else {
                    System.out.println("Esta a acia do mercado "+((preco/area)-500)+"€ do mercado");
                }
                break;
            case "RUSTICO":
                if(preco/area>=30&&preco/area<=60){
                    System.out.println("Dentro do valor");
                }else if(preco/area<=30){
                    System.out.println("Esta a baixo do mercado "+(30-(preco/area))+"€ do mercado");
                }else {
                    System.out.println("Esta a acia do mercado "+((preco/area)-60)+"€ do mercado");
                }
                break;
        }
    }
}
