package FichaExtraCondicoes;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int ano;
        System.out.print("Insira o ano: ");
        ano= input.nextInt();
        if(ano%4==0){
            System.out.println("E bixesto");
        }else {
            System.out.println("Nao e bissexto");
        }
    }
}
