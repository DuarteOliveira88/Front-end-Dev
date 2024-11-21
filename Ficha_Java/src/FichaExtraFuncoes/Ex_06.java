package FichaExtraFuncoes;

public class Ex_06 {
    public static double somatorio(int num){
        double somatorio=0;
        while (num>1){
            double aux=num%10;
            somatorio+=aux;
            num/=10;
        }
        return somatorio;
    }

    public static void main(String[] args) {
        double soma=somatorio(361);
        System.out.println(soma);
    }
}
