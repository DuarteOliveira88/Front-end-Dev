package FichaPratica05;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,media,aux=0;
        int[] array=new int[10];
        for (int i=0;i<10;i++){
            System.out.print("Diga um num: ");
            num=input.nextInt();
            array[i]=num;
            aux+=num;
        }
        media=aux/10;
        System.out.println("Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nA media e: "+media);
    }
}
