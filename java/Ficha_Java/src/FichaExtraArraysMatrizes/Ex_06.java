package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int aux;
        System.out.print("Diga quantos elementos quer: ");
        aux= input.nextInt();
        int[] array=new int[aux];
        for (int i = 0; i < aux; i++) {
            System.out.print("Diga um num: ");
            array[i]=input.nextInt();
        }
        System.out.println();
        for (int num : array){
            System.out.println(num);
        }
    }
}
