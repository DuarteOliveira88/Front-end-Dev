package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int aux,num,index;
        System.out.print("Diga quantos elementos quer: ");
        aux= input.nextInt();
        int[] array=new int[aux];
        for (int i = 0; i < aux; i++) {
            System.out.print("Diga um num: ");
            array[i]=input.nextInt();
        }
        System.out.print("Diga o novo num: ");
        num=input.nextInt();
        System.out.print("Diga o index: ");
        index=input.nextInt();
        array[index]=num;
        for(int nume:array){
            System.out.println(nume);
        }
    }
}
