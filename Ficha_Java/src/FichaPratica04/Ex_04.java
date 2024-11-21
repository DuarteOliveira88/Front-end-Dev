package FichaPratica04;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        String op;
        do {
            System.out.print("Diga um num: ");
            num=input.nextInt();
            int cont=0;
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    cont++;
                }
            }
            if(cont==2){
                System.out.println("O numero e primo.");
            }else {
                System.out.println("O numero nao e primo.");
            }
            System.out.print("Deseja perguntar outro num(s ou n): ");
            op=input.next().toUpperCase();
        }while (!op.equals("N"));
        System.out.println("Encerrando programa.");
    }
}
