package FichaPratica05;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        int num;
        int[] array=new int[10];
        Scanner input=new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.print("Diga um num: ");
            num=input.nextInt();
            array[i]=num;
        }
        for (int i=0;i<10;i++){
            System.out.println(array[i]);
        }
    }
}