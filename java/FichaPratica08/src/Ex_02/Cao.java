package Ex_02;

public class Cao {
    private String nome;
    private String raca;
    private String latido;

    Cao(String nome,String raca, String latido){
        this.nome=nome;
        this.raca=raca;
        this.latido=latido;
    }
    public String ladrar(){
        return this.latido;
    }
    public void setLadrar(String latido){
        this.latido=latido;
    }
}
