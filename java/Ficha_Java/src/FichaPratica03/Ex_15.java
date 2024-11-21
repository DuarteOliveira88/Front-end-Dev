package FichaPratica03;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fat=0,num,aux;
        System.out.print("Diga um num inteiro nao neg: ");
        num=input.nextInt();
        aux=num;
        num -= 1;
        do {
            for (int i=num; i>0;i--){
                fat+=aux;
            }
            aux=fat;
            fat=0;
            num--;
        }while (num!=0);
        fat=aux;
        System.out.println("O fat e: "+fat);
    }
}
