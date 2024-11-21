package FichaPratica01;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        final double VENBASE=40,SUBAL=5,IRS=0.1,SEGSOC=0.11,ENTPATRONAL=0.2375;
        double codigoFuncionario,diasTrabalhou,pagamento,bruto;
        System.out.print("Diga o seu codigo de funcionario: ");
        codigoFuncionario=input.nextDouble();
        System.out.print("Diga quantos dias trabalhou: ");
        diasTrabalhou=input.nextDouble();
        bruto=VENBASE*diasTrabalhou+SUBAL*diasTrabalhou;
        pagamento=bruto*(IRS+SEGSOC+ENTPATRONAL);
        System.out.println("O pagamento do funcionario "+ codigoFuncionario+ " e "+ pagamento);
    }
}
