package Ex01;

import java.util.ArrayList;

public class Catalogo {
    ArrayList<Aviao> avioes;

    public void addAviao(Aviao aviao){
        this.avioes.add(aviao);
    }
    public void removeAviao(Aviao aviao, double dinheiro){
        if(this.avioes.contains(aviao)){
            if(aviao.getPreco()<=dinheiro){
                System.out.println("Compra com sucesso.\nTem "+(aviao.getPreco()-dinheiro)+"€ de troco.");
                this.avioes.remove(aviao);
            }else {
                System.out.println("Compra recusada. Para comprar esse aviao precisa de "+aviao.getPreco());
            }
        }else {
            System.out.println("Aviao nao esta no catalogo.");
        }
    }
    public double calcularTotal(){
        double total=0;
        for(Aviao aviaoAtual: this.avioes){
            total+=aviaoAtual.getPreco();
        }
        return total;
    }
    public void listarCatalogo(){
        for (Aviao aviaoAtual: this.avioes){
            System.out.println(aviaoAtual);
        }
    }
}
