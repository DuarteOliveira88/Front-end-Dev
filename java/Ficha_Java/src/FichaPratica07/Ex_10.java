package FichaPratica07;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_10 {
    static public String escreverMenuPrin() {
        String op;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Pesquisas.\n2.Criar.\n3.Editar.\n4.Eleminar.\n5.Sair.");
        op = input.next();
        return op;
    }

    static public String escreverMenuPes() {
        String op;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Imprimir todos.\n2.Informaçoes de uma matricula.\n3.Dado um curso quem e quantos.\n4.Imprime o mais velho.\n5.Mais de um curso.\n6.Numero de formandos.");
        op = input.next();
        return op;
    }

    public static void imprimeFormandos(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner in = new Scanner(file);
        String line = in.nextLine();
        while (in.hasNextLine()) {
            line = in.nextLine();
            System.out.println(line);
        }
        System.out.println();
        in.close();
    }

    public static void matriculaFormando(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner in = new Scanner(file);
        Scanner input = new Scanner(System.in);
        int count=0;
        System.out.print("Diga a matricula pretendida: ");
        int num = input.nextInt();
        in.nextLine();
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] cont = line.split(",");
            if (Integer.parseInt(cont[1]) == num) {
                System.out.println(line);
                count++;
            }
        }
        if(count==0){
            System.out.println("Matricula nao encontrada.");
        }
        System.out.println();
        in.close();
    }

    public static void todosFormando(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner in = new Scanner(file);
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.print("Diga o curso pretendido: ");
        String curso = input.next();
        String line = in.nextLine();
        while (in.hasNextLine()) {
            line = in.nextLine();
            String[] cont = line.split(",");
            if (cont[2].equals(curso)) {
                System.out.println(cont[0] + "\t" + cont[1] + "\t" + cont[2]);
                count++;
            }
        }
        System.out.println("Tem " + count + " formados.");
        System.out.println();
        in.close();
    }

    public static void maisVelho(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner in = new Scanner(file);
        String line = in.nextLine(), nome = "";
        int aux = 0;
        while (in.hasNextLine()) {
            line = in.nextLine();
            String[] cont = line.split(",");
            if (Integer.parseInt(cont[4]) > aux) {
                aux = Integer.parseInt(cont[4]);
                nome = cont[0];
            }
        }
        System.out.println("O aluno mais velho e: " + nome);
        System.out.println();
        in.close();
    }

    public static void maisDe1(String path) throws FileNotFoundException {
        ArrayList<Integer> numeros = new ArrayList<>();
        File file = new File(path);
        Scanner in = new Scanner(file);
        String line = in.nextLine();
        while (in.hasNextLine()) {
            line = in.nextLine();
            String[] cont = line.split(",");
            if (numeros.contains(Integer.parseInt(cont[1]))) {
                System.out.println(cont[0]);
            } else {
                numeros.add(Integer.parseInt(cont[1]));
            }
        }
        System.out.println();
        in.close();
    }

    public static void numFormando(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner in = new Scanner(file);
        String line = in.nextLine();
        int cont = 0;
        while (in.hasNextLine()) {
            line=in.nextLine();
            cont++;
        }
        System.out.println("Tem " + cont + " formandos.");
        System.out.println();
        in.close();
    }

    public static void criarFormando(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner input = new Scanner(System.in);
        String formando;
        System.out.println("Diga o nome, numero, curso, email e idade pela ordem separados por virgulas(XXX,XXX,XXX,XXX,XXX).");
        formando = input.next();
        try(FileWriter writer = new FileWriter(path, true)) {
            writer.write("\n"+formando);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Adicionado.");
        System.out.println();
    }

    public static void editarFormando(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner in = new Scanner(file);
        ArrayList<String> linhas = new ArrayList<>();
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String cabecalho = in.nextLine();
        System.out.print("Diga a matricula: ");
        String matricula = input.next();
        System.out.print("Diga o que deseja alterar(nome,email,idade): ");
        String muda = input.next();
        System.out.print("Diga o conteudo: ");
        String cont0 = input.next();
        switch (muda.toLowerCase()) {
            case "nome":
                while (in.hasNextLine()) {
                    String line = in.nextLine();
                    String[] cont = line.split(",");
                    if (cont[1].equals(matricula)) {
                        cont[0] = cont0;
                    }
                    String aux = String.join(",", cont);
                    linhas.add(aux);
                }
                break;
            case "email":
                while (in.hasNextLine()) {
                    String line = in.nextLine();
                    String[] cont = line.split(",");
                    if (cont[1].equals(matricula)) {
                        cont[3] = cont0;
                    }
                    String aux = String.join(",", cont);
                    linhas.add(aux);
                }
                break;
            case "idade":
                while (in.hasNextLine()) {
                    String line = in.nextLine();
                    String[] cont = line.split(",");
                    if (cont[1].equals(matricula)) {
                        cont[4] = cont0;
                    }
                    String aux = String.join(",", cont);
                    linhas.add(aux);
                }
                break;
        }
        PrintWriter writer = new PrintWriter(file);
        writer.println(cabecalho);
        for (String linha : linhas) {
            writer.println(linha);
        }
        System.out.println("Alterado e guardado.");
        System.out.println();
        in.close();
        writer.close();
    }

    public static void elimFormando(String path) throws FileNotFoundException {
        File file = new File(path);
        List<String> linhas = new ArrayList<>();
        Scanner in = new Scanner(file);
        Scanner input = new Scanner(System.in);
        System.out.println("Diga a matricula que deseja eleminar.");
        String matricula = input.next();
        String cabecalho = in.nextLine();
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] cont = line.split(",");
            if (!cont[1].equals(matricula)) {
                linhas.add(line);
            }
        }
        PrintWriter writer = new PrintWriter(file);
        writer.println(cabecalho);
        for (String linha : linhas) {
            writer.println(linha);
        }
        System.out.println("Eleminado com sucesso.");
        System.out.println();
        in.close();
        writer.close();
    }

    public static void main(String[] args)throws FileNotFoundException {
        String opP,opS;
        do {
            opP=escreverMenuPrin();
            switch (opP){
                case "1":
                    opS=escreverMenuPes();
                    switch (opS){
                        case "1":
                            imprimeFormandos("Files/exercicio_10.csv");
                            break;
                        case "2":
                            matriculaFormando("Files/exercicio_10.csv");
                            break;
                        case "3":
                            todosFormando("Files/exercicio_10.csv");
                            break;
                        case "4":
                            maisVelho("Files/exercicio_10.csv");
                            break;
                        case "5":
                            maisDe1("Files/exercicio_10.csv");
                            break;
                        case "6":
                            numFormando("Files/exercicio_10.csv");
                            break;
                        default:
                            System.out.println("Opçao nao reconhecida.");
                    }
                    break;
                case "2":
                    criarFormando("Files/exercicio_10.csv");
                    break;
                case "3":
                    editarFormando("Files/exercicio_10.csv");
                    break;
                case "4":
                    elimFormando("Files/exercicio_10.csv");
                    break;
                case "5":
                    System.out.println("Saindo do programa.");
                    opP="-1";
                    break;
                default:
                    System.out.println("Opçao nao reconhecida.");

            }
        }while (!opP.equals("-1"));
    }
}
