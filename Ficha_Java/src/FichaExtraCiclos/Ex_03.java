package FichaExtraCiclos;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Diga um num: ");
        num=input.nextInt();
        System.out.println("A tabuado do "+num+" e:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
