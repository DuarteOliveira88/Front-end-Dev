package GameStart;

import java.io.FileNotFoundException;

public class Menus {
    /**
     * Funcao para iniciar o programa e perguntar se e cliente ou adm
     */
    public static void mainMenu(){
        System.out.print("\n-----------------Bem vindo a GameStart-----------------\n");
        System.out.println("Prima 1 para entrar como ADM.");
        System.out.println("Prima 2 para entrar como Cliente.");
        System.out.println("Prima sair para sair do programa.");
        System.out.print("-------------------------------------------------------\n");
    }

    /**
     * Funçao para imprimir o menu de login caso entre como ADM
     */
    public static void loginMenu(){
        System.out.print("\n-----------------Login Required-----------------\n");
        System.out.println("Diga o seu username e password.");
        System.out.println("Prima sair para sair do programa.");
        System.out.print("------------------------------------------------\n");
    }

    /**
     * Funçao para imprimir o menu do ADM
     */
    public static void adimMenu(){
        System.out.print("\n-----------------ADM DashBoard-----------------\n");
        System.out.println("1. Consulta de Ficheiros.");
        System.out.println("2. Total de vendas.");
        System.out.println("3. Total de lucro.");
        System.out.println("4. Pesquisa de Cliente.");
        System.out.println("5. Jogo mais caro.");
        System.out.println("6. Melhores clientes.");//como assim qual/quais?
        System.out.println("7. Melhor categoria.");
        System.out.println("8. Pesquisa vendas.");
        System.out.println("9. TOP 5 jogos.");
        System.out.println("10. BOTTOM 5 jogos.");
        System.out.println("Prima sair para sair do programa.");
        System.out.print("-----------------------------------------------\n");
    }

    /**
     * Funçao para imprimir o menu do cliente
     */
    public static void clientMenu(){
        System.out.print("\n-----------------Cliente DashBoard-----------------\n");
        System.out.println("1. Novo registo.");
        System.out.println("2. Procurar estacionamento.");
        System.out.println("3. Imprimir catalogo.");
        System.out.println("4. Imprimir catalogo grafico.");
        System.out.println("5. Imprimir catalogo de uma editora.");
        System.out.println("6. Imprimir catalogo de uma categoria.");
        System.out.println("7. Imprimir jogo mais recente adicionado a loja.");
        System.out.println("Prima sair para sair do programa.");
        System.out.print("---------------------------------------------------\n");
    }

    /**
     * Funçao para imprimir o menu do catalogo grafico
     */
    public static void CGraficMenu(){
        System.out.print("\n-----------------Catalogo grafico-----------------\n");
        System.out.println("1. Call of Duty.");
        System.out.println("2. Fifa.");
        System.out.println("3. Hollow Knight.");
        System.out.println("4. Minecraft.");
        System.out.println("5. Mortal Kombat.");
        System.out.println("6. Overcooked.");
        System.out.println("7. Withcer 3.");
        System.out.println("Prima sair para sair do programa.");
        System.out.print("--------------------------------------------------\n");
    }
    public static void filesMenu(){
        System.out.print("\n-----------------Selecione o ficheiro-----------------\n");
        System.out.println("1. Ficheiros de categorias.");
        System.out.println("2. Ficheiros de clientes.");
        System.out.println("3. Ficeiros de vendas.");
        System.out.println("Prima sair para sair do programa.");
        System.out.print("------------------------------------------------------\n");
    }
    public static void main(String[] args) throws FileNotFoundException {
        mainMenu();
        loginMenu();
        adimMenu();
        clientMenu();
        CGraficMenu();
        filesMenu();
    }
}
