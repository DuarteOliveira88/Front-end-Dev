package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06 {
    public static void imprimeVelho(String path)throws FileNotFoundException{
        File file=new File(path);
        Scanner in=new Scanner(file);
        int idade;
        String nome,line;
        line=in.nextLine();
        String[] itensLine=line.split(",");
        nome=itensLine[0];
        idade=Integer.parseInt(itensLine[1]);
        while (in.hasNextLine()){
            line=in.nextLine();
            itensLine=line.split(",");
            if(Integer.parseInt(itensLine[1])>idade){
                nome=itensLine[0];
                idade=Integer.parseInt(itensLine[1]);
            }
        }
        System.out.println("Nome: "+nome+"\nIdade: "+idade);
    }

    public static void main(String[] args)throws FileNotFoundException {
        imprimeVelho("Files/exercicio_06.txt");
    }
}
