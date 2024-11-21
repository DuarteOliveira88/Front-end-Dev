package FichaPratica06;

public class Ex_07 {
    public static void desenha(String letra,int linhas,int colunas){
        for (int i = 0; i < linhas; i++) {
            System.out.print(letra);
            for (int j = 0; j < colunas-2; j++) {
                if(i==0||i==linhas-1){
                    System.out.print(letra);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(letra);
        }
    }

    public static void main(String[] args) {
        desenha("z",4,4);
    }
}
