package FichaPratica06;
import java.util.Scanner;

import static FichaPratica06.Ex_05.*;
public class Ex_06 {
    public static void main(String[] args) {
        int tamanho,user=0,aux;
        Scanner input =new Scanner(System.in);
        System.out.print("Diga o tamanho do vetor: ");
        tamanho=input.nextInt();
        int[] vetor= new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Diga um num: ");
            user=input.nextInt();
            vetor[i]=user;
        }
        while (user!=-1){
            System.out.println("Menu:\n1. Maior elemento.\n2. Menor elemento\n3. Crescente ou nao.\n4. Sair do programa.");
            user=input.nextInt();
            switch (user){
                case 1:
                    aux=maior(vetor);
                    System.out.println("O maior elemento e: "+aux);
                    break;
                case 2:
                    aux=menor(vetor);
                    System.out.println("O menor elemento e: "+aux);
                    break;
                case 3:
                    System.out.println("E crescente? "+crescente(vetor));
                    break;
                case 4:
                    System.out.println("Saindo do programa");
                    user=-1;
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }
    }
}
