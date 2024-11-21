package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        int[] array=new int[15];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            System.out.print("Diga um num: ");
            array[i]=input.nextInt();
        }
        int countPar=0,countImp=0;
        for (int i = 0; i < 15; i++) {
            if(array[i]%2==0){
                countPar++;
            }else {
                countImp++;
            }
        }
        int[] arrayP =new int[countPar],arrayI=new int[countImp];
        int indexP=0,indexI=0;
        for(int num: array){
            if(num%2==0){
                arrayP[indexP++]=num;
            }else {
                arrayI[indexI++]=num;
            }
        }
        System.out.println("\nO array par:");
        for (int num: arrayP){
            System.out.println(num);
        }
        System.out.println("\nO array impar: ");
        for (int num: arrayI){
            System.out.println(num);
        }
    }
}
