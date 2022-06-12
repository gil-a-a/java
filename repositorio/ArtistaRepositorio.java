package repositorio;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.Artista;

public class ArtistaRepositorio {
    private static List<Artista> artistas = new ArrayList<>();

    public void addArtista(Artista artista) {
        artistas.add(artista);
    }

    public boolean nomeRepetido(String nome){
        Iterator<Artista> iterator = catalogos.iterator();
        
        while (iterator.hasNext()){
            if (iterator.next().getNome() == nome){
                return false
            }
        }
    }
}
