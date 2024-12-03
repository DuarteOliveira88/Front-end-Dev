package Ex_03;

public class Main {
    public static void main(String[] args) {
        Animal gato=new Animal("Mia","gato","Portugal",5,new String[]{"racao","carne","peixe"});
        gato.comer("corda",5);
        gato.comer("racao",0.2);
    }
}
