package FichaExtraFicheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_02 {
    public static String[][] bubbleSortMatriz(String[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(Integer.parseInt(array[j][1])>Integer.parseInt(array[j+1][1])){
                    String aux1,aux2;
                    aux1=array[j][1];
                    array[j][1]=array[j+1][1];
                    array[j+1][1]=aux1;
                    aux2=array[j][0];
                    array[j][0]=array[j+1][0];
                    array[j+1][0]=aux2;
                }
            }
        }
        return array;
}
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Files/FichaPraticaExtraFicheiros/exercicio_02.txt");
        Scanner in = new Scanner(file),in2 = new Scanner(file);
        int count = 0;
        while (in.hasNextLine()) {
            String linha = in.nextLine();
            String[] cont = linha.split(" ");
            count += cont.length;
        }
        String[][] matrizPalavras = new String[count][2];
        int index = 0;
        while (in2.hasNextLine()) {
            String linha = in2.nextLine();
            String[] cont = linha.split(" ");
            for (int i = 0; i < cont.length; i++) {
                boolean adicionar=true;
                for (int j = 0; j < count; j++) {
                    if (matrizPalavras[j][0] != null) {
                        if (cont[i].equals(matrizPalavras[j][0])){
                            adicionar=false;
                            matrizPalavras[j][1]=Integer.toString(Integer.parseInt(matrizPalavras[j][1])+1);
                        }
                    }
                }
                if(adicionar){
                    matrizPalavras[index][1]="1";
                    matrizPalavras[index++][0]=cont[i];
                }
            }
        }
        int aux=0;
        String auxPal=matrizPalavras[0][0],auxVezes=matrizPalavras[0][1];
        for (int i = 1; i < count; i++) {
            if(matrizPalavras[i][0]!=null){
                aux++;
                if(Integer.parseInt(matrizPalavras[i][1])>Integer.parseInt(auxVezes)){
                    auxVezes=matrizPalavras[i][1];
                    auxPal=matrizPalavras[i][0];
                }
            }
        }

        String[][] matrizLimpa = new String[aux][2];
        for (int i = 0; i < aux; i++) {
            for (int j = 0; j < 2; j++) {
                matrizLimpa[i][j]=matrizPalavras[i][j];
            }
        }
        for (int i = 0; i < aux; i++) {
            System.out.println(matrizLimpa[i][0]);
        }
        String[][] matrizordenada =bubbleSortMatriz(matrizLimpa);
        int quant=matrizordenada.length-1;
        for (int i = 1; i < 11; i++) {
            System.out.println("A "+ i +"ª palavra '"+matrizordenada[quant][0]+"' foi usada "+matrizordenada[quant--][1]+" vezes.");
        }
        //System.out.println("A palavra "+auxPal+" foi usada "+auxVezes+" vezes.");
    }
}
