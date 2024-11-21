package FichaPratica04;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,res;
        String op;
        System.out.print("Diga um num: ");
        num1= input.nextInt();
        System.out.print("Diga um num: ");
        num2=input.nextInt();
        do {
            System.out.print("Diga a operaçao que deseja: ");
            op=input.next();
            switch (op){
                case "+":
                    res=num1+num2;
                    System.out.println("A soma e: "+res);
                    break;
                case "-":
                    res=num1-num2;
                    System.out.println("A sub e: "+res);
                    break;
                case "/":
                    res=num1/num2;
                    System.out.println("A div e: "+res);
                    break;
                case "*":
                    res=num1*num2;
                    System.out.println("A mult e: "+res);
                    break;
                default:
                    System.out.println("Simbolo nao reconhecido.");
            }
            System.out.print("Deseja continuar?(S)(N)");
            op=input.next().toUpperCase();
        }while (!op.equals("N"));
        System.out.println("Encerrando programa.");
    }
}
