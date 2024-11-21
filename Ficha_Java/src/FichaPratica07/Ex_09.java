package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class Ex_09 {
    public static String excreverMenu(){
        Scanner input= new Scanner(System.in);
        System.out.println("1. Pesquisar musica por genero(Pop).\n2. Pesquisar musica por artiasta.\n3. Pesquisar musica com maior duracao.\n4. Pesquisar musicas com maior duracao que quiser.\n5. Numero de musicas.\n6. Sair.");
        String option;
        option=input.next();
        return option;
    }
    public static void musGenero(String path)throws FileNotFoundException {
        File file=new File(path);
        Scanner in=new Scanner(file);
        String opcao,escolha;
        Scanner input=new Scanner(System.in).useDelimiter("\n");
        String linha=in.nextLine();
        System.out.print("Diga o genero da musica: ");
        escolha=input.next();
        while (in.hasNextLine()){
            linha=in.nextLine();
            String[] cont=linha.split(",");
            if(cont[2].equals(escolha)){
                System.out.println(cont[0]+", "+cont[1]);
            }
        }
        System.out.println();
        in.close();
    }
    public static void musArtista(String path)throws FileNotFoundException{
        File file=new File(path);
        Scanner in=new Scanner(file);
        String opcao,escolha;
        Scanner input=new Scanner(System.in).useDelimiter("\n");
        String linha=in.nextLine();
        System.out.print("Diga o artista: ");
        escolha=input.next();
        while (in.hasNextLine()){
            linha=in.nextLine();
            String[] cont=linha.split(",");
            if(cont[1].equals(escolha)){
                System.out.println(cont[0]+", "+cont[1]);
            }
        }
        System.out.println();
        in.close();
    }
    public static void musDur(String path)throws FileNotFoundException{
        File file=new File(path);
        Scanner in=new Scanner(file);
        String linha= in.nextLine(),muscia="",artista="";
        linha= in.nextLine();
        int min=0,seg=0;
        String[] cont=linha.split(",");

        while (in.hasNextLine()){
            linha=in.nextLine();
            cont=linha.split(",");
            String aux[]=cont[3].split(":");
            if(Integer.parseInt(aux[0])>min){
                min=Integer.parseInt(aux[0]);
                seg=Integer.parseInt(aux[1]);
                muscia=cont[0];
                artista=cont[1];
            }else if(Integer.parseInt(aux[1])>seg&&Integer.parseInt(aux[0])==min){
                min=Integer.parseInt(aux[0]);
                seg=Integer.parseInt(aux[1]);
                muscia=cont[0];
                artista=cont[1];
            }
        }
        System.out.println("A musica com maior duraçao e: "+muscia+", "+artista);
        System.out.println();
        in.close();
    }
    public static void musMaiorQ(String path)throws FileNotFoundException{
        File file=new File(path);
        Scanner in=new Scanner(file);
        int min,seg;
        Scanner input=new Scanner(System.in);
        System.out.println("Diga os minutos: ");
        min=input.nextInt();
        System.out.println("Diga os segundos: ");
        seg=input.nextInt();
        String linha= in.nextLine();
        while (in.hasNextLine()){
            linha=in.nextLine();
            String[] cont=linha.split(",");
            String[] aux=cont[3].split(":");
            if(Integer.parseInt(aux[0])>min){
                System.out.println(cont[0]+", "+cont[1]+", " +cont[2]);
            } else if (Integer.parseInt(aux[1])>seg&&Integer.parseInt(aux[0])==min) {
                System.out.println(cont[0]+", "+cont[1]+", "+cont[2]);
            }
        }
        System.out.println();
        in.close();
    }
    public static void quantMus(String path)throws FileNotFoundException{
        File file=new File(path);
        Scanner in=new Scanner(file);
        int cont=0;
        String linha=in.nextLine();
        while (in.hasNextLine()){
            linha=in.nextLine();
            cont++;
        }
        System.out.println("Tem "+cont+" musicas.");
        System.out.println();
        in.close();
    }

    public static void main(String[] args)throws FileNotFoundException {
        String opcao;
        do {
            opcao=excreverMenu();
            switch (opcao){
                case "1":
                    musGenero("Files/exercicio_09.csv");
                    break;
                case "2":
                    musArtista("Files/exercicio_09.csv");
                    break;
                case "3":
                    musDur("Files/exercicio_09.csv");
                    break;
                case "4":
                    musMaiorQ("Files/exercicio_09.csv");
                    break;
                case "5":
                    quantMus("Files/exercicio_09.csv");
                    break;
                case "6":
                    System.out.println("Saindo do programa.");
                    opcao="-1";
                    break;
                default:
                    System.out.println("Opçao invalida");

            }
        }while (!opcao.equals("-1"));
    }
}
