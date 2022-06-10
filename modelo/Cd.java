package modelo;

public class Cd extends Catalogo{
    private int numFaixas;

    public Cd() {
    }

    public Cd(String nome, double preco, int codigoBarras, int numFaixas) {
        super(nome, preco, codigoBarras);
        this.numFaixas = numFaixas;
    }

    public int getNumFaixas(){
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    @Override
    public String toString(){
        return "Nome: " + super.getNome() + "; Preço: " + super.getPreco() + "; Numero de faixas: " + this.numFaixas;
    }
}
