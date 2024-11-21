package FichaPratica02;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int entrada;
        System.out.println("Opçoes de menu:\n1. Criar\n2. Atualizar\n3. Eleminar\n4. Sair");
        entrada=input.nextInt();
        switch (entrada){
            case 1:
                System.out.println("Opçao 1. Criar.");
                break;
            case 2:
                System.out.println("Opçao 2. Atualizar.");
                break;
            case 3:
                System.out.println("Opçao 3. Eleminiar.");
                break;
            case 4:
                System.out.println("Opçao 4. Sair.");
                break;
            default:
                System.out.println("Opçao invalida.");
        }
    }
}
