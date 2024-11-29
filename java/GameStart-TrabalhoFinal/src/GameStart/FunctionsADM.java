package GameStart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static GameStart.Menus.filesMenu;

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
        String[] path=new String[4];//criar num ficheiro a parte chamado pathFile
        path[0]="Files/GameStart_AdminLogin.csv";
        path[1]="Files/GameStart_Categorias.csv";
        path[2]="Files/GameStart_Clientes.csv";
        path[3]="Files/GameStart_Vendas.csv";
        Scanner in = new Scanner(new File(path[Integer.parseInt(option)-1]));
        while (in.hasNextLine()){
            String line=in.nextLine();
            System.out.println(line);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        printFile();
    }
}
