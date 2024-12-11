package GameStart;

public class PathFile {
    public String pathMenuFiles(String path){
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
    public String pathMenuFilesNum(int num){
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
}
