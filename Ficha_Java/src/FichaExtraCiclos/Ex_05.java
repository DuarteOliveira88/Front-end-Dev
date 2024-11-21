package FichaExtraCiclos;

public class Ex_05 {
    public static void aEsquerda(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i==j||j<i){
                    System.out.print(i+1);
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
                System.out.print(i);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void centroDe(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >1; k--) {
                System.out.print(k);
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        aEsquerda();
        System.out.println();
        centro();
        System.out.println();
        centroDe();
    }
}
