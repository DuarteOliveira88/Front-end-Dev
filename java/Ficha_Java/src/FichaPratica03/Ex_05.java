package FichaPratica03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in).useDelimiter("\n");
        int num;
        String cadeia;
        System.out.print("Diga um num: ");
        num=input.nextInt();
        System.out.print("Diga uma frase: ");
        cadeia=input.next();
        for(int i=0;i<num;i++){
            System.out.println(cadeia);
        }
    }
}
