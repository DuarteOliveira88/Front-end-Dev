package FichaPratica07;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static FichaPratica07.Ex_02.*;
import static FichaPratica07.Ex_01.*;
public class Ex_03 {
    public static void lerEscreverFile(String path1,String path2) throws FileNotFoundException{
        File file1=new File(path1);
        File file2=new File(path2);
        String linha;
        Scanner in=new Scanner(file1);
        PrintWriter printWriter=new PrintWriter(file2);
        while (in.hasNextLine()){
            linha=in.nextLine();
            printWriter.println(linha);
        }
        in.close();
        printWriter.close();
    }

    public static void main(String[] args)throws FileNotFoundException {
        lerEscreverFile("Files/EX01.txt","Files/EX02.txt");
    }
}
