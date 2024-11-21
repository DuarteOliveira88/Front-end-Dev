package FichaPratica05;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        int num,maior=0;
        int[] array=new int[10];
        Scanner input=new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.print("Diga um num: ");
            num=input.nextInt();
            array[i]=num;
            if(num>=maior){
                if(num%2==0){
                    maior=num;
                }
            }
        }
        System.out.println("Do array:");
        for (int i=0;i<10;i++){
            System.out.print(array[i]+"\t");
        }
        if(maior==0){
            System.out.println("\nNao existe num par.");
        }else {
            System.out.println("\nO numero maior e par e: "+maior);
        }
    }
}
