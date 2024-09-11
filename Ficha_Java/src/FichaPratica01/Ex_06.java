package FichaPratica01;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int valor1,valor2;
        System.out.print("Introduza valor1: ");
        valor1=input.nextInt();
        System.out.print("Introduza valor2: ");
        valor2=input.nextInt();
        System.out.println("Valor1: "+valor1+"\nValor2: "+valor2);
        valor1+=valor2;
        valor2=valor1 - valor2;
        valor1=valor1-valor2;

        System.out.println("Valor1: "+valor1+"\nValor2: "+valor2);
    }
}
