package FichaPratica04;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.print("Selecione uma opcao:\n1.Criar\n2.Atualizar\n3.Eleminar\n4.Sair\n");
            num=input.nextInt();
            switch (num){
                case 1:
                    System.out.println("Criando.");
                    break;
                case 2:
                    System.out.println("Atualizando.");
                    break;
                case 3:
                    System.out.println("Eleminando");
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opçao nao reconhecida");
            }
        }while (num != 4);
    }
}
