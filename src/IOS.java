import java.util.Scanner;
public class IOS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean iniciarIphone = false;

        do {
            System.out.print("Deseja iniciar o Iphone? (Sim/Não)");
            String escolha = scanner.nextLine();

            if (escolha.equalsIgnoreCase("Sim")) {
                iniciarIphone = true;
                System.out.println("Iniciando o iPhone...");
                exibirOpcoes(scanner);
            } else if (escolha.equals("não") || escolha.equals("nao")||escolha.equals("Não") || escolha.equals("Nao")) {
                iniciarIphone = false;
                System.out.println("O iPhone não foi iniciado.");
            } else {
                // Código para opções inválidas
                System.out.println("Opção inválida. Por favor, escolha 'Sim' ou 'Não'.");
            }
        } while (!iniciarIphone);
    }

    private static void exibirOpcoes(Scanner scanner) {
        boolean continuarUso = true;

        while (continuarUso) {
            System.out.println("\nO que você deseja fazer?");
            System.out.println("1. Reprodutor Musical");
            System.out.println("2. Mensagem e Ligação");
            System.out.println("3. Navegador na Internet");
            System.out.println("4. Desligar o iPhone");
            System.out.print("Escolha uma opção (1/2/3/4): ");
            int escolha = scanner.nextInt();

            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("\nSpotify:");
                    break;
                case 2:
                    System.out.println("\nWhatsapp:");
                    break;
                case 3:
                    System.out.println("\nEDGE");
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
