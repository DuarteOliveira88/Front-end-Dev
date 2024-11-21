package FichaExtraFicheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) throws IOException {
        File file=new File("Files/FichaPraticaExtraFicheiros/exercicio_01.txt");
        File filePalavra=new File("Files/FichaPraticaExtraFicheiros/ex01PalavraUnica.txt");
        Scanner in=new Scanner(file);
        Scanner input=new Scanner(System.in);
        FileWriter writer=new FileWriter(filePalavra);
        System.out.print("Diga a palavra que deseja: ");
        String palavra=input.next();
        while (in.hasNextLine()){
            String linha=in.nextLine();
            String[] cont=linha.split(" ");
            int count=0;
            for(String pal : cont){
                if(pal.equals(palavra)){
                    count++;
                }
            }
            if(count>0){
                writer.write(linha+"\n");
            }
        }
        in.close();
        writer.close();
    }
}
