package Ex03;

import java.util.ArrayList;

public class Pizza {
    private String codigo;
    private String nome;
    private String descricao;
    private double preco;
    private Tamanho tamanho;
    private ArrayList<IngredientePizza> ingredientesPizza;

    public Pizza(String codigo, String nome, String descricao, double preco, Tamanho tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    public void addIngrediente(IngredientePizza ingredientePizza){
        if(this.ingredientesPizza.size()>=5){
            System.out.println("Ja tem 5 ingredientes.");
        }else {
            this.ingredientesPizza.add(ingredientePizza);
            System.out.println("Ingrediente adicionado com sucesso, a pizza tem "+this.ingredientesPizza.size()+" ingredientes.");
        }
    }
    public void editQuant(IngredientePizza ingredientePizza ,double quantidade){
        ingredientePizza.setQuantidade(quantidade);
    }
    public void 
}
