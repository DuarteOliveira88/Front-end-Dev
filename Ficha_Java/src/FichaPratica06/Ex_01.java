package FichaPratica06;

import java.util.Scanner;

public class Ex_01 {
    public static void fazerBarulho(String animal){
        switch (animal.toLowerCase()){
            case "cao":
                System.out.println("Au au au");
                break;
            case "gato":
                System.out.println("Miau");
                break;
            case "peixe":
                System.out.println("Glub glub");
            case "porco":
                System.out.println("Oinc");
                break;
            default:
                System.out.println("Animal nao detetado");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Diga um animal");
        String animal=input.next();
        fazerBarulho(animal);
    }
}
