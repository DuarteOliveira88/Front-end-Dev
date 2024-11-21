package FichaExtraCondicoes;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double preco,desconto;
        System.out.print("Diga o valor do produto: ");
        preco=input.nextDouble();
        if(preco>100){
            desconto=preco*0.9;
            System.out.print("Preço final:"+desconto+" (10% de desconto)");
        }else {
            System.out.println("Preço final:"+preco+" sem desconto.");
        }
    }
}
