package GameStart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
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
    public static int contaLines(String path) throws FileNotFoundException {
        Scanner in = new Scanner(new File(path));
        in.nextLine();
        int numLinhas=0;
        while (in.hasNextLine()){
            numLinhas++;
            in.nextLine();
        }
        return numLinhas;
    }
    public static String melhorCliente() throws FileNotFoundException {
        Scanner in =new Scanner(new File(pathMenuFiles("vendas")));
        in.nextLine();
        double[] clientes=new double[contaLines(pathMenuFiles("clientes"))];
        while (in.hasNextLine()){
            String line=in.nextLine();
            String[] cont=line.split(";");
            clientes[Integer.parseInt(cont[1])-1]+=Double.parseDouble(cont[5]);
        }
        int id=-1;
        double aux=0;
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i]>=aux){
                aux=clientes[i];
                id=i+1;
            }
        }
        return String.valueOf(id);
    }
    public static void melhorCategoria() throws FileNotFoundException {
        Scanner in=new Scanner(new File(pathMenuFiles("vendas")));
        in.nextLine();
        double[] categorias=new double[contaLines(pathMenuFiles("categorias"))];
        String[][] matrizCategorias=new String[contaLines(pathMenuFiles("categorias"))][2];
        Scanner inCategorias=new Scanner(new File(pathMenuFiles("categorias")));
        inCategorias.nextLine();
        int indexMatriz=0;
        while (inCategorias.hasNextLine()){
            String[] cont=inCategorias.nextLine().split(";");
            matrizCategorias[indexMatriz][0]=cont[0];
            matrizCategorias[indexMatriz][1]=cont[1];
            indexMatriz++;
        }
        while (in.hasNextLine()){
            String[] cont=in.nextLine().split(";");
            for (int i = 0; i < contaLines(pathMenuFiles("categorias")); i++) {
                if(matrizCategorias[i][0].equals(cont[3])){
                    categorias[i]+=Double.parseDouble(cont[5])*Double.parseDouble(matrizCategorias[i][1])/100;
                }
            }
        }
        System.out.println(Arrays.toString(categorias));
        double aux=0;
        int indexMelhor=-1;
        for (int i = 0; i < categorias.length; i++) {
            if(categorias[i]>=aux){
                aux=categorias[i];
                indexMelhor=i;
            }
        }
        System.out.println("A melhor categoria e: "+matrizCategorias[indexMelhor][0]);
    }
    public static void main(String[] args) throws FileNotFoundException {
        //userLogin("it","rojao");
        //printFile();
        //System.out.println("Num de vendas: "+ numVendas()+"\nTotal de vendas: "+valorVendas());
        //System.out.println("O lucro total e: "+totalLucro());
        //pesqCliente("1");
        //System.out.println(jogoCaro()+"\t||\t"+valorJogoCaro());
        //imprimeJogoComprado(jogoCaro());
        //System.out.println("O id do melhor cliente e: "+melhorCliente());
        //pesqCliente(melhorCliente());
        melhorCategoria();
    }
}
