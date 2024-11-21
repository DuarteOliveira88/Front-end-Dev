package FichaPratica02;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Diga um numero: ");
        int num;
        num= input.nextInt();
        if(num%2==0){
            System.out.println("O numero "+num+" e par.");
        }else {
            System.out.println("O numero "+num+" e impar.");
        }
    }
}
