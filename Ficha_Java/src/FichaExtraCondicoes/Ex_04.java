package FichaExtraCondicoes;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String car;
        System.out.print("Diga uma letra: ");
        car=input.next().toUpperCase();
        if(car.equals("A")||car.equals("E")||car.equals("I")||car.equals("O")||car.equals("U")){
            System.out.print("E uma vogal");
        }else {
            System.out.println("E uma consoante");
        }
    }
}
