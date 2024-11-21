package FichaPratica05;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        int num,maior=0;
        int[] array=new int[10];
        Scanner input=new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.print("Diga um num: ");
            num=input.nextInt();
            array[i]=num;
            if(num>=maior){
                maior=num;
            }
        }
        System.out.println("Do array:");
        for (int i=0;i<10;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println("\nO numero maior e: "+maior);
    }
}
