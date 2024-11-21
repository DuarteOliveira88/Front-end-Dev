package FichaPratica05;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,soma=0;
        int[][] matriz=new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Diga um num: ");
                num=input.nextInt();
                matriz[i][j]=num;
                if(i==j){
                    soma+=num;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("A soma da diag principal e: "+soma);
    }
}
