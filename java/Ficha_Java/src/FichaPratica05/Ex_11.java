package FichaPratica05;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,maior,menor;
        int[][] array=new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Diga um num: ");
                num=input.nextInt();
                array[i][j]=num;
            }
        }
        menor=array[0][0];
        maior=array[0][0];
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                if(array[i][j]>maior){
                    maior=array[i][j];
                }if(array[i][j]<menor){
                    menor=array[i][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("O maior e "+maior+" o menor e "+menor);
    }
}
