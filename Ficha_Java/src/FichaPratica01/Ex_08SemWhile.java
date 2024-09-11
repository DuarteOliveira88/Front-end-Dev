package FichaPratica01;

import java.util.Scanner;

public class Ex_08SemWhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int min1,min2,min3,min4,min5,seg1,seg2,seg3,seg4,seg5,hora,min,seg,aux,cont=0;
        System.out.print("Introduza os min da muscia 1: ");
        min1=input.nextInt();
        System.out.print("Introduza os seg da muscia 1: ");
        seg1=input.nextInt();
        System.out.print("Introduza os min da muscia 2: ");
        min2=input.nextInt();
        System.out.print("Introduza os seg da muscia 2: ");
        seg2=input.nextInt();
        System.out.print("Introduza os min da muscia 3: ");
        min3=input.nextInt();
        System.out.print("Introduza os seg da muscia 3: ");
        seg3=input.nextInt();
        System.out.print("Introduza os min da muscia 4: ");
        min4=input.nextInt();
        System.out.print("Introduza os seg da muscia 4: ");
        seg4=input.nextInt();
        System.out.print("Introduza os min da muscia 5: ");
        min5=input.nextInt();
        System.out.print("Introduza os seg da muscia 5: ");
        seg5=input.nextInt();
        aux=seg1+seg2+seg3+seg4+seg5;
        seg=aux%60;
        aux=aux/60;
        aux=aux+min1+min2+min3+min4+min5;
        min=aux%60;
        hora=aux/60;
        System.out.println("Total do album: "+hora+"h "+min+"m "+seg+"s");
    }
}
