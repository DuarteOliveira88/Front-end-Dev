package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_09  {
    public static void main(String[] args) {
        int[] array=new int[10];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Diga um num: ");
            array[i]=input.nextInt();
        }
        int aux=array[0];
        for (int i = 1; i < 10; i++) {
            if(array[i]<array[i-1]){
                aux=i;
                while (aux>0){
                    if(array[aux]<array[aux-1]){
                        int aux2=array[aux-1];
                        array[aux-1]=array[aux];
                        array[aux]=aux2;
                        aux--;
                    }else{
                        aux=0;
                    }
                }
            }
        }
        for(int num:array){
            System.out.println(num);
        }
    }
}
