package FichaExtraFuncoes;

public class Ex_08 {
    public static boolean vogal(String letra){
        return (letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u"));
    }

    public static void main(String[] args) {
        boolean vog=vogal("b");
        if(vog){
            System.out.println("Vogal");
        }else {
            System.out.println("Consoanteeeeeeeeeee");
        }
    }
}
