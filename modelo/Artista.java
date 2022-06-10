package modelo;

public class Artista{
    private String nome;

    public Artista(){
    }

    public Artista(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}