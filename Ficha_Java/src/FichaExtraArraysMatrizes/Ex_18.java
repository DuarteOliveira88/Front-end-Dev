package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int linhas,colunas;
        System.out.print("Diga as linhas: ");
        linhas=input.nextInt();
        System.out.print("Diga as colunas: ");
        colunas=input.nextInt();
        int[][] matriz=new int[linhas][colunas],matrizT=new int[colunas][linhas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Diga um num: ");
                matriz[i][j]=input.nextInt();
                matrizT[j][i]=matriz[i][j];
            }
        }
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(matrizT[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
