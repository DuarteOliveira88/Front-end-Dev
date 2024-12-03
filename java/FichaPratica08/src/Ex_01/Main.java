package Ex_01;

public class Main {
    public static void main(String[] args){
        Pessoa pessoa01=new Pessoa("Duarte",20,1.60);
        Pessoa pessoa02=new Pessoa("David",30,1.65);
        System.out.println(pessoa01.getNome() + " "+pessoa01.getIdade());
        System.out.println(pessoa02.getNome());
    }
}
