package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        int[][] matriz=new int[3][3];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Diga um num: ");
                matriz[i][j]=input.nextInt();
            }
        }
        int maior=matriz[0][0],menor=matriz[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j]>maior){
                    maior=matriz[i][j];
                }
                if(matriz[i][j]<menor){
                    menor=matriz[i][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("O maior e: "+maior+"\nO menor e: "+menor);
    }
}
