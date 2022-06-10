package repositorio;

import java.util.List;
import java.util.ArrayList;
import modelo.Artista;

public class ArtistaRepositorio {
    private static List<Artista> artistas = new ArrayList<>();

    public void addArtista(Artista artista) {
        artistas.add(artista);
    }

    
}