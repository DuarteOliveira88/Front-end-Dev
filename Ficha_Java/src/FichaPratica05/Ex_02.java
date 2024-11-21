package FichaPratica05;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        int num,total=0;
        int[] meses=new int[12];
        Scanner input=new Scanner(System.in);
        for (int i=1;i<13;i++){
            System.out.print("Diga a sua comissao no mes "+i+": ");
            num= input.nextInt();
            meses[i-1]=num;
            total+=num;
        }
        System.out.println("O total e: "+total);
    }
}
