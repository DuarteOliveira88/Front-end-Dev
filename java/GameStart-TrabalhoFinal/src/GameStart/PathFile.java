package GameStart;

public class PathFile {
    public static String pathMenuFiles(String path){
        String pathFile;
        switch (path){
            case "login":
                pathFile="Files/GameStart_AdminLogin.csv";
                break;
            case "categorias":
                pathFile="Files/GameStart_Categorias.csv";
                break;
            case "clientes":
                pathFile="Files/GameStart_Clientes.csv";
                break;
            case "vendas":
                pathFile="Files/GameStart_Vendas.csv";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + path);
        }
        return pathFile;
    }
    public static String pathMenuFilesNum(int num){
        String pathFile;
        switch (num){
            case 1:
                pathFile="Files/GameStart_AdminLogin.csv";
                break;
            case 2:
                pathFile="Files/GameStart_Categorias.csv";
                break;
            case 3:
                pathFile="Files/GameStart_Clientes.csv";
                break;
            case 4:
                pathFile="Files/GameStart_Vendas.csv";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }
        return pathFile;
    }
    public static String catalogoGrafico(String option){
        return switch (option) {
            case "1" -> "Files/CatalogoGrafico/callOfDuty.txt";
            case "2" -> "Files/CatalogoGrafico/fifa.txt";
            case "3" -> "Files/CatalogoGrafico/hollowKnight.txt";
            case "4" -> "Files/CatalogoGrafico/minecraft.txt";
            case "5" -> "Files/CatalogoGrafico/mortalKombat.txt";
            case "6" -> "Files/CatalogoGrafico/overcooked.txt";
            case "7" -> "Files/CatalogoGrafico/witcher3.txt";
            default -> "";
        };
    }
    public static void main(String[] args) {

    }
}
