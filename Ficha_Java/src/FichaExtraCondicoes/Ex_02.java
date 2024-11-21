package FichaExtraCondicoes;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        double peso,pesoLua;
        Scanner input=new Scanner(System.in);
        System.out.print("Diga o seu peso: ");
        peso=input.nextDouble();
        if(peso>0){
            pesoLua=peso*0.16;
            System.out.println("O seu peso na lua e: "+pesoLua);
        }else {
            System.out.println("Peso nao pode ser 0 ou negativo");
        }
    }
}
