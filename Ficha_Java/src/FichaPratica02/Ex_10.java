package FichaPratica02;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2;
        int res;
        String conta;
        System.out.print("Diga um numero: ");
        num1=input.nextInt();
        System.out.print("Diga um numero: ");
        num2=input.nextInt();
        System.out.print("Diga o simbolo da conta q deseja: ");
        conta=input.next();
        switch (conta){
            case "+":
                res=num1+num2;
                System.out.println("O resultado da soma e:"+res);
                break;
            case "-":
                res=num1-num2;
                System.out.println("O resultado da sub e: "+res);
                break;
            case "x":
                res=num1*num2;
                System.out.println("O resultado da mult e: "+res);
                break;
            case "/":
                res=num1/num2;
                System.out.println("O resultado da div e: "+res);
                break;
            case "%":
                res=num1%num2;
                System.out.println("O resultado do resto da div e: "+res);
                break;
            default:
                System.out.println("Simbolo nao reconhecido");
        }
    }
}
