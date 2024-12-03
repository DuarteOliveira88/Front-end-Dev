package Ex_09;

public class Produto {
    private String nome;
    private double preco;
    private int stock=0;

    Produto(String nome,double preco){
        this.nome=nome;
        this.preco=preco;
    }

    public void vender(int quant){
        if(this.stock>quant){
            this.stock-=quant;
            System.out.println("Transaçao efetuada");
        }else {
            System.out.println("Transaçao nao efetuada devido a falta de stock");
        }
    }
    public void comprar(int quant){
        this.stock+=quant;
        System.out.println("Comprado");
    }
    public void getStock(){
        System.out.println("O stock e: "+this.stock);
    }
}
