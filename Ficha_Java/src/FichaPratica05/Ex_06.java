package FichaPratica05;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,aux,cont=0;
        int[] array=new int[10];
        for (int i=0;i<10;i++){
            System.out.print("Diga um num: ");
            num=input.nextInt();
            array[i]=num;
        }
        aux=array[0];
        for (int i=1;i<10;i++){
            if(aux<array[i]){
                cont++;
            }
            aux=array[i];
        }
        System.out.println("Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + "\t");
        }
        if(cont==10-1){
            System.out.println("\nEsta em ordem crescente.");
        }else {
            System.out.println("\nNao esta.");
        }
    }
}
