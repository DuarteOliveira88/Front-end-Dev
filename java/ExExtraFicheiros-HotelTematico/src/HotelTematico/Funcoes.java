package HotelTematico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Funcoes {
    public static boolean ficheiroComparar(String path, String objeto,int index) throws FileNotFoundException {
        Scanner in =new Scanner(new File(path));
        while (in.hasNextLine()){
            String linha= in.nextLine();
            String[] content=linha.split(";");
            if(content[index].equals(objeto)){
                return true;
            }
        }
        return false;
    }

    /**
     * Funcao para confiar o login na plataforma
     * @param userName Username inserido pelo utilizador
     * @param pass pass iserida pelo utilizador
     * @return Se a pass e o userName estivrem na base de dados retorna false para sair do ciclo
     * @throws FileNotFoundException ficheiro pode nao existir
     */
    public static boolean userLogin(String userName,String pass) throws FileNotFoundException {
        Scanner in =new Scanner(new File("Files/loginHotel.txt"));
        boolean passIncorreta=true;
        while (in.hasNextLine()){
            String linha= in.nextLine();
            String[] content=linha.split(";");
            if(content[0].equals(userName)){
                if (content[1].equals(pass)){
                    System.out.print("------------------------------------------------\n");
                    System.out.println("Sucesso em logar");
                    System.out.print("------------------------------------------------\n");
                    return false;
                }else {
                    passIncorreta=false;
                    System.out.print("------------------------------------------------\n");
                    System.out.println("PALAVRA PASS INCORRETA.");
                    System.out.print("------------------------------------------------\n");
                }
            }
        }
        if(passIncorreta) {
            System.out.print("------------------------------------------------\n");
            System.out.println("USERNAME NAO RECONHECIDO");
            System.out.print("------------------------------------------------\n");
        }
        return true;
    }
}
