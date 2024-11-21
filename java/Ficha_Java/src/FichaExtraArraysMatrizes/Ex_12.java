package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        int[] array1=new int[8],array2=new int[8];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.print("Diga um num para o array 1: ");
            array1[i]=input.nextInt();
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.print("Diga um num para o array 2: ");
            array2[i]=input.nextInt();
        }
        int count=0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(array1[i]==array2[j]){
                    count++;
                }
            }
        }
        int[] arraySem=new int[count];
        int index=0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(array1[i]==array2[j]){
                    arraySem[index++]=array1[i];
                }
            }
        }
        System.out.println();
        for(int num:arraySem){
            System.out.println(num);
        }
    }

}
