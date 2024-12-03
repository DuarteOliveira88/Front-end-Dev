package Ex_05;

public class Agenda {
    private Pessoa[] pessoas;

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }
    public void maisPessoa(Pessoa pessoa){
        Pessoa[] pessoas1=new Pessoa[this.pessoas.length+1];
        for (int i = 0; i < this.pessoas.length; i++) {
            pessoas1[i]=this.pessoas[i];
        }
        pessoas1[this.pessoas.length]=pessoa;
        this.pessoas=pessoas1;
    }
}
