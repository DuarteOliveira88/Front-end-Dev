package FichaPratica02;

import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int diasT;
        double valorIRS=0,valorSS=0,valorEP=0,subAl=0,vBruto=0,vLiquido=0;
        String cargo;
        System.out.print("Diga quantos dias trabalhou: ");
        diasT=input.nextInt();
        System.out.print("Diga o seu cargo(E-empregado): ");
        cargo= input.next();
        cargo=cargo.toUpperCase();
        switch (cargo){
            case "E":
                vBruto=diasT*40;
                subAl=diasT*5;
                if(vBruto <=1000){
                    valorIRS=vBruto*0.1;
                }else {
                    valorIRS=vBruto*0.2;
                }
                valorSS=vBruto*0.11;
                valorEP=vBruto*0.2375;
                vLiquido=vBruto-valorIRS-valorSS+subAl;
                break;
            case "C":
                vBruto=diasT*60;
                subAl=diasT*7.5;
                if(vBruto <=1000){
                    valorIRS=vBruto*0.1;
                }else {
                    valorIRS=vBruto*0.2;
                }
                valorSS=vBruto*0.11;
                System.out.println("Esandjkcab " +valorSS);
                valorEP=vBruto*0.2375;
                vLiquido=vBruto-valorIRS-valorSS+subAl;
                break;
            case "A":
                vBruto=diasT*80;
                subAl=diasT*7.5;
                if(vBruto <=1000){
                    valorIRS=vBruto*0.1;
                }else {
                    valorIRS=vBruto*0.2;
                }
                valorSS=vBruto*0.9;
                valorEP=vBruto*0.21;
                vLiquido=vBruto-valorIRS-valorSS+subAl;
                break;
        }
        System.out.println(vBruto+"\n"+subAl+"\n"+valorIRS+"\n"+valorSS+"\t"+valorEP+"\n"+vLiquido);
    }
}
