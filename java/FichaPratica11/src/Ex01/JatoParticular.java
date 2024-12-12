package Ex01;

import java.util.ArrayList;

public class JatoParticular extends Aviao{
    private int lotacao;
    private double capacidadeBagagem;
    private Categoria categoria;
    private ArrayList<Instalacoes> instalacoes;

    public void addInstalacao(Instalacoes instalacao){
        this.instalacoes.add(instalacao);
    }
    public void removeInstalacao(Instalacoes instalacao){
        this.instalacoes.remove(instalacao);
    }
    public void sayInstalacao(){
        for(Instalacoes instalacaoAtual: this.instalacoes){
            System.out.println(instalacaoAtual);
        }
    }
}
