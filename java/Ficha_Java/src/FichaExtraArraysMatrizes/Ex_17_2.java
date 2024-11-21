package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_17_2 {
    public static void main(String[] args) {
        int[][] matriz=new int[3][3];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Diga um num: ");
                matriz[i][j]=input.nextInt();
            }
        }
        int[] array=new int[3*3];
        int index=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[index++]=matriz[i][j];
            }
        }
        int aux=array[0];
        for (int i = 1; i < 9; i++) {
            if(array[i]<array[i-1]){
                aux=i;
                while (aux>0){
                    if(array[aux]<array[aux-1]){
                        int aux2=array[aux-1];
                        array[aux-1]=array[aux];
                        array[aux]=aux2;
                        aux--;
                    }else{
                        aux=0;
                    }
                }
            }
        }
        int segMaior=array[7],segMenor=array[1];
        System.out.println("O segundo maior e: "+segMaior+"\nO segundo Menor e: "+segMenor);
    }
}
