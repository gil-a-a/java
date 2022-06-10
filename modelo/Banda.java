package modelo;

public class Banda extends Artista{
    private int numMembros;

    public Banda() {
    }

    public Banda(String nome, int numMembros) {
        super(nome);
        this.numMembros = numMembros;
    }

    public int getNumMembros() {
        return numMembros;
    }

    public void setNumMembros(int numMembros) {
        this.numMembros = numMembros;
    }

    @Override
    public String toString(){
        return "Nome: " + super.getNome() + "; Tempo de carreira: " + getNumMembros();
    }
}
