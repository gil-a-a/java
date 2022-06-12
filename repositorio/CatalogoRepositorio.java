package repositorio;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.Catalogo;

public class CatalogoRepositorio {
    private static List<Catalogo> catalogos = new ArrayList<>();
    
    public void addCatalogo(Catalogo catalogo){
        catalogos.add(catalogo);
    }
    
    public boolean nomeRepetido(String nome){
        Iterator<Catalogo> iterator = catalogos.iterator();
        
        while (iterator.hasNext()){
            if (iterator.next().getNome() == nome){
                return false
            }
        }
    }
    
    public void consultaNome(){
        while(iterator.hasNext()){
            //compara os nomes pra ver se tem na lista
            if ( == ){
                break;
            }
            else{
                System.out.println("Cd não encontrado");
                return;
            }
        }
    }
}
