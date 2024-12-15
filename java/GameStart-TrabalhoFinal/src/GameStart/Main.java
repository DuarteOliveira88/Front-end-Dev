package GameStart;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static GameStart.PathFile.*;
import static GameStart.Menus.*;
import static GameStart.FunctionsADM.*;
import static GameStart.FunctionsClient.*;


public class Main {
    /**
     * Funcao para iniciar o programa e escrever um ascii art
     *
     * @throws FileNotFoundException Caso nao exista ficheiro
     */
    public static void loadInicio() throws FileNotFoundException {
        Scanner in = new Scanner(new File("Files/inicio.txt"));
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
        in.close();
    }

    /**
     * Funcao para encerrar o programa e escrever uma asciiart
     *
     * @throws FileNotFoundException Caso nao exista ficheiro
     * @throws InterruptedException  para dar sleep??
     */
    public static void loadFim() throws FileNotFoundException, InterruptedException {
        System.out.println("Encerrando programa...");
        Thread.sleep(1000);
        Scanner in = new Scanner(new File("Files/GameStart_Copyright.txt"));
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
        in.close();
    }

    /**
     * Programa da loja GameStart
     *
     * @throws FileNotFoundException Caso nao exista ficheiros
     * @throws InterruptedException  Para fazer a inprecao de loading??
     */
    public static void GameStart() throws IOException, InterruptedException {
        loadInicio();
        Thread.sleep(3000);
        mainMenu();
        String menuInicial;
        String userName;
        String passWord;
        String menuADM;
        String menuCliente;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Input: ");
            menuInicial = input.nextLine();
        } while (!(menuInicial.equals("1") || menuInicial.equals("2") || menuInicial.equals("sair")));


        switch (menuInicial) {
            case "1":
                loginMenu();
                do {
                    System.out.print("Username: ");
                    userName = input.nextLine();
                    System.out.print("Password: ");
                    passWord = input.nextLine();
                } while (userLogin(userName, passWord));
                do {
                    do {
                        adimMenu();
                        System.out.print("Input: ");
                        menuADM = input.nextLine();
                        System.out.println("------------------------------------------------------");
                    } while (!(menuADM.equals("1") || menuADM.equals("2") || menuADM.equals("3") ||
                            menuADM.equals("4") || menuADM.equals("5") || menuADM.equals("6") ||
                            menuADM.equals("7") || menuADM.equals("8") || menuADM.equals("9") ||
                            menuADM.equals("10") || menuADM.equals("sair")));
                    String option;
                    String[][] jogosOrdenados = organizaMatriz(matrizJogosLucro());
                    switch (menuADM) {
                        case "1":
                            printFile();
                            Thread.sleep(1000);
                            break;
                        case "2":
                            System.out.println("-----------------");
                            System.out.println("Numero de vendas: " + numVendas() + "\nValor total: " + valorVendas());
                            System.out.println("-----------------");
                            Thread.sleep(1000);
                            break;
                        case "3":
                            System.out.println("---------------------");
                            System.out.println("Total de lucro: " + totalLucro());
                            System.out.println("---------------------");
                            Thread.sleep(1000);
                            break;
                        case "4":

                            System.out.print("Dgite o id do cliente desejado: ");
                            option = input.nextLine();
                            pesqCliente(option);
                            Thread.sleep(1000);
                            break;
                        case "5":
                            System.out.println("----------------------------");
                            System.out.println("O jogo mais caro e: " + jogoCaro() + "\nValor: " + valorJogoCaro());
                            System.out.println("----------------------------");
                            Thread.sleep(1000);
                            break;
                        case "6":
                            System.out.println("----------------------------");
                            System.out.println("O nosso melhor cliente e:");
                            pesqCliente(melhorCliente());
                            System.out.println("----------------------------");
                            Thread.sleep(1000);
                            break;
                        case "7":
                            System.out.println("----------------------------");
                            melhorCategoria();
                            System.out.println("----------------------------");
                            Thread.sleep(1000);
                            break;
                        case "8":
                            System.out.print("Digite o nome do jogo desejado: ");
                            String jogo = input.nextLine();
                            pesquisaVendas(jogo);
                            Thread.sleep(1000);
                            break;
                        case "9":
                            top5Jogos(jogosOrdenados);
                            Thread.sleep(1000);
                            break;
                        case "10":
                            bot5Jogos(jogosOrdenados);
                            Thread.sleep(1000);
                            break;
                        case "sair":
                            loadFim();
                            break;
                    }
                } while (!menuADM.equals("sair"));
                break;
            case "2":
                do {
                    do {
                        clientMenu();
                        System.out.print("Input: ");
                        menuCliente = input.nextLine();
                        System.out.println("------------------------------------------------------");
                    } while (!(menuCliente.equals("1") || menuCliente.equals("2") || menuCliente.equals("3") ||
                            menuCliente.equals("4") || menuCliente.equals("5") || menuCliente.equals("6") ||
                            menuCliente.equals("7") || menuCliente.equals("sair")));
                    switch (menuCliente) {
                        case "1":
                            String nome,telemovel,email;
                            System.out.print("Nome: ");
                            nome=input.nextLine();
                            System.out.print("Telemovel: ");
                            telemovel=input.nextLine();
                            System.out.print("Emial: ");
                            email=input.nextLine();
                            if(!existeCliente(nome,telemovel,email)){
                                addCliente(nome,telemovel,email);
                            }else {
                                System.out.println("Ja existe um cliente com os mesmos dados");
                            }
                            Thread.sleep(1000);
                            break;
                        case "2":
                            lugarVago();
                            Thread.sleep(1000);
                            break;
                        case "3":
                            imprimeCatalogoJogos();
                            Thread.sleep(1000);
                            break;
                        case "4":
                            imprimeCatalogoGrafico();
                            Thread.sleep(1000);
                            break;
                        case "5":
                            System.out.print("Digite a editora: ");
                            String editora=input.nextLine();
                            imprimeCatalogoEditora(editora);
                            Thread.sleep(1000);
                            break;
                        case "6":
                            System.out.print("Digite a categoria: ");
                            String categoria=input.nextLine();
                            imprimeCatalogoCategoria(categoria);
                            Thread.sleep(1000);
                            break;
                        case "7":
                            imprimeJogoRecente();
                            Thread.sleep(1000);
                            break;
                        case "sair":
                            loadFim();
                            break;
                    }
                } while (!menuCliente.equals("sair"));
                break;
            case "sair":
                loadFim();
                break;
        }

    }

    public static void main(String[] args) throws IOException, InterruptedException {
        GameStart();
    }
}
