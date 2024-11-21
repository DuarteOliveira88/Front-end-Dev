package FichaPratica01;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double preco1,preco2,preco3,pagamento;
        System.out.print("Introduza o valor do 1 produto: ");
        preco1=input.nextDouble();
        System.out.print("Introduza o valor do 2 produto: ");
        preco2=input.nextDouble();
        System.out.print("Introduza o valor do 3 produto: ");
        preco3=input.nextDouble();
        pagamento=(preco1+preco3+preco2);
        System.out.println("O total da soma: " +pagamento);
        pagamento=pagamento*0.9;
        System.out.println("O total a pagar e: "+pagamento);
    }
}
