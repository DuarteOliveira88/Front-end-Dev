package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_02 {
    public static void lerFIle(String path)throws FileNotFoundException{
        File file= new File(path);
        Scanner in=new Scanner(file);
        String linha;
        while (in.hasNextLine()){
            linha=in.nextLine();
            System.out.println(linha);
        }
        in.close();
    }

    public static void main(String[] args)throws FileNotFoundException {
        lerFIle("Files/EX01.txt");
    }
}
