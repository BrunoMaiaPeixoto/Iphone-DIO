import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MensagemLigacao {
    private List<Contato> listaDeContatos;

    public MensagemLigacao() {
        listaDeContatos = new ArrayList<>();
    }

    public boolean existeContatoPeloNome(String nome) {
        return listaDeContatos.stream().anyMatch(contato -> contato.getNome().equalsIgnoreCase(nome));
    }

    public boolean existeContatoPeloNumero(String numero) {
        return listaDeContatos.stream().anyMatch(contato -> contato.getNumero().equals(numero));
    }

    public void adicionarContato(String nome, String numero) {
        Contato contato = new Contato(nome, numero);
        listaDeContatos.add(contato);
        System.out.println("Contato adicionado: " + nome + ", " + numero);
    }

    public void ligar(String destinatario) {
        if (existeContatoPeloNome(destinatario) || existeContatoPeloNumero(destinatario)) {
            System.out.println("Encontrado contato: " + destinatario);
            System.out.println("Iniciando ligação com " + destinatario);
            System.out.println("Encerrando ligação.");
        } else {
            System.out.println("Contato não encontrado na lista de contatos.");
        }
    }

    public void enviarMensagem(String destinatario) {
        if (existeContatoPeloNome(destinatario) || existeContatoPeloNumero(destinatario)) {
            System.out.println("Encontrado contato: " + destinatario);
            System.out.println("Enviando mensagem para " + destinatario);
            System.out.println("Mensagem enviada.");
        } else {
            System.out.println("Contato não encontrado na lista de contatos.");
        }
    }

    public void executarMenu() {
        boolean continuarUsoMensagemLigacao = true;
        Scanner scanner = new Scanner(System.in);

        while (continuarUsoMensagemLigacao) {
            System.out.println("\nMensagem e Ligação:");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Fazer Ligação");
            System.out.println("3. Enviar Mensagem");
            System.out.println("4. Voltar");

            System.out.print("Escolha uma opção (1/2/3/4): ");
            int escolhaMensagemLigacao = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaMensagemLigacao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nomeContato = scanner.nextLine();
                    System.out.print("Digite o número do contato: ");
                    String numeroContato = scanner.nextLine();
                    adicionarContato(nomeContato, numeroContato);
                    break;
                case 2:
                    System.out.print("Digite o número ou nome do contato que deseja ligar: ");
                    String numeroOuNomeLigacao = scanner.nextLine();
                    ligar(numeroOuNomeLigacao);
                    break;
                case 3:
                    System.out.print("Digite o número ou nome para enviar mensagem: ");
                    String numeroOuNomeMensagem = scanner.nextLine();
                    enviarMensagem(numeroOuNomeMensagem);
                    break;
                case 4:
                    continuarUsoMensagemLigacao = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    private class Contato {
        private String nome;
        private String numero;

        public Contato(String nome, String numero) {
            this.nome = nome;
            this.numero = numero;
        }

        public String getNome() {
            return nome;
        }

        public String getNumero() {
            return numero;
        }
    }
}