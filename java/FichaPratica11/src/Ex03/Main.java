package Ex03;

public class Main {
    public static void main(String[] args) {

        Ingrediente queijoMozzarela = new Ingrediente("I-001","Queijo Mozzarela",Medida.GRAMAS,2);
        Ingrediente azeitonas = new Ingrediente("I-005","Azeitonas Pretas",Medida.UNIDADES,5);

        Pizza pizza4EstacoesMedia = new Pizza("P-001","Pizza 4 Estações","Boa e Maravilhosa",12.5,Tamanho.MEDIA);
        pizza4EstacoesMedia.addIngrediente(new IngredientePizza(queijoMozzarela,100));

    }
}
