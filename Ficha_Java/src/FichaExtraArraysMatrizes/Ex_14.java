package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] matriz1=new int[3][3],matriz2=new int[3][3],matrizNew=new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Diga um num:");
                matriz1[i][j]=input.nextInt();
            }
        }
        System.out.println("Matriz 2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Diga um num:");
                matriz2[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizNew[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizNew[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
