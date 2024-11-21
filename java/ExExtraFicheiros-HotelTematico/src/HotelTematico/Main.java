package HotelTematico;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static HotelTematico.Funcoes.*;
import static HotelTematico.Menus.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input=new Scanner(System.in);
        menuLogin();
        String userName,password;
        do {
            System.out.print("Diga o username: ");
            userName=input.next();
            System.out.print("Diga a password: ");
            password=input.next();
        }while (userLogin(userName,password));
    }
}