package FichaPratica06;

import java.util.Scanner;

public class Ex_02 {
    public static void asterisco(int num){
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
    public static int numPos(){//pede ate ter um positivo
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Diga um num: ");
        num= input.nextInt();
        if(num>0){
            return num;
        }
        while (num<=0){
            System.out.print("Diga um num: ");
            num=input.nextInt();
        }
        return num;
    }

    public static void main(String[] args) {
        int num=numPos();
        asterisco(num);
    }
}
