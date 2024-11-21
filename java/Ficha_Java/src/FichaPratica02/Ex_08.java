package FichaPratica02;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double nota1,nota2,nota3,notaFinal;
        System.out.print("Diga a sua primeira nota: ");
        nota1= input.nextDouble();
        System.out.print("Diga a sua segunda nota: ");
        nota2= input.nextDouble();
        System.out.print("Diga a sua terceira nota: ");
        nota3= input.nextDouble();
        notaFinal=nota1*0.25+nota2*0.35+nota3*0.4;
        System.out.println("A sua nota final e: "+notaFinal);
    }
}
