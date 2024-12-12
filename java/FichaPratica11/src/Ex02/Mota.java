package Ex02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veiculo{
    private String path;
    public Mota(String marca, String modelo, int anoLancamento, double potencia, double cilindrada, TipoCombustivel tipoCombustivel, double litros100KM, String path) {
        super(marca, modelo, anoLancamento, potencia, cilindrada, tipoCombustivel, litros100KM);
        this.path=path;
    }

    public void imprimeMota() throws FileNotFoundException {
        Scanner in=new Scanner(new File(this.path));
        while (in.hasNextLine()){
            System.out.println(in.nextLine());
        }
    }
}
