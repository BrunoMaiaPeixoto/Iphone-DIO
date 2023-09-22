import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NavegadorInternet {
    private List<String> abaNavegador;
    private int abaAtual;

    public NavegadorInternet() {
        abaNavegador = new ArrayList<>();
        abaAtual = -1;
    }

    public void adicionarAba() {
        abaAtual++;
        abaNavegador.add("Aba " + abaAtual);
        System.out.println("Nova aba adicionada: Aba " + abaAtual);
    }

    public void fecharAba() {
        if (abaAtual >= 0) {
            System.out.println("Fechando aba: Aba " + abaAtual);
            abaNavegador.remove(abaAtual);
            abaAtual--;
        } else {
            System.out.println("Nenhuma aba para fechar.");
        }
    }

    public void executarMenuSafari() {
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);

        while (continuar) {
            System.out.println("\nO que você deseja fazer no Safari?");
            System.out.println("1. Adicionar aba");
            System.out.println("2. Fechar aba");
            System.out.println("3. Sair do Safari");

            System.out.print("Escolha uma opção (1/2/3): ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    adicionarAba();
                    break;
                case 2:
                    fecharAba();
                    break;
                case 3:
                    System.out.println("Saindo do Safari...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida (1/2/3).");
            }
        }
    }
}
