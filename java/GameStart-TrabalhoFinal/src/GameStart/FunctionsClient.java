package GameStart;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static GameStart.FunctionsADM.*;
import static GameStart.Menus.CGraficMenu;
import static GameStart.PathFile.*;

public class FunctionsClient {
    /**
     * Funcao para adicionar cliente
     * @param nome nome cliente
     * @param telemovel numero de telemovel
     * @param email email do cliejnte
     * @throws IOException Caso nao encontre ficheiro
     */
    public static void addCliente(String nome, String telemovel, String email) throws IOException {
        int id = contaLines(pathMenuFiles("clientes")) + 1;
        String line = id + ";" + nome + ";" + telemovel + ";" + email;
        FileWriter writer = new FileWriter(new File(pathMenuFiles("clientes")), true);
        writer.write("\n" + line);
        System.out.println("Cliente adicionado.");
        writer.close();
    }

    /**
     * Funcao para verificar se ja existe um cliente com esses dados
     * @param nome nome a verificar
     * @param telemovel telemovel a verificar
     * @param email email a verificar
     * @return true se existe, false se nao existe
     * @throws FileNotFoundException Caso nao encontre o ficheirp
     */
    public static boolean existeCliente(String nome, String telemovel, String email) throws FileNotFoundException {
        Scanner in=new Scanner(new File(pathMenuFiles("clientes")));
        in.nextLine();
        while (in.hasNextLine()){
            String[] cont=in.nextLine().split(";");
            if(nome.equals(cont[1])&&telemovel.equals(cont[2])&&email.equals(cont[3])){
                return true;
            }
        }
        return false;
    }
    /**
     * Funcao para saber quantos jogos existem sem contar duplicados
     * @return numero de jogs sem contar duplicados
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static int quantosJogosSemDup() throws FileNotFoundException {
        String[] editoras = new String[contaLines(pathMenuFiles("vendas"))];
        int numJogos = 0;
        Scanner in = new Scanner(new File(pathMenuFiles("vendas")));
        in.nextLine();
        while (in.hasNextLine()) {
            String[] cont = in.nextLine().split(";");
            String jogoAtual = cont[4];
            boolean jogoJaExiste = false;
            for (int i = 0; i < numJogos; i++) {
                if (editoras[i].equals(jogoAtual)) {
                    jogoJaExiste = true;
                    break;
                }
            }
            if (!jogoJaExiste) {
                editoras[numJogos] = jogoAtual;
                numJogos++;
            }
        }
        in.close();
        return numJogos;
    }

    /**
     * Funcao para criar um array com os jogos sem duplicados
     * @return Array de jogos sem duplicados
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static String[] jogosSemDup() throws FileNotFoundException {
        Scanner in = new Scanner(new File(pathMenuFiles("vendas")));
        in.nextLine();
        String[] jogosSemDup = new String[quantosJogosSemDup()];
        int index = 0;
        while (in.hasNextLine()) {
            boolean naoTem = true;
            String[] cont = in.nextLine().split(";");
            String jogo=cont[4];
            for (int i = 0; i < index; i++) {
                if(jogo.equals(jogosSemDup[i])){
                    naoTem=false;
                }
            }
            if (naoTem) {
                jogosSemDup[index++] = cont[4];
            }
        }
        in.close();
        return jogosSemDup;
    }

    /**
     * Funcao para dizer se um numero e ou nao triangular
     * @param num num em questao
     * @return true se for triangular, false se nao for triangular
     */
    public static boolean triangular(int num) {
        int soma = 0;
        for (int i = 1; i <= num; i++) {
            soma += i;
            if (soma >= num) {
                i = num;
            }
        }
        return soma == num;
    }

    /**
     * Funao para imprimir quais lugares estao vagos
     */
    public static void lugarVago() {
        System.out.println("-------- Lugar vagos --------");
        for (int i = 1; i <= 121; i++) {
            if (triangular(i) && i % 5 == 0) {
                System.out.println("Tem uma vaga no lugar: " + i);
            }
        }
        System.out.println("--------------------------");
    }

    /**
     * Funcao para imprimir o catalogo dos jogos sem repetir
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static void imprimeCatalogoJogos() throws FileNotFoundException, InterruptedException {
        String[][] matrizJogos = organizaMatriz(matrizJogosLucro());
        System.out.println("******************** Catalogo Jogos ********************");
        for (int i = 0; i < matrizJogos.length; i++) {
            System.out.println((i + 1) + " | " + matrizJogos[i][0]);
        }
        System.out.println("******************************************************");
        Thread.sleep(3000);
    }


    /**
     * Funcao para imprimir um jogo do catalogo grafico
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static void imprimeCatalogoGrafico() throws FileNotFoundException {
        String option;
        do {
        CGraficMenu();
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        option = input.next();
        if(option.equals("sair")){
            break;
        }
        Scanner in = new Scanner(new File(catalogoGrafico(option)));
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
        in.close();
        }while (!option.equals("sair"));

    }

    /**
     * Funcao para criar um array com todas as categorias do ficheiro categorias
     * @return array com todas as categorias
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static String[] arrayCategorias() throws FileNotFoundException {
        String[] arrayCategorias = new String[contaLines(pathMenuFiles("categorias"))];
        Scanner in = new Scanner(new File(pathMenuFiles("categorias")));
        in.nextLine();
        int index = 0;
        while (in.hasNextLine()) {
            String[] cont = in.nextLine().split(";");
            arrayCategorias[index++] = cont[0];
        }
        in.close();
        return arrayCategorias;
    }

    /**
     * Funcao para saber se ainda existe alguma linha,no resto do ficheiro, com o mesmo jogo
     * @param jogo Jogo pretendido
     * @param idVenda idVenda serve como um indicador da em que linha esta o jogo
     * @return true se ainda tiver algum jogo igual e false se nao tiver nenhum jogo igual
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static boolean aindaDentro(String jogo, String idVenda) throws FileNotFoundException {
        Scanner in = new Scanner(new File(pathMenuFiles("vendas")));
        in.nextLine();
        while (in.hasNextLine()) {//avança ate estar na mesma linha de venda que o id para fazer a comparaçao com o resto do ficheiro
            String[] cont = in.nextLine().split(";");
            if (idVenda.equals(cont[0])) {
                break;
            }
        }
        while (in.hasNextLine()) {
            String[] cont = in.nextLine().split(";");
            if (cont[4].equals(jogo)) {
                in.close();
                return true;
            }
        }
        in.close();
        return false;
    }

    /**
     * Funcao para imprimir o catalogo de jogos de uma editora sem repetir
     * @param editora Editora desejada
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static void imprimeCatalogoEditora(String editora) throws FileNotFoundException {
        String[] arrayCategorias = arrayCategorias();
        System.out.println("************ " + editora + " ************");
        for (int i = 0; i < arrayCategorias.length; i++) {
            System.out.println("\n--------- " + arrayCategorias[i] + " ---------");
            boolean escreveu = false;
            Scanner in = new Scanner(new File(pathMenuFiles("vendas")));
            in.nextLine();
            while (in.hasNextLine()) {
                String[] cont = in.nextLine().split(";");
                if (cont[3].equals(arrayCategorias[i]) && cont[2].equalsIgnoreCase(editora)) {
                    if (!aindaDentro(cont[4], cont[0])) {
                        System.out.println(cont[4]);
                        escreveu = true;
                    }
                }
            }
            if (!escreveu) {
                System.out.println("Nao temos titulos disponiveis da " + editora + " para a categoria " + arrayCategorias[i]);
            }
            System.out.println("---------------------------");
            in.close();
        }
        System.out.println("************************************");
    }

    /**
     * Funcao para contar o numero de editoras presentes no ficheiro vendas
     * @return Numero de editoras
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static int contaEditoras() throws FileNotFoundException {
        String[] editoras = new String[contaLines(pathMenuFiles("vendas"))];
        int numEditoras = 0;
        Scanner in = new Scanner(new File(pathMenuFiles("vendas")));
        in.nextLine();
        while (in.hasNextLine()) {
            String[] cont = in.nextLine().split(";");
            String editoraAtual = cont[2];
            boolean editoraJaExiste = false;
            for (int i = 0; i < numEditoras; i++) {
                if (editoras[i].equals(editoraAtual)) {
                    editoraJaExiste = true;
                    break;
                }
            }
            if (!editoraJaExiste) {
                editoras[numEditoras] = editoraAtual;
                numEditoras++;
            }
        }
        in.close();
        return numEditoras;
    }

    /**
     * Funcao para crirar um array com todas as editoras presentes no ficheiro vendas sem repetir
     * @return array de editoras
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static String[] arrayEditoras() throws FileNotFoundException {
        String[] arrayEditoras = new String[contaEditoras()];
        Scanner in = new Scanner(new File(pathMenuFiles("vendas")));
        in.nextLine();
        int index = 0;
        while (in.hasNextLine()) {
            boolean naoEstaDentro = true;
            String[] cont = in.nextLine().split(";");
            for (int i = 0; i < arrayEditoras.length; i++) {
                if (cont[2].equals(arrayEditoras[i])) {
                    naoEstaDentro = false;
                }
            }
            if (naoEstaDentro) {
                arrayEditoras[index] = cont[2];
                index++;
            }
        }
        in.close();
        return arrayEditoras;
    }

    /**
     * Funcao para imprimir todos os jogos sem repetir de uma determinada categoria
     * @param categoria Categoria de jogo desejada
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static void imprimeCatalogoCategoria(String categoria) throws FileNotFoundException {
        String[] editoras=arrayEditoras();
        System.out.println("************ Categoria " + categoria + " ************");
        for (int i = 0; i < editoras.length; i++) {
            System.out.println("\n--------- " + editoras[i] + " ---------");
            boolean escreveu = false;
            Scanner in = new Scanner(new File(pathMenuFiles("vendas")));
            in.nextLine();
            while (in.hasNextLine()) {
                String[] cont = in.nextLine().split(";");
                if (cont[2].equals(editoras[i]) && cont[3].equalsIgnoreCase(categoria)) {
                    if (!aindaDentro(cont[4], cont[0])) {
                        System.out.println(cont[4]);
                        escreveu = true;
                    }
                }
            }
            if (!escreveu) {
                System.out.println("Nao temos titulos disponiveis da " +editoras[i]  + " para a categoria " +categoria );
            }
            System.out.println("---------------------------");
            in.close();
        }
        System.out.println("************************************");
    }

    /**
     * Funcao para imprimir os 3 jogos mais recentes
     * @throws FileNotFoundException Caso nao encontre ficheiro
     */
    public static void imprimeJogoRecente() throws FileNotFoundException {
        String[] jogos=jogosSemDup();
        System.out.println("******** Jogos Mais Recentes ********");
        int lugar=1;
        for (int i = jogos.length-1; i > jogos.length-1-3; i--) {
            System.out.println(lugar+"º - "+jogos[i]);
            lugar++;
        }
    }


    public static void main(String[] args) throws IOException {
        System.out.println("Tem "+quantosJogosSemDup()+" jogos.");
        String[] jogosSemDup=new String[quantosJogosSemDup()];
        jogosSemDup=jogosSemDup();
        for(String jogo : jogosSemDup){
            System.out.println(jogo);
        }
        //addCliente("Duarte","99","abd");
        //lugarVago();
        //imprimeCatalogoJogos();
        //imprimeCatalogoGrafico();
        //String[] arrayCategorias=arrayCategorias();
        imprimeCatalogoEditora("EA");
        /*System.out.println(contaEditoras());
        String[] arrayEditoras = arrayEditoras();
        for (String editora : arrayEditoras) {
            System.out.println(editora);
        }*/
        //imprimeCatalogoCategoria("Desporto");
        imprimeJogoRecente();

    }
}
