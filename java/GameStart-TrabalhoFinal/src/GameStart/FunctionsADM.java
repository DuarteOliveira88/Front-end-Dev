package GameStart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static GameStart.Menus.filesMenu;
import static GameStart.PathFile.*;

public class FunctionsADM {
    /**
     * Funcao para confiar o login na plataforma
     * @param userName Username inserido pelo utilizador
     * @param pass pass iserida pelo utilizador
     * @return Se a pass e o userName estivrem na base de dados retorna false para sair do ciclo
     * @throws FileNotFoundException ficheiro pode nao existir
     */
    public static boolean userLogin(String userName,String pass) throws FileNotFoundException {
        Scanner in =new Scanner(new File(pathMenuFiles("login")));
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
        }while (!(option.equals("1")||option.equals("2")||option.equals("3")||option.toLowerCase().trim().equals("sair")));
        if(!option.equals("sair")) {
            Scanner in = new Scanner(new File(pathMenuFilesNum(Integer.parseInt(option)+1)));
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
        }
    }
    public static int numVendas() throws FileNotFoundException {
        Scanner in = new Scanner(new File(pathMenuFiles("vendas")));
        int numVendas=0;
        in.nextLine();
        while (in.hasNextLine()){
            numVendas++;
            in.nextLine();
        }
        return numVendas;
    }
    public static double valorVendas() throws FileNotFoundException {
        Scanner in = new Scanner(new File(pathMenuFiles("vendas")));
        double totalVendas=0;
        in.nextLine();
        while (in.hasNextLine()){
            String line=in.nextLine();
            String[] cont=line.split(";");
            totalVendas+=Double.parseDouble(cont[5]);
        }
        return totalVendas;
    }
    public static double totalLucro() throws FileNotFoundException {
        Scanner inVendas = new Scanner(new File(pathMenuFiles("vendas")));
        double lucroTotal=0;
        inVendas.nextLine();
        while (inVendas.hasNextLine()){
            String line=inVendas.nextLine();
            String[] cont=line.split(";");
            Scanner inCategorias=new Scanner(new File(pathMenuFiles("categorias")));
            inCategorias.nextLine();
            while (inCategorias.hasNextLine()){
                String percLucro=inCategorias.nextLine();
                String[] contPercLucro=percLucro.split(";");
                if(contPercLucro[0].equals(cont[3])){
                    lucroTotal+=Double.parseDouble(cont[5])*Double.parseDouble(contPercLucro[1])/100;
                }
            }
        }
        return lucroTotal;
    }
    public static void pesqCliente(String idCliente) throws FileNotFoundException {
        Scanner in = new Scanner(new File(pathMenuFiles("clientes")));
        in.nextLine();
        boolean notFind=true;
        while (in.hasNextLine()){
            String line=in.nextLine();
            String[] cont=line.split(";");
            if(cont[0].equals(idCliente)){
                notFind=false;
                System.out.println("******************** id "+idCliente+" ********************");
                System.out.println("Nome: "+cont[1]+"\t||\tTelemovel: "+cont[2]+"\nEmail: "+cont[3]);
                System.out.println("**********************************************");
            }
        }
        if (notFind){
            System.out.printf("Id cliente nao reconhecido.");
        }
    }
    public static String jogoCaro() throws FileNotFoundException {
        Scanner inVendas = new Scanner(new File(pathMenuFiles("vendas")));
        inVendas.nextLine();
        String jogoMaisCaro="";
        double valorJogo=0;
        while (inVendas.hasNextLine()){
            String line=inVendas.nextLine();
            String[] cont = line.split(";");
            if(Double.parseDouble(cont[5])>=valorJogo){
                valorJogo=Double.parseDouble(cont[5]);
                jogoMaisCaro=cont[4];
            }
        }
        return jogoMaisCaro;
    }
    public static double valorJogoCaro()throws FileNotFoundException{
        Scanner inVendas = new Scanner(new File(pathMenuFiles("vendas")));
        inVendas.nextLine();
        double valorJogo=0;
        while (inVendas.hasNextLine()){
            String line=inVendas.nextLine();
            String[] cont = line.split(";");
            if(Double.parseDouble(cont[5])>=valorJogo){
                valorJogo=Double.parseDouble(cont[5]);
            }
        }
        return valorJogo;
    }
    public static void imprimeJogoComprado(String jogo)throws FileNotFoundException{
        Scanner inVendas = new Scanner(new File(pathMenuFiles("vendas")));
        inVendas.nextLine();
        while (inVendas.hasNextLine()) {
            String line = inVendas.nextLine();
            String[] cont = line.split(";");
            if(cont[4].equals(jogo)){
                Scanner inClientes=new Scanner(new File(pathMenuFiles("clientes")));
                inClientes.nextLine();
                while (inClientes.hasNextLine()){
                    String lineClientes=inClientes.nextLine();
                    String[] contClientes=lineClientes.split(";");
                    if(cont[1].equals(contClientes[0])){
                        System.out.println(contClientes[1]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        //userLogin("it","rojao");
        //printFile();
        //System.out.println("Num de vendas: "+ numVendas()+"\nTotal de vendas: "+valorVendas());
        //System.out.println("O lucro total e: "+totalLucro());
        //pesqCliente("1");
        System.out.println(jogoCaro()+"\t||\t"+valorJogoCaro());
        imprimeJogoComprado(jogoCaro());
    }
}
