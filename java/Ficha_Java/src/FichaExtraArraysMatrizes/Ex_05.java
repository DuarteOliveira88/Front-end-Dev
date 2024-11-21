package FichaExtraArraysMatrizes;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        int[] array=new int[10];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Diga um num: ");
            array[i]=input.nextInt();
        }
        ArrayList<Integer> aux = new ArrayList<>();
        for(int i=0;i<10;i++){
            if(aux.contains(array[i])){
                System.out.println(array[i]);
            }else {
                aux.add(array[i]);
            }
        }
    }
}
