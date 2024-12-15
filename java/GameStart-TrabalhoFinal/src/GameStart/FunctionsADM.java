package GameStart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static GameStart.FunctionsClient.jogosSemDup;
import static GameStart.FunctionsClient.quantosJogosSemDup;
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
        in.close();
        return true;
    }

    /**
     * Funcao para escrever qualquer ficheiro disponivel ao ADM
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static void printFile() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String option;
        do {
            filesMenu();

        do {
            System.out.print("Input: ");
            option= input.next();
        }while (!(option.equals("1")||option.equals("2")||option.equals("3")||option.toLowerCase().trim().equals("sair")));
        System.out.println("------------------------------------------------------");
        if(!option.equals("sair")) {
            switch (String.valueOf(Integer.parseInt(option)+1)){
                case "2":
                    ficheiroCategorias(option);
                    break;
                case "3":
                    ficheiroClientes(option);
                    break;
                case "4":
                    ficheiroVendas(option);
                    break;
                default:
            }
        }
        }while (!option.toLowerCase().trim().equals("sair"));
        System.out.println("Voltando ao menu principal ADM");



    }

    /**
     * Funcao para escrever o ficheiro das categorias formatado
     * @param option Posicao do path na funcao
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static void ficheiroCategorias(String option) throws FileNotFoundException {
        Scanner in = new Scanner(new File(pathMenuFilesNum(Integer.parseInt(option)+1)));
        System.out.printf("%-15s   %-10s%n", "Nome Categoria", "Percentagem");
        in.nextLine();
        while (in.hasNextLine()) {
            String[] cont =in.nextLine().split(";");
            System.out.printf("%-15s | %-10s%n", cont[0], cont[1]);
        }
        in.close();
    }

    /**
     * Funcao para escrever o ficheiro dos clientes formatado
     * @param option Posicao do path na funcao
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static void ficheiroClientes(String option) throws FileNotFoundException {
        Scanner in = new Scanner(new File(pathMenuFilesNum(Integer.parseInt(option)+1)));
        in.nextLine();
        System.out.printf("%-4s   %-22s   %-15s   %-30s%n", "ID", "Nome", "Telemóvel", "Email");
        while (in.hasNextLine()) {
            String[] cont =in.nextLine().split(";");
            System.out.printf("%-4s | %-22s | %-15s | %-30s%n", cont[0], cont[1], cont[2], cont[3]);
        }
        in.close();
    }

    /**
     * Funcao para escrever o ficheiro das vendas formatado
     * @param option Posicao do path na funcao
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static void ficheiroVendas(String option) throws FileNotFoundException {
        Scanner in = new Scanner(new File(pathMenuFilesNum(Integer.parseInt(option)+1)));
        in.nextLine();
        System.out.printf("%-10s  %-10s    %-21s   %-15s   %-32s   %-10s%n", "ID Venda", "ID Cliente", "Editora", "Categoria", "Jogo", "Valor");
        while (in.hasNextLine()) {
            String[] cont =in.nextLine().split(";");
            System.out.printf("%-10s | %-10s | %-21s | %-15s | %-32s | %-10s%n", cont[0], cont[1], cont[2], cont[3], cont[4], cont[5]);
        }
        in.close();
    }

    /**
     * Funcao para saber o numero de vendas
     * @return numero de vendas
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static int numVendas() throws FileNotFoundException {
        Scanner in = new Scanner(new File(pathMenuFiles("vendas")));
        int numVendas=0;
        in.nextLine();
        while (in.hasNextLine()){
            numVendas++;
            in.nextLine();
        }
        in.close();
        return numVendas;
    }

    /**
     * Funcao para calcular o valor total das vendas
     * @return valor total das vendas
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static double valorVendas() throws FileNotFoundException {
        Scanner in = new Scanner(new File(pathMenuFiles("vendas")));
        double totalVendas=0;
        in.nextLine();
        while (in.hasNextLine()){
            String line=in.nextLine();
            String[] cont=line.split(";");
            totalVendas+=Double.parseDouble(cont[5]);
        }
        in.close();
        return totalVendas;
    }

    /**
     * Funcao para calcular o valor total do lucro das vendas
     * @return valor total do lucro das vendas
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
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
        inVendas.close();
        return lucroTotal;
    }

    /**
     * Funcao para pesquisar e escrever todas as informaçoes de um cliente dado o seu id
     * @param idCliente id que se pretende pesquisar
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
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
                System.out.println("***********************************************");
            }
        }
        if (notFind){
            System.out.printf("Id cliente nao reconhecido.");
        }
        in.close();
    }

    /**
     * Funcao para saber qual jogo e o mais caro
     * @return jogo mais caro
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
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
        inVendas.close();
        return jogoMaisCaro;
    }

    /**
     * Funcao para saber o valor do jogo mais caro
     * @return valor do jogo mais caro
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
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
        inVendas.close();
        return valorJogo;
    }

    /**
     * Funcao para imprimir O nome dos clientes que compram o jogo
     * @param jogo Jogo que os clientes compraram
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static void imprimeJogoComprado(String jogo)throws FileNotFoundException{
        Scanner inVendas = new Scanner(new File(pathMenuFiles("vendas")));
        inVendas.nextLine();
        System.out.println("************** Clientes que compraram "+jogo+" **************");
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
        System.out.println("**************************************************************");
        inVendas.close();
    }

    /**
     * Funcao para contar as linhas de um ficheiro
     * @param path Caminho do ficheiro
     * @return numero de linhas
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static int contaLines(String path) throws FileNotFoundException {
        Scanner in = new Scanner(new File(path));
        in.nextLine();
        int numLinhas=0;
        while (in.hasNextLine()){
            numLinhas++;
            in.nextLine();
        }
        in.close();
        return numLinhas;
    }

    /**
     * Funcao para saber quem e o melhor cliente
     * @return id do melhor cliente
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
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
        in.close();
        return String.valueOf(id);
    }

    /**
     * Funcao para imprimir a melhor categoria
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
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
        double aux=0;
        int indexMelhor=-1;
        for (int i = 0; i < categorias.length; i++) {
            if(categorias[i]>=aux){
                aux=categorias[i];
                indexMelhor=i;
            }
        }
        in.close();
        inCategorias.close();
        System.out.println("A melhor categoria e: "+matrizCategorias[indexMelhor][0]);
    }

    /**
     * Funcao para imprimir todas as informaçoes dos clientes que compraram um jogo
     * @param jogo jogo em questao
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static void pesquisaVendas(String jogo) throws FileNotFoundException {
        Scanner inVendas = new Scanner(new File(pathMenuFiles("vendas")));
        inVendas.nextLine();
        System.out.println("************ Clientes Compraram ***************");
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
                        pesqCliente(contClientes[0]);
                    }
                }
            }
        }
        inVendas.close();
        System.out.println("***********************************************");
    }

    /**
     * Funcao que retorna uma matriz com todos os jogos e quanto cada um locrou
     * @return matriz com todos os jogos e quanto cada um locrou
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static String[][] matrizJogosLucro() throws FileNotFoundException {
        String[][] jogosLucro = new String[quantosJogosSemDup()][2];
        Scanner in = new Scanner(new File(pathMenuFiles("vendas")));
        in.nextLine();
        String[] jogosSemDup=jogosSemDup();
        int index=0;
        for(String jogo: jogosSemDup){
            jogosLucro[index][0]=jogo;
            jogosLucro[index][1]="0";
            index++;
        }
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
            String[] cont =in.nextLine().split(";");
            for (int i = 0; i < jogosSemDup.length; i++) {
                if(jogosLucro[i][0].equals(cont[4])){
                    for (int j = 0; j < contaLines(pathMenuFiles("categorias")); j++) {
                        if(matrizCategorias[j][0].equals(cont[3])){
                            jogosLucro[i][1]=String.valueOf(Double.parseDouble(jogosLucro[i][1])+(Double.parseDouble(cont[5])*Double.parseDouble(matrizCategorias[j][1])/100));
                        }
                    }
                }
            }
        }
        in.close();
        inCategorias.close();
        return jogosLucro;
    }

    /**
     * Funcao para ordenar por ordem crescente a matriz dos jogos com o seu respetivo lucro
     * @param matriz matriz dos jogos com o seu respetivo lucro
     * @return matriz dos jogos ordenada por ordem crescente
     */
    public static String[][] organizaMatriz(String[][] matriz){
        boolean trocou;
        for (int i = 0; i < matriz.length-1; i++) {
            trocou=false;
            for (int j = 0; j < matriz.length-1-i; j++) {
                if(Double.parseDouble(matriz[j][1])>Double.parseDouble(matriz[j+1][1])){
                    String auxNome=matriz[j][0];
                    String auxValor=matriz[j][1];
                    matriz[j][0]=matriz[j+1][0];
                    matriz[j+1][0]=auxNome;
                    matriz[j][1]=matriz[j+1][1];
                    matriz[j+1][1]=auxValor;
                    trocou=true;
                }
            }
            if (!trocou) {
                break;
            }
        }
        return matriz;
    }

    /**
     * Funcao para escrever os TOP 5 jogos que mais a loja mais lucrou
     * @param matrizOrdenada matriz com jogos e respetivos lucros ordenada
     */
    public static void top5Jogos(String[][] matrizOrdenada){
        System.out.println("********** TOP 5 Jogos **********");
        System.out.printf("%-4s   %-25s   %-10s%n", "Nº", "Jogo", "Lucrou");
        int lugar=1;
        for (int i = matrizOrdenada.length-1; i > matrizOrdenada.length-6 ; i--) {
            System.out.printf("%-4s | %-25s | %-10s%n",lugar,matrizOrdenada[i][0],matrizOrdenada[i][1]);
            lugar++;
        }
    }

    /**
     * Funcao para escrever os BOTTOM 5 jogos que mais a loja mais lucrou
     * @param matrizOrdenada matriz com jogos e respetivos lucros ordenada
     */
    public static void  bot5Jogos(String[][] matrizOrdenada){
        System.out.println("********** BOTTOM 5 Jogos **********");
        System.out.printf("%-4s   %-30s   %-10s%n", "Nº", "Jogo", "Lucrou");
        for (int i = 0; i < 5 ; i++) {
            System.out.printf("%-4s | %-30s | %-10s%n",i+1,matrizOrdenada[i][0],matrizOrdenada[i][1]);
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
        pesquisaVendas(jogoCaro());
        //System.out.println("O id do melhor cliente e: "+melhorCliente());
        //pesqCliente(melhorCliente());
        //melhorCategoria();
        //String[][] jogosLucroMatriz=matrizJogosLucro();
        //String[][] jogosOrdenados=organizaMatriz(matrizJogosLucro());
        //top5Jogos(jogosOrdenados);
        //bot5Jogos(jogosOrdenados);
        //pesquisaVendas("Sims 4 Digital Deluxe");
    }
}
