package Ex01;

import java.util.ArrayList;

public class AviaoCombate extends Aviao{
    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Armas> armas;//como fazer capacidade maxima

    public void addArma(Armas arma){//e no construtor ele inicializa a 0 e so deixa meter ate 3
        if(this.armas.size()>=3){
            System.out.println("Ja tem 3 armas");
        }else {
            this.armas.add(arma);
            System.out.println("Arma adicionada. Tem + "+this.armas.size()+" armas instaladas.");
        }

    }
    public void removeArma(Armas arma){
        this.armas.remove(arma);
    }
    public void sayArmas(){
        System.out.println(this.armas);
    }
}
