package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        int[] array=new int[8];
        Scanner input=new Scanner(System.in);
        for (int i=0;i<8;i++){
            System.out.print("Diga um num: ");
            array[i]=input.nextInt();
        }
        System.out.print("Diga o num para procura: ");
        int aux= input.nextInt();
        int cont=0;
        for (int i = 0; i < 8; i++) {
            if(array[i]==aux){
                cont++;
            }
        }
        if(cont==0){
            System.out.println("O numero "+aux+" nao foi encontrado");
        }else {
            System.out.println("O numero "+aux+" foi encontrado "+cont+" vezes.");
        }
    }
}
