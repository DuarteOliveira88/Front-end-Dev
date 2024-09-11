package FichaPratica01;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double num1,num2,area,perimetro;
        System.out.print("Introduza o comprimento: ");
        num1=input.nextDouble();
        System.out.print("Introduza a largura: ");
        num2=input.nextDouble();
        area=num1*num2;
        perimetro=num1*2+num2*2;
        System.out.println("A area e: "+ area + "\nO perimetro e: " + perimetro);
    }
}
