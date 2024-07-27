package celular;
import funcionalidades.aparelho_telefonico.AparelhoTelefonico;
import funcionalidades.navegador_internet.NavegadorInternet;
import funcionalidades.reprodutor_musical.ReprodutorMusical;
import java.util.Scanner;

public class Celular implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    Scanner scanner = new Scanner(System.in);
    private String numero;
    //metodos da interface AparelhoTelefonico
    public void ligar(String numero){
        System.out.println("Ligando para " + numero);
    }
    public void atender(){
        System.out.println("Fazendo ligacao...");
    }
    public void correioDeVoz(){
        System.out.println("Grave a sua mensagem de voz");
    }
    //fim
    //metodos da interface NavegadorInternet
    public void atualizarPagina(){
        System.out.println("atualizando pagina...");
    }

    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada a guia atual!");
    }

    public void exibirPagina(String url){
        System.out.print("Digite a url que deseja pesquisar: ");
        url = scanner.next();
    }
    //fim
    //metodos da interface ReprodutorMusical
    public void selecionarMusica(String musica){
        System.out.println("Musica: "+ musica +" selecionada");
        //musica = scanner.next();
    }

    public void pausar(){
        System.out.println("Musica pausada!");
    }

    public void tocar(){
        System.out.println("Tocando musica");
    }
}
