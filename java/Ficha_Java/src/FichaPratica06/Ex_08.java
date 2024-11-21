package FichaPratica06;

import java.util.Scanner;

public class Ex_08 {
    public static void somarMatrizes(int[][] matriz1,int[][] matriz2){
        int[][] matrizFinal=new int[matriz1[0].length][matriz1[0].length];
        for (int i = 0; i < matriz1[0].length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matrizFinal[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
        for (int i = 0; i < matriz1[0].length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matrizFinal[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
    public static int somatorioMatrizes(int[][] matriz1,int[][] matriz2){
        int somatorio=0;
        for (int i = 0; i < matriz1[0].length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                somatorio+=matriz1[i][j]+matriz2[i][j];
            }
        }
        return somatorio;
    }

    public static void main(String[] args) {
        int[][] matriz1=new int[3][3];
        int[][] matriz2=new int[3][3];
        int somatorio;
        Scanner input=new Scanner(System.in);
        System.out.println("Diga a matriz 1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Diga um num: ");
                matriz1[i][j]=input.nextInt();
            }
        }
        System.out.println("Diga a matriz 2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Diga um num: ");
                matriz2[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz1[i][j]+"\t");
            }
            System.out.print("\n");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz2[i][j]+"\t");
            }
            System.out.print("\n");
        }
        somarMatrizes(matriz1,matriz2);
        somatorio=somatorioMatrizes(matriz1,matriz2);
        System.out.println("O somatorio e: "+somatorio);
    }
}
