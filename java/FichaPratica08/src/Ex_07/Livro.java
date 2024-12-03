package Ex_07;

public class Livro {
    private String titulo;
    private String autor;
    private String categoria;
    private int numPaginas;
    private String ISBN;

    public Livro(String titulo, String autor, String categoria, int numPaginas, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numPaginas = numPaginas;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void exibirDetalhes(){
        System.out.println(this.titulo+" "+this.autor+" "+this.categoria+" "+this.numPaginas+" "+this.ISBN);
    }
}
