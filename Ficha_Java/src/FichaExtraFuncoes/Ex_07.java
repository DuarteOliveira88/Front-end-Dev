package FichaExtraFuncoes;

public class Ex_07 {
    public static int inverteInt(int num){
        int invertido=0;
        while (num>=1){
            int aux=num%10;
            invertido+=aux;
            num/=10;
            invertido*=10;
        }
        return invertido/10;
    }

    public static void main(String[] args) {
        int inver=inverteInt(1623);
        System.out.println(inver);
    }
}
