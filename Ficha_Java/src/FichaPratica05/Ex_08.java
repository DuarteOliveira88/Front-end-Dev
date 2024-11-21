package FichaPratica05;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        int[][] matriz=new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Diga um num: ");
                num=input.nextInt();
                matriz[i][j]=num;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
