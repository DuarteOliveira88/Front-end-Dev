package FichaExtraFuncoes;

public class Ex_04 {
    public static void imprimirTabuada(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }

    public static void main(String[] args) {
        imprimirTabuada(8);
    }
}
