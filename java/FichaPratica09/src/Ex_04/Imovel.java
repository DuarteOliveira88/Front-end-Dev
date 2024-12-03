package Ex_04;

public class Imovel {
    private String rua;
    private String numPorta;
    private String cidade;
    private TipoImovel tipoImovel;
    private TipoAcabamento tipoAcabamento;
    private double area;
    private int numQuartos;
    private int numBanho;
    private double areaPiscina;

    public Imovel(String rua,
                  String numPorta,
                  String cidade,
                  TipoImovel tipoImovel,
                  TipoAcabamento tipoAcabamento,
                  double area,
                  int numQuartos,
                  int numBanho,
                  double areaPiscina) {
        this.rua = rua;
        this.numPorta = numPorta;
        this.cidade = cidade;
        this.tipoImovel = tipoImovel;
        this.tipoAcabamento = tipoAcabamento;
        this.area = area;
        this.numQuartos = numQuartos;
        this.numBanho = numBanho;
        this.areaPiscina = areaPiscina;
    }

    public double calcularValor(){
        double valorM2=0;
        double desconto=0;
        switch (this.tipoImovel){
            case CASA -> valorM2=3000;
            case APARTAMENTO -> valorM2=1000;
            case MANSAO -> valorM2=5000;
        }
        switch (this.tipoAcabamento){
            case USADA -> desconto=-10;
            case RESTAURO -> desconto=-50;
            case NOVA -> desconto=0;
            case NOVA_COM_ALTO_ACABAMENTO -> desconto=25;
        }
        double bruto=this.area*valorM2+this.numQuartos*7500+this.numBanho*10500+this.areaPiscina*1000;
        return bruto+((bruto*desconto)/100);
    }

    public void setTipoAcabamento(TipoAcabamento tipoAcabamento) {
        this.tipoAcabamento = tipoAcabamento;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "rua='" + rua + '\'' +
                ", numPorta='" + numPorta + '\'' +
                ", cidade='" + cidade + '\'' +
                ", tipoImovel=" + tipoImovel +
                ", tipoAcabamento=" + tipoAcabamento +
                ", area=" + area +
                ", numQuartos=" + numQuartos +
                ", numBanho=" + numBanho +
                ", areaPiscina=" + areaPiscina +
                '}';
    }

    public void comparaImoveis(Imovel imovel2){
        if(this.calcularValor()>imovel2.calcularValor()){
            System.out.println("O 1 imovel e mais caro.");
        }else {
            System.out.println("O imovel do argumento(2) e mais caro.");
        }
    }
}
