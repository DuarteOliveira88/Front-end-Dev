package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {
    public static double lerSomarFile(String path)throws FileNotFoundException {
        File file=new File(path);
        Scanner in=new Scanner(file);
        double total=0,num;
        while (in.hasNextInt()){
            num=in.nextInt();
            total+=num;
        }
        in.close();
        return total;
    }

    public static void main(String[] args)throws FileNotFoundException {
        double total1,total2;
        total1=lerSomarFile("Files/exercicio_05_31.txt");
        total2=lerSomarFile("Files/exercicio_05_1999.txt");
        System.out.println("O total 1 e "+total1+" e o total2 e "+total2);
    }
}
