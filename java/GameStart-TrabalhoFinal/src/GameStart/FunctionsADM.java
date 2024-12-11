package GameStart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static GameStart.Menus.filesMenu;
import static GameStart.PathFile.pathMenuFilesNum;

public class FunctionsADM {
    /**
     * Funcao para confiar o login na plataforma
     * @param userName Username inserido pelo utilizador
     * @param pass pass iserida pelo utilizador
     * @return Se a pass e o userName estivrem na base de dados retorna false para sair do ciclo
     * @throws FileNotFoundException ficheiro pode nao existir
     */
    public static boolean userLogin(String userName,String pass) throws FileNotFoundException {
        Scanner in =new Scanner(new File("Files/GameStart_AdminLogin.csv"));
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
    public static void printFile() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        filesMenu();
        String option;
        do {
            System.out.print("Input: ");
            option= input.next();
        }while (!(option.equals("1")||option.equals("2")||option.equals("3")||option.equals("4")||option.toLowerCase().trim().equals("sair")));
        String path=pathMenuFilesNum(Integer.parseInt(option)-1);
        Scanner in = new Scanner(new File(pathMenuFilesNum(Integer.parseInt(option)-1)));
        while (in.hasNextLine()){
            String line=in.nextLine();
            System.out.println(line);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        printFile();
    }
}
