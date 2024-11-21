package FichaPratica02;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Diga um numero: ");
        num1= input.nextInt();
        System.out.print("Diga um numero: ");
        num2= input.nextInt();
        System.out.print("Diga um numero: ");
        num3= input.nextInt();
        if(num1<num2&&num1<num3){
            if(num2<num3){
                System.out.println(num1+" "+ num2+ " "+num3);
            }else {
                System.out.println(num1+" "+num3+" "+num2);
            }
        }if(num2<num3&&num2<num1){
            if(num1<num3){
                System.out.println(num2+" "+num1+" "+num3);
            }else {
                System.out.println(num2+" "+num3+" "+num1);
            }
        }if(num3<num1&&num3<num2) {
            if (num2 < num1) {
                System.out.println(num3 + " " + num2 + " " + num1);
            } else {
                System.out.println(num3 + " " + num1 + " " + num2);
            }
        }
    }
}
