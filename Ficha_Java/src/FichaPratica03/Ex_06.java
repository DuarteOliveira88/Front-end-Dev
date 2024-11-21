package FichaPratica03;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int ini,fim;
        System.out.print("Diga o inicio: ");
        ini=input.nextInt();
        System.out.print("Diga o final: ");
        fim=input.nextInt();
        while (ini <= fim){
            System.out.println(ini);
            ini++;
        }
    }
}
