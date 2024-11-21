package FichaPratica02;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double saldo,movimento;
        System.out.print("Diga o seu saldo: ");
        saldo=input.nextDouble();
        System.out.print("Diga o movimento: ");
        movimento=input.nextDouble();
        if(saldo+movimento<0){
            System.out.println("Saldo insuficiente.");
            System.out.println("O seu saldo e: "+saldo);
        }else {
            saldo=saldo+movimento;
            System.out.println("O seu saldo e: "+saldo);
        }
    }
}
