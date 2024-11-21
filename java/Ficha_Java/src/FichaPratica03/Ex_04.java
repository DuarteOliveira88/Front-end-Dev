package FichaPratica03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num,cont=0;
        System.out.print("Diga um numero: ");
        num= input.nextInt();
        while (cont<=num){
            System.out.println(cont);
            cont++;
        }
    }
}
