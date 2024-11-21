package FichaExtraFuncoes;

import java.util.Scanner;

public class Ex_11 {
    public static void printTab(String[][] array){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void jogada(int jogador,String[][] array){
        int linha,coluna;
        Scanner input=new Scanner(System.in);
        boolean emJogo=true;
        do {
            System.out.print("Diga a linha(1 a 3): ");
            linha = input.nextInt();
            System.out.print("Diga a coluna(1 a 3): ");
            coluna = input.nextInt();
            if(array[linha - 1][coluna - 1] != null){
                System.out.println("Jogada invalida.");
            }else {
                emJogo=false;
                if(jogador==1){
                    array[linha-1][coluna-1]="X";
                }else {
                    array[linha-1][coluna-1]="O";
                }
            }
        }while (emJogo);

    }
    public static boolean verifica(String[][] array){
        boolean acabou=false;
        if(array[0][0]!=null&&array[0][1]!=null&&array[0][2]!=null){
            if(array[0][0].equals(array[0][1])&&array[0][0].equals(array[0][2])){
                acabou=true;
            }
        }if(array[1][0]!=null&&array[1][1]!=null&&array[1][2]!=null){
            if(array[1][0].equals(array[1][1])&&array[1][1].equals(array[1][2])){
                acabou=true;
            }
        }if(array[2][0]!=null&&array[2][1]!=null&&array[2][2]!=null){
            if(array[2][0].equals(array[2][1])&&array[2][1].equals(array[2][2])){
                acabou=true;
            }
        }if(array[0][0]!=null&&array[1][0]!=null&&array[2][0]!=null){
            if(array[0][0].equals(array[1][0])&&array[0][0].equals(array[2][0])){
                acabou=true;
            }
        }if(array[0][1]!=null&&array[1][1]!=null&&array[2][1]!=null){
            if(array[0][1].equals(array[1][1])&&array[0][1].equals(array[2][1])){
                acabou=true;
            }
        }if(array[0][2]!=null&&array[1][2]!=null&&array[2][2]!=null){
            if(array[0][2].equals(array[1][2])&&array[0][2].equals(array[2][2])){
                acabou=true;
            }
        }if(array[0][0]!=null&&array[1][1]!=null&&array[2][2]!=null){
            if(array[0][0].equals(array[1][1])&&array[1][1].equals(array[2][2])){
                acabou=true;
            }
        }if(array[0][2]!=null&&array[1][1]!=null&&array[2][0]!=null)
            if(array[0][2].equals(array[1][1])&&array[1][1].equals(array[2][0])){
                acabou=true;
            }
        return acabou;

    }
    public static int jogoDoGalo(){
        int cont=0;
        String[][] tabuleiro=new String[3][3];
        do {
            printTab(tabuleiro);
            System.out.println("Jogador 1:");
            jogada(1,tabuleiro);
            cont++;
            if(cont==9){
                printTab(tabuleiro);
                return 3;
            }
            if(verifica(tabuleiro)){
                printTab(tabuleiro);
                return 1;
            }
            printTab(tabuleiro);
            System.out.println("Jogador 2:");
            jogada(2,tabuleiro);
            cont++;
            if(cont==9){
                printTab(tabuleiro);
                return 3;
            }
            if(verifica(tabuleiro)){
                printTab(tabuleiro);
                return 2;
            }
        }while (!verifica(tabuleiro));
        return 88;
    }

    public static void main(String[] args) {
        int winner=jogoDoGalo();
        if(winner==3){
            System.out.println("O jogo empatou");
        }else {
            System.out.println("O jogador " + winner + " ganhou a partida.");
        }
    }
}









