package Ex03;

public class Ingrediente {
    private String codigo;
    private String nome;
    private Medida medida;
    private double caloriasPorMedida;

    public Ingrediente(String codigo, String nome, Medida medida, double caloriasPorMedida) {
        this.codigo = codigo;
        this.nome = nome;
        this.medida = medida;
        this.caloriasPorMedida = caloriasPorMedida;
    }
}
