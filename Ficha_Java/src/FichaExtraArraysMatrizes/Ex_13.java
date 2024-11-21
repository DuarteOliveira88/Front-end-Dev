package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] matriz=new int[4][3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Diga um num:");
                matriz[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
