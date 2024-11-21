package FichaPratica02;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        int valor,notas200,notas100,notas50,notas20,notas10,notas5,aux;
        Scanner input = new Scanner(System.in);
        System.out.print("Diga um valor multiplo de 5: ");
        valor= input.nextInt();
        aux=valor;
        notas200=aux/200;
        aux=aux%200;
        notas100=aux/100;
        aux=aux%100;
        notas50=aux/50;
        aux=aux%50;
        notas20=aux/20;
        aux=aux%20;
        notas10=aux/10;
        aux=aux%10;
        notas5=aux/5;
        System.out.println("O valor "+valor+" e dividido em "+notas200+" "+notas100+" "+notas50+" "+notas20+" "+notas10+" "+notas5);
    }
}
