package FichaExtraFuncoes;

public class Ex_02 {
    public static double media(double num1,double num2,double num3){
        return (num2+num1+num3)/3;
    }

    public static void main(String[] args) {
        double media=media(20,100,30);
        System.out.println(media);
    }
}
