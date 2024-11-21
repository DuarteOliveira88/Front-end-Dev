package FichaPratica02;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double saldoM,valorC=0;
        System.out.print("Diga o seu saldo medio do ultimo ano: ");
        saldoM= input.nextDouble();
        if(saldoM<=2000){
            valorC=0;
        }if(saldoM<=4000&&saldoM>2000){
            valorC=saldoM*0.2;
        }if(saldoM<=6000&&saldoM>4000){
            valorC=saldoM*0.3;
        }if(saldoM>6000){
            valorC=saldoM*0.4;
        }
        System.out.println("O seu saldo medio de "+saldoM+" tem um credito de "+valorC);
    }
}
