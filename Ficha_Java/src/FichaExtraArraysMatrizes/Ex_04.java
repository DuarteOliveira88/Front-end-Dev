package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        int[] array=new int[8];
        Scanner input=new Scanner(System.in);
        for (int i=0;i<8;i++){
            System.out.print("Diga um num: ");
            array[i]=input.nextInt();
        }
        System.out.print("Diga o num para procura: ");
        int aux= input.nextInt();
        for (int i = 0; i < 8; i++) {
            if(array[i]==aux){
                System.out.println("Array["+i+"]");
            }
        }

    }
}
