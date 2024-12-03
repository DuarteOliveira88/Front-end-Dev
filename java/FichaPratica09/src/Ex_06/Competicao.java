package Ex_06;

import java.util.Arrays;

public class Competicao {
    private String nome;
    private String pais;
    private Atleta[] atletas;

    public Competicao(String nome, String pais, Atleta[] atletas) {
        this.nome = nome;
        this.pais = pais;
        this.atletas = atletas;
    }
    public void addAtleta(Atleta atleta){
        Atleta[] atletas1=new Atleta[this.atletas.length+1];
        for (int i = 0; i < this.atletas.length; i++) {
            atletas1[i]=this.atletas[i];
        }
        atletas1[this.atletas.length]=atleta;
        this.atletas=atletas1;
    }

    @Override
    public String toString() {
        return "Competicao{" +
                "nome='" + nome + '\'' +
                ", pais='" + pais + '\'' +
                ", atletas=" + Arrays.toString(atletas) +
                '}';
    }
}
