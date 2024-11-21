package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        int[] array=new int[5];
        Scanner input=new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.print("Diga um num: ");
            array[i]=input.nextInt();
        }
        for(int i=4;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}
