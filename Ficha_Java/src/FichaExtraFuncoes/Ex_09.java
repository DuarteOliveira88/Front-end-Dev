package FichaExtraFuncoes;

public class Ex_09 {
    public static String qualMes(int mes){
        switch (mes){
            case 1:
                System.out.println("Jan");
                return "Jan";
            case 2:
                System.out.println("Fev");
                return "Fev";
            default:
                System.out.println("Nao reconhecido");

        }
        return "";
    }

    public static void main(String[] args) {
        String mes=qualMes(3);
        System.out.println(mes);
    }
}
