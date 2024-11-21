package FichaPratica03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int ini,fim;
        System.out.print("Diga o inicio: ");
        ini=input.nextInt();
        System.out.print("Diga o fim: ");
        fim=input.nextInt();
        for(int i=ini;i<=fim;i++){
            if(i%5==0){
                System.out.println(i);
            }
        }
    }
}
