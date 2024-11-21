package FichaPratica04;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int seg,adi=-1,cont=0;
        System.out.print("Diga o num secreto(0-100): ");
        seg=input.nextInt();
        while (adi!=seg){
            System.out.print("Tente adivinhar o num secreto: ");
            adi=input.nextInt();
            if(adi<seg){
                System.out.println("O valor e inferior.");
            }if(adi>seg){
                System.out.println("O valor e superior.");
            }
            cont++;
        }
        System.out.println("Acertou o numero secreto em: "+cont);
    }
}
