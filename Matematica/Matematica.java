import java.util.Scanner;
import java.util.ArrayList;

// Classe principal
public class Matematica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Juros> historico = new ArrayList<>(); // Array para armazenar os cálculos
        Juros juros = null; // tipo atual de juros
        int op;
        // Estrutura de repetição
        do {
            System.out.println("\n ----------------------------------------------");
            System.out.println("|          Sistema de Cálculo de Juros         |");
            System.out.println(" ----------------------------------------------");
            System.out.println("1 - Juros Simples");
            System.out.println("2 - Juros Compostos");
            System.out.println("3 - Juros Simples com Carência");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();
            // Estrutura de decisão
            switch (op) {
                case 1:
                    System.out.println("Digite o capital (R$): ");
                    double capitalSimples = sc.nextDouble();

                    System.out.println("Digite a taxa de juros (%): ");
                    double taxaSimples = sc.nextDouble();

                    System.out.println("Digite o tempo (meses): ");
                    int tempoSimples = sc.nextInt();
                    sc.nextLine();

                    juros = new JurosSimples(capitalSimples, taxaSimples, tempoSimples);
                    // Verificação de dados para salvar no histórico
                    if (juros.verificar() == true) {
                        historico.add(juros);
                    } else {
                        System.out.println("Valores inválidos para o cálculo de juros.");
                    }       
                    break;

                case 2:
                    System.out.println("Digite o capital (R$): ");
                    double capitalComposto = sc.nextDouble();

                    System.out.println("Digite a taxa de juros (%): ");
                    double taxaComposta = sc.nextDouble();

                    System.out.println("Digite o tempo (meses): ");
                    int tempoComposto = sc.nextInt();
                    sc.nextLine();

                    juros = new JurosCompostos(capitalComposto, taxaComposta, tempoComposto);
                    if (juros.verificar() == true) {
                        historico.add(juros);
                    } else {
                        System.out.println("Valores inválidos para o cálculo de juros.");
                    }
                    break;

                case 3:
                    System.out.println("Digite o capital (R$): ");
                    double capitalCarencia = sc.nextDouble();

                    System.out.println("Digite a taxa de juros (%): ");
                    double taxaCarencia = sc.nextDouble();

                    System.out.println("Digite o tempo (meses): ");
                    int tempoCarencia = sc.nextInt();

                    System.out.println("Digite o período de carência (meses): ");
                    int carencia = sc.nextInt();
                    sc.nextLine();

                    juros = new JurosCarencia(capitalCarencia, taxaCarencia, tempoCarencia, carencia);
                    if (juros.verificar() == true) {
                        historico.add(juros);
                    } else {
                        System.out.println("Valores inválidos para o cálculo de juros.");
                    }
                    break;
                // Exibição do histórico de cálculos
                case 0:
                    System.out.println("Encerrando o programa...");
                    System.out.println("\n------------------ Histórico de Cálculos ------------------");
                        for (Juros j : historico) {
                            j.exibirDetalhes();
                        }
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
            // exibe o resultado do cálculo
            if (juros != null && juros.verificar() == true) {
                System.out.println("\n----------------- Resultado -----------------");
                juros.exibirDetalhes();
                juros = null;
            }

        } while (op != 0);

    }
}