package modelo;

public class Dvd extends Catalogo{
    double tempoDuracao;

    public Dvd() {
    }

    public Dvd(String nome, double preco, int codigoBarras, double tempoDuracao) {
        super(nome, preco, codigoBarras);
        this.tempoDuracao = tempoDuracao;
    }

    public double getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(double tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }
    
    @Override
    public String toString(){
        return "Nome: " + super.getNome() + "; Preço: " + super.getPreco() + "; Tempo de duracao: " + this.tempoDuracao;
    }
}
