package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_10 {
//em vez de contar os que se repetem conta os que nao se repetem
public static void main(String[] args) {
    int[] array=new int[12];
    int cont=0;
    Scanner input=new Scanner(System.in);
    for (int i = 0; i < 12; i++) {
        System.out.print("Diga um num: ");
        array[i]=input.nextInt();
    }
    for (int i = 0; i < 12; i++) {
        boolean dife=true;
        for (int j = i+1; j < 12; j++) {
            if(array[i]==array[j]){
                dife=false;
            }
        }
        if(dife){
            cont++;
        }
    }
    int[] newArray=new int[cont];
    int index=0;
    for (int i = 0; i < 12; i++) {
        boolean dife=true;
        for (int j = i+1; j < 12; j++) {
            if(array[i]==array[j]){
                dife=false;
            }
        }
        if(dife){
            newArray[index++]=array[i];
        }
    }
    System.out.println();
    for(int num:newArray){
        System.out.println(num);
    }
}
}
