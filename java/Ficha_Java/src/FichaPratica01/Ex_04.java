package FichaPratica01;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduza o raio da circunferencia : ");
        double raio,area,perimetro;
        final double PI=3.1416;
        raio=input.nextDouble();
        area = PI*raio*raio;
        perimetro=PI*raio*2;
        System.out.println("A area da circunferencia e : " + area + "\n O perimetro e: "+ perimetro);
    }
}
