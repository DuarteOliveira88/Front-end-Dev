package FichaPratica01;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1,num2,res;
        System.out.print("Introduza um int: ");
        num1=input.nextInt();
        System.out.print("Introduza outro int: ");
        num2=input.nextInt();
        res=num1+num2;
        System.out.print("A soma e: " + res);
    }
}
