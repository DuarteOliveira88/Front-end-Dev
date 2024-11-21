package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {
    public static void numLP(String path)throws FileNotFoundException{
        File file=new File(path);
        Scanner in=new Scanner(file);
        int numL=0,numP=0;
        String linha;
        while (in.hasNextLine()){
            linha=in.nextLine();
            String[] intemLine=linha.split(" ");
            numP+=intemLine.length;
            numL++;
        }
        System.out.println("Tem "+numP+" palavres e "+numL+" linhas");
    }

    public static void main(String[] args)throws FileNotFoundException {
        numLP("Files/exercicio_07.txt");
    }
}
