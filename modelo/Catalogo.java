package modelo;

public class Catalogo {
    private String nome;
    private double preco;
    private int codigoBarras;   //mudar isso aq pra uma string com 6 dígitos

    public Catalogo() {
    }

    public Catalogo(String nome, double preco, int codigoBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
}