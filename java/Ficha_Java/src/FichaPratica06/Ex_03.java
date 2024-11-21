package FichaPratica06;

public class Ex_03 {
    public static boolean par(int num){
        return num % 2 == 0;
    }
    public static boolean positivo(int num){
        return num >= 0;
    }
    public static boolean primo(int num){
        int cont=0;
        for (int i = 1; i < num/2; i++) {
            if(num%i==0){
                cont++;
            }
        }
        return cont==2;
    }
    public static boolean perfeito(int num){
        int soma=0;
        for (int i = 1; i < num/2; i++) {
            if(num%i==0){
                soma+=i;
            }
        }
        return soma==num;
    }
    public static boolean triangular(int num){
        int soma=0;
        for (int i = 1; i <= num; i++) {
            soma+=i;
            if(soma>=num){
                i=num;
            }
        }
        return soma == num;
    }
}
