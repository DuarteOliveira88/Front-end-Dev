package FichaExtraFuncoes;

public class Ex_01 {
    public static int numeroMaisPequeno(int num1,int num2,int num3){
        int maisPequeno;
        if(num1<num2&&num1<num3){
            maisPequeno=num1;
        }else if(num2<num3&&num2<num1){
            maisPequeno=num2;
        }else{
            maisPequeno=num3;
        }
        return maisPequeno;
    }

    public static void main(String[] args) {
        int aux=numeroMaisPequeno(5,2,4);
        System.out.println(aux);
    }
}
