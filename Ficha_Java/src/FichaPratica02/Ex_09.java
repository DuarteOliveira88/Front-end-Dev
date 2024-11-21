package FichaPratica02;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Diga um numero: ");
        num1=input.nextInt();
        System.out.print("Diga um numero: ");
        num2=input.nextInt();
        System.out.print("Diga um numero: ");
        num3=input.nextInt();
        if(num1<num2&&num1<num3){
            System.out.println("O 1 numero e o menor: "+num1);
        }if(num2<num3&&num2<num1){
            System.out.println("O 2 numero e o menor: "+num2);
        }if(num3<num1&&num3<num2){
            System.out.println("O 3 numero e o menor: "+num3);
        }
    }
}
