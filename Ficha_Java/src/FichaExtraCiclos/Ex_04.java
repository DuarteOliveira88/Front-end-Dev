package FichaExtraCiclos;

public class Ex_04 {
    public static void emLinha(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void aEsquerda(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i==j||j<i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void centro(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                    System.out.print(" ");
                }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
}
    public static void main(String[] args) {
        emLinha();
        System.out.println();
        aEsquerda();
        System.out.println();
        centro();
    }
}
