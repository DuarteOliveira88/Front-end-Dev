package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_01 {
    public static void printFile(String string)throws FileNotFoundException{
        File file= new File("Files/EX01.txt");
        PrintWriter printWriter=new PrintWriter(file);
        printWriter.println(string);
        printWriter.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        String string="Exemplo de uma string para um ficheiro.Miau";
        printFile(string);
    }
}
