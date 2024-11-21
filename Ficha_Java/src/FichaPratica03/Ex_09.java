package FichaPratica03;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,cont=-1,sumatorio=1;
        do {
            System.out.print("Diga um num: ");
            num=input.nextInt();
            sumatorio+=num;
            cont++;
        }while (num!=-1);
        System.out.println(sumatorio/cont);
    }
}
