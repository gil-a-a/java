package exercicio.exercicio.trabalho_um;

import java.util.Scanner;
import modelo.Cd;
import modelo.Dvd;
import modelo.Catalogo;
import modelo.Banda;
import modelo.Cantor;
import modelo.Artista;
import repositorio.ArtistaRepositorio;
import repositorio.CatalogoRepositorio;

//Membros do grupo:
//Diogo Salmazo Lemes
//Gil de Almeida Alves
//Pedro Bruce de Lima

public class Demo {
    private static ArtistaRepositorio artistas = new ArtistaRepositorio();
    private static CatalogoRepositorio catalogos = new CatalogoRepositorio();
    private static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        int botao;
        
        do{
            System.out.println("-----------------MENU-----------------");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Listar todos");
            System.out.println("5 - Sair");
            System.out.println("--------------------------------------");
            
            botao = ler.nextInt();
            
            switch (botao){
                case 1: 
                    cadastrar();
                break;
                
                case 2:
                    //consultar();
                break;
                
                case 3:
                    //excluir();
                break;

                case 4:
                    //listar_todos();
                break;
                
                case 5:
                    System.out.println("Saindo...");
                break;

                default:
                    System.out.println("Opcao invalida");
                break;
            }
        }while(botao != 5);
     
        ler.close();
    }

    public static void cadastrar() {
        int opcao;
        int codigoBarras=0; //mudar isso aq pra uma string de 6 dígitos
        do {
            System.out.println("1 - Cadastrar CD");
            System.out.println("2 - Cadastrar DVD");
            System.out.println("3 - Cadastrar Cantor");
            System.out.println("4 - Cadastrar Banda");
            System.out.println("5 - Retornar ao menu");

            opcao = ler.nextInt();
            
            switch(opcao) {
                case 1:
                    cadastraCd(codigoBarras);
                    //System.out.println(catalogos);    esses sout são só pra teste
                break;
                
                case 2:
                    cadastraDvd(codigoBarras);
                    //System.out.println(catalogos);
                break;
                
                case 3:
                    cadastraCantor();
                    //System.out.println(artistas);
                break;
                
                case 4:
                    cadastraBanda();
                    //System.out.println(artistas);
                break;
                
                default: System.out.println("Opcao invalida.");
            }
        }while(opcao != 5);
        System.out.println("Retornando ao menu.....");
    }
    
    public static void cadastraCd(int codigoBarras) {
        String nome;
        double preco;
        int numFaixas;
        
        while(true){
            System.out.println("Nome do CD: ");
            nome = ler.next();
            
            //compara os nomes pra ver se tem repetido
            if (catalogos.nomeRepetido(nome){
                break;
            }
            else{
                System.out.println("Nome repetido");
            }
        }
        ler.nextLine();    //coloquei esse nextLine() aq, o enter tava sendo lido na próxima leitura
        System.out.println("Preço do CD: ");
        preco = ler.nextDouble();
        System.out.println("Número de faixas do CD: ");
        numFaixas = ler.nextInt();
        
        Cd cdNovo = new Cd(nome, preco, codigoBarras, numFaixas);
        catalogos.addCatalogo(cdNovo);
        
        codigoBarras++; //mudar o código de barras pra string
    }

    public static void cadastraDvd(int codigoBarras) {
        String nome;
        double preco;
        int tempoDuracao;

        while(true){
            System.out.println("Nome do DVD: ");
            nome = ler.next();
            
            //compara os nomes pra ver se tem repetido
            if (catalogos.nomeRepetido(nome){
                break;
            }
            else{
                System.out.println("Nome repetido");
            }
        }
        ler.nextLine();    //coloquei esse nextLine() aq, o enter tava sendo lido na próxima leitura
        System.out.println("Preço do DVD: ");
        preco = ler.nextDouble();
        System.out.println("Tempo de duração do DVD: ");
        tempoDuracao = ler.nextInt();
        
        Dvd dvdNovo = new Dvd(nome, preco, codigoBarras, tempoDuracao);
        catalogos.addCatalogo(dvdNovo);

        codigoBarras++; //mudar o código de barras pra string
    }

    public static void cadastraCantor() {
        String nome;
        int tempoCarreira;

        while(true){
            System.out.println("Nome do cantor: ");
            nome = ler.next();
            
            //compara os nomes pra ver se tem repetido
            if (artistas.nomeRepetido(nome){
                break;
            }
            else{
                System.out.println("Nome repetido");
            }
        }
        ler.nextLine();    //coloquei esse nextLine() aq, o enter tava sendo lido na próxima leitura
        System.out.println("Coloque o tempo de carreira do cantor: ");
        tempoCarreira = ler.nextInt();

        Cantor cantorNovo = new Cantor(nome, tempoCarreira);
        artistas.addArtista(cantorNovo);
    }

    public static void cadastraBanda() {
        String nome;
        int numIntegrantes;

        while(true){
            System.out.println("Nome da banda: ");
            nome = ler.next();
            
            //compara os nomes pra ver se tem repetido
            if (artistas.nomeRepetido(nome){
                break;
            }
            else{
                System.out.println("Nome repetido");
            }
        }
        ler.nextLine();    //coloquei esse nextLine() aq, o enter tava sendo lido na próxima leitura
        System.out.println("Número de integrantes da banda: ");
        numIntegrantes = ler.nextInt();

        Banda bandaNovo = new Banda(nome, numIntegrantes);
        artistas.addArtista(bandaNovo);
    }
    
    public static void consultar(){
        do {
            System.out.println("1 - Consultar CD");
            System.out.println("2 - Consultar DVD");
            System.out.println("3 - Consultar Cantor");
            System.out.println("4 - Consultar Banda");
            System.out.println("5 - Retornar ao menu");

            opcao = ler.nextInt();
            
            switch(opcao) {
                case 1:
                    consultaCd();
                break;
                
                case 2:
                    consultaDvd();
                break;
                
                case 3:
                    consultaCantor();
                break;
                
                case 4:
                    consultaBanda();
                break;
                
                default: System.out.println("Opcao invalida.");
            }
        }while(opcao != 5);
        System.out.println("Retornando ao menu.....");
    }
    
    public static void consultaCd(){
        String nome;
        
        nome = ler.next();
        catalogos.consultaNome(nome);
        
        //ve se tem o nome;
        //se tiver: printa;
        //senão: vaza;
    }
    
    public static void consultaDvd(){
        //le o nome;
        //ve se tem o nome;
        //se tiver: printa;
        //senão: vaza;
    }
    
    public static void consultaCantor(){
        //le o nome;
        //ve se tem o nome;
        //se tiver: printa;
        //senão: vaza;
    }
    
    public static void consultaBanda(){
        //le o nome;
        //ve se tem o nome;
        //se tiver: printa;
        //senão: vaza;
    }
    
}
