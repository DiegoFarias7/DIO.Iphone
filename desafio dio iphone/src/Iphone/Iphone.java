package Iphone;
import celular.Celular;
import java.util.Scanner;

public class Iphone {
    static Celular iphone = new Celular();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String opcao;
        boolean rodando = true;
        while(rodando){
            System.out.println("Bem vindo ao Iphone");
            System.out.print("[1] - Reprodutor musical\n[2] - Navegador de internet\n[3] - Telefone\n[0] - Sair\nSelecione uma opcao: ");
            opcao = ler.nextLine();
            switch (opcao) {
                case "1":
                    menuMusicas();
                    break;
                case "2":
                    menuNavegador();
                    break;
                case "3":
                    menuTelefone();
                    break;
                case "0":
                    rodando = false;
                    break;
                default:
                    System.err.println("Opcao invalida! Tente novamente!");
                    break;
            }
        }
    }

    public static void menuMusicas(){
        String opcao, musica;
        boolean rodando = true;
        while (rodando) {
            System.out.print("[1] - Selecionar musica\n[2] - Tocar musica\n[3] - Pausar musica\n[0] - Sair\nSelecione uma opcao: ");
            opcao = scanner.next();
            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome da musica que deseja ouvir: ");
                    musica = scanner.next();
                    iphone.selecionarMusica(musica);
                    break;
                case "2":
                    iphone.tocar();
                    break;
                case "3":
                    iphone.pausar();
                    break;
                case "0":
                    rodando = false;
                    break;
                default:
                    System.err.println("Opcao invalida! Tente novamente!");
                    break;
            }
        }
    }

    public static void menuTelefone(){
        String opcao, numero;
        boolean rodando = true;
        while (rodando) {
            System.out.print("[1] - Discar\n[2] - Atender\n[3] - Correio de voz\n[0] - Sair\nSelecione uma opcao: ");
            opcao = scanner.nextLine();
            switch (opcao) {
                case "1":
                    System.out.print("Digite o telefone que deseja ligar: ");
                    numero = scanner.nextLine();
                    iphone.ligar(numero);
                    break;
                case "2":
                    iphone.atender();
                    break;
                case "3":
                    iphone.correioDeVoz();
                    break;
                case "0":
                    rodando = false;
                    break;
                default:
                    break;
            }
        }
    }

    public static void menuNavegador(){
        String opcao, url;
        boolean rodando = true;
        while (rodando) {
            System.out.print("[1] - Exibir pagina\n[2] - Atualizar pagina\n[3] - Adicionar nova aba\n[0] - Sair\nSelecione uma opcao: ");
            opcao = scanner.nextLine();
            switch (opcao) {
                case "1":
                    System.out.print("Digite a url do site que deseja buscar: ");
                    url = scanner.nextLine();
                    iphone.exibirPagina(url);
                    break;
                case "2":
                    iphone.atualizarPagina();
                    break;
                case "3":
                    iphone.adicionarNovaAba();
                    break;
                case "0":
                    rodando = false;
                    break;
                default:
                    break;
            }
        }
    }
}

