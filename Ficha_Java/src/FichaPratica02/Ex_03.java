package FichaPratica02;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double sal;
        System.out.print("Diga o seu salario: ");
        sal= input.nextDouble();
        if(sal<=15000){
            sal=sal * 0.2;
            System.out.println("A sua taxa e: "+sal);
        }if(sal<=20000&&sal>15000){
            sal*=0.3;
            System.out.println("A sua taxa e: "+sal);
        }if (sal<=25000&&sal>20000){
            sal*=0.35;
            System.out.println("A sua taxa e: "+sal);
        }if(sal>25000){
            sal*=0.40;
            System.out.println("A sua tava e: "+sal);
        }

    }
}
