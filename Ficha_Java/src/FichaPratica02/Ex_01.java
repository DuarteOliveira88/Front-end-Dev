package FichaPratica02;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num1,num2;
        System.out.print("Diga um numero: ");
        num1=input.nextInt();
        System.out.print("Diga um numero: ");
        num2=input.nextInt();
        if (num1>num2){
            System.out.println("Maior: "+ num1);
        }else{
            System.out.println("Maior: "+num2);
        }
    }
}
