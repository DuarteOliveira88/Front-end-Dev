package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_08 {
    public static double totalVendas(String path)throws FileNotFoundException {
        File file=new File(path);
        Scanner in=new Scanner(file);
        double total=0;
        String line=in.nextLine();
        while (in.hasNextLine()){
            line=in.nextLine();
            String[] contLine=line.split(",");
            total+=Double.parseDouble(contLine[2])*Double.parseDouble(contLine[3]);
        }
        return total;
    }

    public static void main(String[] args)throws FileNotFoundException {
        double total;
        total=totalVendas("Files/exercicio_08.csv");
        System.out.println(total);
    }
}
