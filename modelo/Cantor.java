package modelo;

public class Cantor extends Artista{
    private int tempoCarreira;

    public Cantor() {
    }

    public Cantor (String nome, int tempoCarreira) {
        super(nome);
        this.tempoCarreira = tempoCarreira;
    }

    public int getTempoCarreira() {
        return tempoCarreira;
    }

    public void setTempoCarreira(int tempoCarreira) {
        this.tempoCarreira = tempoCarreira;
    }

    @Override
    public String toString(){
        return "Nome: " + super.getNome() + "; Tempo de carreira: " + getTempoCarreira();
    }
}
