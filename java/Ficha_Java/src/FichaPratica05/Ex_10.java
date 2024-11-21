package FichaPratica05;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        int num,cont=0;
        int[][] array=new int[3][5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Diga um num: ");
                num=input.nextInt();
                array[i][j]=num;
            }
        }
        System.out.print("Insira um num pa pesquisar: ");
        num=input.nextInt();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if(array[i][j]==num){
                    cont++;
                }
            }
        }
        System.out.println("Ha "+cont+" posicoes na matriz com o num "+num);
    }
}
