package FichaExtraArraysMatrizes;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Ex_15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] matriz=new int[3][2];
        int count=0,soma=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Diga um num: ");
                matriz[i][j]= input.nextInt();
                soma+=matriz[i][j];
                count++;
            }
        }
        System.out.println("A media e: "+(soma/count));
    }
}
