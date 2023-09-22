import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Musica {
    private List<String> playlist;
    private int musicaAtual;

    public Musica() {
        playlist = new ArrayList<>();
        musicaAtual = -1;
    }

    public void adicionarMusica(String musica) {
        playlist.add(musica);
        System.out.println("Música adicionada à playlist: " + musica);
    }

    public void tocar() {
        if (!playlist.isEmpty()) {
            if (musicaAtual == -1) {
                musicaAtual = 0;
                System.out.println("Tocando: " + playlist.get(musicaAtual));
            } else {
                System.out.println("Continuando a tocar: " + playlist.get(musicaAtual));
            }
        } else {
            System.out.println("A playlist está vazia. Adicione músicas antes de tocar.");
        }
    }

    public void pausar() {
        if (musicaAtual != -1) {
            System.out.println("Pausando: " + playlist.get(musicaAtual));
        } else {
            System.out.println("Não há música tocando para pausar.");
        }
    }

    public void selecionarMusica(int fila) {
        if (playlist.isEmpty()){
            musicaAtual = fila;
            System.out.println("Selecionando música: " + playlist.get(musicaAtual));
        } else {
            System.out.println("Índice de música inválido.");
        }
    }

    public void reprodutorMusical(Scanner scanner) {
        boolean continuarUsoMusica = true;
        while (continuarUsoMusica) {
            System.out.println("\nReprodutor Musical:");
            System.out.println("1. Adicionar Música à Playlist");
            System.out.println("2. Tocar Música");
            System.out.println("3. Pausar Música");
            System.out.println("4. Selecionar Música");
            System.out.println("5. Voltar");

            System.out.print("Escolha uma opção (1/2/3/4/5): ");
            int escolhaMusica = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaMusica) {
                case 1:
                    System.out.print("Digite o nome da música a ser adicionada: ");
                    String nomeMusica = scanner.nextLine();
                    adicionarMusica(nomeMusica);
                    break;
                case 2:
                    tocar();
                    break;
                case 3:
                    pausar();
                    break;
                case 4:
                    System.out.print("Digite a posição da música a ser selecionada: ");
                    int indiceMusica = scanner.nextInt();
                    selecionarMusica(indiceMusica);
                    break;
                case 5:
                    continuarUsoMusica = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}