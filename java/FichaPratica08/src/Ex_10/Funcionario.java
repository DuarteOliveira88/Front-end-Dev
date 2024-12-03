package Ex_10;

public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;

    Funcionario(String nome, double salario, String departamento){
        this.nome=nome;
        this.salario=salario;
        this.departamento=departamento;
    }

    public void aumentarSalario(double aumento){
        this.salario+=((this.salario*aumento)/100);
    }

    public void exibirDados(){
        System.out.println(this.nome+" "+this.salario+" "+this.departamento);
    }
}