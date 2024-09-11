package FichaPratica01;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double num1,num2,num3,media,aux,mediaponderada;
        System.out.print("Introduza um num: ");
        num1=input.nextDouble();
        System.out.print("Introduza um num: ");
        num2=input.nextDouble();
        System.out.print("Introduza um num: ");
        num3=input.nextDouble();
        aux=num1+num2+num3;
        media=aux/3;
        System.out.println("A media dos 3 e: " + media);
        mediaponderada=num1*0.2+num2*0.3+num3*0.5;
        System.out.println("A media ponderada dos 3 e: " + mediaponderada);
    }
}
