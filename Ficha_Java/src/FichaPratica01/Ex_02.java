package FichaPratica01;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double num1,num2,res;
        System.out.print("Introduza um int: ");
        num1=input.nextDouble();
        System.out.print("Introduza outro int: ");
        num2=input.nextDouble();
        res=num1+num2;
        System.out.println("A soma e: " + res);
        res=num1-num2;
        System.out.println("A sub e: " + res);
        res=num1*num2;
        System.out.println("A mult e: " + res);
        res=num1/num2;
        System.out.println("A div e: " + res);
    }
}
