package FichaPratica02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double sal;
        System.out.print("Diga o seu salario: ");
        sal= input.nextDouble();
        if(sal<=15000){
            sal=sal * 0.2;
            System.out.println("A sua taxa e: "+sal);
        }else{
            sal*=0.3;
            System.out.println("A sua taxa e: "+sal);
        }
    }
}
