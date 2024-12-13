package GameStart;

import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static GameStart.FunctionsADM.contaLines;
import static GameStart.PathFile.*;

public class FunctionsClient {
    public static void addCliente(String nome,String telemovel,String email) throws IOException {
        int id=contaLines(pathMenuFiles("clientes"))+1;
        String line=id+";"+nome+";"+telemovel+";"+email;
        FileWriter writer =new FileWriter(new File(pathMenuFiles("clientes")),true);
        writer.write("\n"+line);
        System.out.println("Cliente adicionado.");
        writer.close();
    }
    public static int quantosJogosSemDup() throws FileNotFoundException {
        Scanner in=new Scanner(new File(pathMenuFiles("vendas")));
        in.nextLine();
        int contador=0;
        while(in.hasNextLine()){
            boolean naoTem=true;
            String[] cont=in.nextLine().split(";");
            Scanner inDentro=new Scanner(new File(pathMenuFiles("vendas")));
            inDentro.nextLine();
            while (inDentro.hasNextLine()){
                String[] contDentro=inDentro.nextLine().split(";");
                if(contDentro[0].equals(cont[0])){
                    break;
                }
            }
            while (inDentro.hasNextLine()){
                String[] contDentro=inDentro.nextLine().split(";");
                if(cont[4].equals(contDentro[4])){
                    naoTem=false;
                }
            }
            inDentro.close();
            if(naoTem){
                contador++;
            }
        }
        in.close();
        return contador;
    }
    public static String[] jogosSemDup() throws FileNotFoundException {
        Scanner in=new Scanner(new File(pathMenuFiles("vendas")));
        in.nextLine();
        String[] jogosSemDup=new String[quantosJogosSemDup()];
        int index=0;
        while(in.hasNextLine()){
            boolean naoTem=true;
            String[] cont=in.nextLine().split(";");
            Scanner inDentro=new Scanner(new File(pathMenuFiles("vendas")));
            inDentro.nextLine();
            while (inDentro.hasNextLine()){
                String[] contDentro=inDentro.nextLine().split(";");
                if(contDentro[0].equals(cont[0])){
                    break;
                }
            }
            while (inDentro.hasNextLine()){
                String[] contDentro=inDentro.nextLine().split(";");
                if(cont[4].equals(contDentro[4])){
                    naoTem=false;
                }
            }
            inDentro.close();
            if(naoTem){
                jogosSemDup[index]=cont[4];
                index++;
            }
        }
        in.close();
        return jogosSemDup;
    }
    public static boolean triangular(int num){
        int soma=0;
        for (int i = 1; i <= num; i++) {
            soma+=i;
            if(soma>=num){
                i=num;
            }
        }
        return soma == num;
    }
    public static void lugarVago(){
        for (int i = 1; i <= 121; i++) {
            if(triangular(i)&&i%5==0){
                System.out.println("Tem uma vaga no lugar: "+i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        /*System.out.println("Tem "+quantosJogosSemDup()+" jogos.");
        String[] jogosSemDup=new String[quantosJogosSemDup()];
        jogosSemDup=jogosSemDup();
        for(String jogo : jogosSemDup){
            System.out.println(jogo);
        }*/
        //addCliente("Duarte","99","abd");
        lugarVago();
    }
}
