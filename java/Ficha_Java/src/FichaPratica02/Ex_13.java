package FichaPratica02;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horas,min;
        System.out.print("Introduza horas: ");
        horas=input.nextInt();
        System.out.print("Introduza minutos: ");
        min=input.nextInt();
        if(horas>=12){
            horas-=12;
            System.out.println(horas+":"+min+" PM");
        }else {
            System.out.println(horas+":"+min+" AM");
        }
    }
}
