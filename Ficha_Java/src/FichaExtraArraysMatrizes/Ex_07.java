package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int aux,aux2,count=0;
        System.out.print("Diga quantos elementos quer: ");
        aux= input.nextInt();
        int[] array=new int[aux];
        for (int i = 0; i < aux; i++) {
            System.out.print("Diga um num: ");
            array[i]=input.nextInt();
        }
        System.out.print("Diga o num que deseja remover: ");
        aux2=input.nextInt();
        for (int i = 0; i < aux; i++) {
            if(array[i]==aux2){
                count++;
            }
        }
        int[] array2=new int[aux-count];
        int index=0;
        for(int num: array){
            if(num!=aux2){
                array2[index++]=num;
            }
        }
        System.out.println();
        for (int num : array2){
            System.out.println(num);
        }
    }
}
