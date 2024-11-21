package FichaExtraFuncoes;

public class Ex_05 {
    public static String contarPiada(int piada){
        String[] piadas=new String[3];
        piadas[0]="Piada 1";
        piadas[1]="Piada 2";
        piadas[2]="Piada 3";
        return piadas[piada-1];
    }

    public static void main(String[] args) {
        String piada=contarPiada(2);
        System.out.println(piada);
    }
}
