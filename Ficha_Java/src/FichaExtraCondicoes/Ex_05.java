package FichaExtraCondicoes;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        int num=31,adivinha;
        Scanner input=new Scanner(System.in);
        System.out.print("Tente adivinhar o num:");
        adivinha=input.nextInt();
        if(num==adivinha){
            System.out.println("Boa!Ganhaste o jogo");
        }else {
            if(num>adivinha){
                System.out.println("Muito baixo");
            }else {
                System.out.println("Muito alto");
            }
            System.out.print("Tente adivinhar o num:");
            adivinha=input.nextInt();
            if(num==adivinha){
                System.out.println("Boa! Ganhaste o jogo.");
            }else {
                if(num>adivinha){
                    System.out.println("Muito baixo");
                }else {
                    System.out.println("Muito alto");
                }
                System.out.println("Ficaste sem tentativas...");
            }
        }
    }
}
