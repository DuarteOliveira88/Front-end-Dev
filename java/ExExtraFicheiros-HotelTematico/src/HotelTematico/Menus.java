package HotelTematico;

public class Menus {
    /**
     * Funcao para iniciar o programa e solicitar login
     */
    public static void menuLogin(){
        System.out.print("\n-----------------Login Required-----------------\n");
        System.out.println("Diga o seu username e password.");
        System.out.println("Prima 8 para sair do programa.");
        System.out.print("------------------------------------------------\n");
    }
    /**
     * Funcao para apresentar o menu principal
     */
    public static void menuPrincipal(){
        System.out.print("\n-----------------Menu principal-----------------\n");
        System.out.println("1. Gerir base de dados.");
        System.out.println("2. Consultar clientes.");
        System.out.println("3. Consultar quartos disponiveis");
        System.out.println("4. Consultar reservas");
        System.out.println("5. Registrar nova reserva.");
        System.out.println("6. HotelTematico.Dashboard analytics.");
        System.out.println("7. Galeria.");
        System.out.println("8. Sair do programa.");
        System.out.print("------------------------------------------------\n");
    }

    /**
     * Funcao para apresentar o menu para consutal a informaçao dos clientes
     */
    public static void menuClientes(){
        System.out.print("\n-----------------Menu Clientes-----------------\n");
        System.out.println("1. Procura por id do cliente.");
        System.out.println("2. Procura por numero de telemovel.");
        System.out.println("3. Procura por email.");
        System.out.println("8. Sair.");
        System.out.print("-----------------------------------------------\n");
    }

    /**
     * Funcao para apresentar o menu para consutal a informaçao dos quartos
     */
    public static void menuQuartos(){
        System.out.print("\n-----------------Menu Quartos-----------------\n");
        System.out.println("1. Todos os quartos disponiveis.");
        System.out.println("2. Quartos disponiveis em relaçao a um tema.");
        System.out.println("3. Quartos disponiveis em relaçao ao tipo de quarto.");
        System.out.println("8. Sair.");
        System.out.print("----------------------------------------------\n");
    }

    /**
     * Funcao para apresentar o menu para consutal a informaçao das reservas.
     */
    public static void menuReservas(){
        System.out.print("\n-----------------Menu Reservas-----------------\n");
        System.out.println("1. Historico de reservas ate a data.");//(08-03-2024) todas as reservas que acabam ate ao dia
        System.out.println("2. Reservas ativas.");//(08-03-2024) todas as reservas que nao acabam no dia ou ja acabaram antes do dia
        System.out.println("8. Sair.");
        System.out.print("-----------------------------------------------\n");
    }

    /**
     * Funcao para apresentar o menu para consutal a galeria
     */
    public static void menuGaleria(){
        System.out.print("\n-----------------Menu Galeria-----------------\n");
        System.out.println("1. Quartos.");
        System.out.println("2. Fachada.");
        System.out.println("3. Spa.");
        System.out.println("4. Todos.");
        System.out.println("8. Sair.");
        System.out.print("----------------------------------------------\n");
    }
    public static void main(String[] agrs){
        menuLogin();
        menuPrincipal();
        menuClientes();
        menuQuartos();
        menuReservas();
        menuGaleria();
    }
}
