package FichaPratica05;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        int[] array1=new int[10],array2=new int[10];
        int[][] matriz=new int[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Diga um num para a matriz 1["+i+"]: ");
            num=input.nextInt();
            array1[i]=num;
            System.out.print("Diga um num para a matriz 2["+i+"]: ");
            num=input.nextInt();
            array2[i]=num;
        }
        for (int i = 0; i < 10; i++) {
            matriz[i][0]=array1[i];
            matriz[i][1]=array2[i];
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
