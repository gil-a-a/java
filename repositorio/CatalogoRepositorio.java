package repositorio;

import java.util.List;
import java.util.ArrayList;
import modelo.Catalogo;

public class CatalogoRepositorio {
    private static List<Catalogo> catalogos = new ArrayList<>();

    public void addCatalogo(Catalogo catalogo){
        catalogos.add(catalogo);
    }

    /*for(int i = 0; i < catalogos.lenght; i++){
        
    }*/
}