package FichaPratica06;

public class Ex_05 {
    public static int maior(int[] vetor){
        int aux=vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if(aux<vetor[i]){
                aux = vetor[i];
            }
        }
        return aux;
    }
    public static int menor(int[] vetor){
        int aux=vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if(aux>vetor[i]){
                aux = vetor[i];
            }
        }
        return aux;
    }
    public static boolean crescente(int[] vetor){
        int aux=vetor[0];
        boolean cres=true;
        for (int i = 1; i < vetor.length; i++) {
            if(aux>vetor[i]){
                cres=false;
            }
        }
        return cres;
    }
}
