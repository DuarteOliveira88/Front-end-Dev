package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_11 {
    public static void eveMes(String path,String mes)throws FileNotFoundException {
        File file=new File(path);
        Scanner in=new Scanner(file);
        in.nextLine();
        int count=0;
        while (in.hasNextLine()){
            String line=in.nextLine();
            String[] cont=line.split(",");
            if(cont[2].equals(mes)){
                System.out.println(cont[0]+" no dia "+cont[1]+"/"+cont[2]+"/"+cont[3]);
                count++;
            }
        }
        if(count==0){
            System.out.println("Nao tem eventos.");
        }
        in.close();
    }
    public static void eveAno(String path,String mes,String ano)throws FileNotFoundException{
        File file=new File(path);
        Scanner in=new Scanner(file);
        in.nextLine();
        int count=0;
        while (in.hasNextLine()){
            String line=in.nextLine();
            String[] cont=line.split(",");
            if(cont[3].equals(ano)){
                if (cont[2].equals(mes)){
                    System.out.println(cont[0]+" no dia "+cont[1]+"/"+cont[2]+"/"+cont[3]);
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println("Nao tem eventos.");
        }
        in.close();
    }

    public static void main(String[] args)throws FileNotFoundException {
        eveMes("Files/exercicio_11.csv","Agosto");
        System.out.println();
        eveAno("Files/exercicio_11.csv","Agosto","2023");
    }
}