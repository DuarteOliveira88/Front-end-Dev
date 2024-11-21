package FichaExtraArraysMatrizes;

import java.util.Scanner;
public class Ex_17 {
    //em vez de fazer assim tira todos os numeros para um array ordena o array e escolhe o que queres
    public static void main(String[] args) {
        int[][] matriz=new int[3][3];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Diga um num: ");
                matriz[i][j]=input.nextInt();
            }
        }
        int maior=matriz[0][0],menor=matriz[0][0],segMaior=matriz[0][0],segMenor=matriz[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j]>maior){
                    segMaior=maior;
                    maior=matriz[i][j];
                }
                if(matriz[i][j]<menor){
                    segMenor=menor;
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
        System.out.println("O segundo maior e: "+segMaior+"\nO segMenor e: "+segMenor);
    }
    }

