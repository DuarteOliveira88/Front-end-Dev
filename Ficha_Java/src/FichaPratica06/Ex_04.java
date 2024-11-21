package FichaPratica06;
import java.util.Scanner;

import static FichaPratica06.Ex_03.*;


public class Ex_04 {
    public static int menu(int opcao){
        Scanner input=new Scanner(System.in);
        System.out.println("Prima:\n1 para par\n2 para positivo1\n3 para primo\n4 para perfeito\n5 para triangular\n6 para trocar de num\n7 para sair do menu");
        opcao=input.nextInt();
        return opcao;
    }
    public static void main(String[] args) {
        int numero,opcao=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Diga um num: ");
        numero=input.nextInt();
        do{
            opcao=menu(1);
            switch (opcao){
                case 1:
                    if(par(numero)){
                        System.out.println("Par");
                    }else {
                        System.out.println("Impar");
                    }
                    break;
                case 2:
                    if(positivo(numero)){
                        System.out.println("Positivo");
                    }else {
                        System.out.println("Negativo");
                    }
                    break;
                case 3:
                    if(primo(numero)){
                        System.out.println("Primo");
                    }else {
                        System.out.println("Nao primo");
                    }
                    break;
                case 4:
                    if(perfeito(numero)){
                        System.out.println("Perfeito");
                    }else {
                        System.out.println("Imperfeito");
                    }
                    break;
                case 5:
                    if(triangular(numero)){
                        System.out.println("Triangular");
                    }else {
                        System.out.println("Nao triangular");
                    }
                    break;
                case 6:
                    System.out.print("Diga um num: ");
                    numero= input.nextInt();
                    break;
                case 7:
                    System.out.println("Saindo do programa.");
                    opcao=-1;
                    break;
                default:
                    System.out.println("Opçao invalida");
            }
        }while (opcao!=-1);
    }
}
