package FichaPratica03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ent1=0,ent2=0,ent3=0,ent4=0,uti; //ent=entrevalo
        do {
            System.out.print("Diga um num: ");
            uti=input.nextInt();
            if(uti<=25&&uti>=0){
                ent1++;
            }if(uti<=50&&uti>25){
                ent2++;
            }if(uti<=75&&uti>50){
                ent3++;
            }if(uti<=100&&uti>75){
                ent4++;
            }

        }while (uti>=0);
        System.out.println("[00,25]: "+ent1+"\n[26,50]: "+ent2+"\n[51,75]: "+ent3+"\n[76:100]: "+ent4);
    }
}
