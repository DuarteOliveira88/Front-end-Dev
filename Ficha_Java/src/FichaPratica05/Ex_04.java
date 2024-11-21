package FichaPratica05;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        int num, menor;
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Diga um num: ");
        num = input.nextInt();
        array[0] = num;
        menor = num;
        for (int i = 1; i < 10; i++) {
            System.out.print("Diga um num: ");
            num = input.nextInt();
            array[i] = num;
            if (num <= menor) {
                menor = num;
            }
        }
        System.out.println("Do array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nO numero maior e: " + menor);
    }
}

