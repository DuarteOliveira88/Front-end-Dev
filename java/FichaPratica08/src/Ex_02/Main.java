package Ex_02;

public class Main {
    public static void main(String[] args){
        Cao cao1=new Cao("Mia","persa","Miau");
        Cao cao2=new Cao("Rufus","dobberman","auau");
        Cao cao3=new Cao("Leona","golden","ruff");
        System.out.println(cao3.ladrar());
        cao3.setLadrar("MIAUUUUUUUUUUUUU");
        System.out.println(cao3.ladrar());
    }
}
