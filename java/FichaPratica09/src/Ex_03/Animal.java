package Ex_03;

public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private double peso;
    private String[] alimentacao;

    public Animal(String nome, String especie, String paisOrigem, double peso, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    public void comer(String alimento, double peso){
        boolean naoComeu=true;
        for (int i = 0; i < this.alimentacao.length; i++) {
            if(this.alimentacao[i].equals(alimento)){
                this.peso+=peso;
                naoComeu=false;
                System.out.println("O animal comeu");
            }
        }
        if(naoComeu){
            System.out.println("O animal recusou a comida");
        }
    }
}
