package FichaExtraCondicoes;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        int idade;
        Scanner input=new Scanner(System.in);
        System.out.print("Diga a sua idade: ");
        idade=input.nextInt();
        if(idade>=18){
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }
    }
}
