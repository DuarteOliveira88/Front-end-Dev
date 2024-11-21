package FichaPratica03;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,cont=2;
        do {
            System.out.print("Diga um numero maior q 2: ");
            num= input.nextInt();
        }while (num<=2);
        while (cont<=num){
            if(cont%2==0){
                System.out.println(cont);
            }
            cont++;
        }
    }
}
