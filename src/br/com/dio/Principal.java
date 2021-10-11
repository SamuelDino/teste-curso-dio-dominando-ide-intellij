package br.com.dio;

public class Principal {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Livro livro = new Livro("Bíblia",2000);
        System.out.println(gato);
        System.out.println(livro);
    }
}

class Livro{
    private String nome;
    private Integer numPaginas;

    public Livro() {
    }

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}