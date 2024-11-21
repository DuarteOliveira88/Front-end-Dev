package FichaPratica03;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,aux;
        System.out.print("Diga um num: ");
        num=input.nextInt();
        aux=num-5;
        for (int i=0;i<5;i++){
            System.out.println(aux);
            aux++;
        }
        aux=num;
        System.out.println();
        for (int i=0;i<5;i++){
            aux++;
            System.out.println(aux);
        }
    }
}
