package FichaPratica03;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int limite,salto;
        System.out.print("Diga o limite: ");
        limite=input.nextInt();
        System.out.print("Diga o salto: ");
        salto=input.nextInt();
        for(int i=0;i<limite;i+=salto){
            System.out.println(i);
        }
    }
}
