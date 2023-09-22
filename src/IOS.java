import java.util.Scanner;

public class IOS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean iniciarIphone = false;

        do {
            System.out.println("Deseja iniciar o iPhone? (Sim/Não)");
            String resposta = scanner.nextLine().toLowerCase();

            switch (resposta) {
                case "sim":
                    iniciarIphone = true;
                    System.out.println("Iniciando o iPhone...");
                    exibirOpcoes(scanner);

                    break;
                case "não":
                    iniciarIphone = false;
                    System.out.println("O iPhone não foi iniciado.");
                    break;
                default:
                    System.out.println("Resposta inválida. Por favor, responda 'Sim' ou 'Não'.");
            }
        } while (!iniciarIphone);
    }

    private static void exibirOpcoes(Scanner scanner) {
        boolean continuarUso = true;

        while (continuarUso) {
            System.out.println("\nO que você deseja fazer?");
            System.out.println("1. Spotify");
            System.out.println("2. Whatsapp");
            System.out.println("3. Safari");
            System.out.println("4. Desligar o iPhone");
            System.out.print("Escolha uma opção");
            int escolha = scanner.nextInt();

            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("\nSpotify:");
                    Musica reprodutorMusical = new Musica();
                    reprodutorMusical.reprodutorMusical(scanner);
                    break;
                case 2:
                    System.out.println("\nWhatsapp:");
                    MensagemLigacao mensagemLigacao = new MensagemLigacao();
                    mensagemLigacao.executarMenu();
                    break;
                case 3:
                    System.out.println("\nSafari:");
                    NavegadorInternet navegadorInternet = new NavegadorInternet();
                    navegadorInternet.executarMenuSafari();
                    break;
                case 4:
                    System.out.println("\nDesligando o iPhone...");
                    continuarUso = false;
                    break;
                default:
                    System.out.println("\nOpção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}