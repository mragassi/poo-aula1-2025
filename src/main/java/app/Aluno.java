package app;

public class Aluno {
    public String nome;
    public int idade;

    public String getDados() {  //o abre e fecha parênteses significa parâmetros, que neste caso não tem nenhum
        return this.nome + " ( " + this.idade + " ) "; // o this é um operador de desambiguação!
    }

    public Aluno(String nome, int idade) { // o método construtor sempre terá o mesmo nome da classe. Um construtor padrão é sempre vazio.
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno() {

    }
}