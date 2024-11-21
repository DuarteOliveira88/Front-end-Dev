package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_04 {
    public static void lerFileCSV(String path)throws FileNotFoundException {
        File file=new File(path);
        Scanner in=new Scanner(file);
        String line;
        while (in.hasNextLine()){
            line=in.nextLine();
            System.out.println(line);
        }
        in.close();
    }
    public static void main(String[] args)throws FileNotFoundException {
        lerFileCSV("Files/exercicio_04.csv");
    }
}
