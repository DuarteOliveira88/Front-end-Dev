package FichaPratica03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int lim,num,cont=0,aux,i=1;
        System.out.print("Diga o limite de num: ");
        lim=input.nextInt();
        System.out.print("Diga um num: ");
        aux=input.nextInt();
        while(i<lim){
            System.out.print("Diga um num: ");
            num=input.nextInt();
            if(aux<num){
                cont++;
            }
            aux=num;
            i++;
        }
        if(cont==lim-1){
            System.out.println("Crescente");
        }else {
            System.out.println("Nao crescente");
        }
    }
}
