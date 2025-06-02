import java.util.Scanner;
import java.util.ArrayList;

// Classe principal 
public class Matematica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Juros> historico = new ArrayList<>(); // Lista para armazenar os cálculos 
        Juros juros = null; // Objeto do tipo Juros 
        int op;

        // Estrutura de repetição 
        do {
            System.out.println("\n ----------------------------------------------");
            System.out.println("|          Sistema de Cálculo de Juros         |");
            System.out.println(" ----------------------------------------------");
            System.out.println("1 - Juros Simples");
            System.out.println("2 - Juros Compostos");
            System.out.println("3 - Juros Simples com Carência");
            System.out.println("0 - Voltar");

            // Leitura segura da opção escolhida pelo usuário
            op = lerInt(sc, "Escolha uma opção: ");

            // Estrutura de decisão
            switch (op) {
                case 1:
                    // Coleta de dados 
                    double capitalSimples = lerDouble(sc, "Digite o capital (R$): ");
                    double taxaSimples = lerDouble(sc,"Digite a taxa de juros (%): "); 
                    int tempoSimples = lerInt(sc, "Digite o tempo (meses): ");
                    juros = new JurosSimples(capitalSimples, taxaSimples, tempoSimples);
                    
                    // Verificação e armazenamento no histórico
                    if (juros.verificar()) {
                        historico.add(juros);
                    } else {
                        System.out.println("Valores inválidos para o cálculo de juros.");
                    }
                    break;

                case 2:
                    // Coleta de dados
                    double capitalComposto = lerDouble(sc, "Digite o capital (R$): ");
                    double taxaComposta = lerDouble(sc,"Digite a taxa de juros (%): ");
                    int tempoComposto = lerInt(sc, "Digite o tempo (meses): ");
                    juros = new JurosCompostos(capitalComposto, taxaComposta, tempoComposto);
                    
                    // Verificação e armazenamento no histórico
                    if (juros.verificar()) {
                        historico.add(juros);
                    } else {
                        System.out.println("Valores inválidos para o cálculo de juros.");
                    }
                    break;

                case 3:
                    // Coleta de dados 
                    double capitalCarencia = lerDouble(sc, "Digite o capital (R$): ");
                    double taxaCarencia = lerDouble(sc, "Digite a taxa de juros (%): ");
                    int tempoCarencia = lerInt(sc, "Digite o tempo (meses): ");
                    int carencia = lerInt(sc, "Digite o período de carência (meses): ");
                    sc.nextLine();

                    juros = new JurosCarencia(capitalCarencia, taxaCarencia, tempoCarencia, carencia);

                    // Verificação e armazenamento no histórico
                    if (juros.verificar()) {
                        historico.add(juros);
                    } else {
                        System.out.println("Valores inválidos para o cálculo de juros.");
                    }
                    break;

                case 0:
                    // Exibição do histórico antes de sair
                    System.out.println("Voltando...");
                    System.out.println("\n------------------ Histórico de Cálculos ------------------");
                    for (Juros j : historico) {
                        j.exibirDetalhes();
                    }
                    break;

                default:
                    // Opção inválida
                    System.out.println("Opção inválida.");
            }

            // Exibição do resultado do cálculo
            if (juros != null && juros.verificar()) {
                System.out.println("\n----------------- Resultado -----------------");
                juros.exibirDetalhes();
            }

        } while (op != 0);
    }

    // Função auxiliar para leitura segura de um número inteiro
    public static int lerInt(Scanner sc, String mensagem) {
        int valor = 0;
        boolean valido = false;

        // Laço para garantir que o usuário digite um número inteiro válido
        do {
            System.out.println(mensagem);
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                valido = true;
            } else {
                System.out.println("Entrada inválida! Digite um número:");
                sc.next(); // Limpa entrada inválida
            }
        } while (!valido);
        return valor;
    }
    public static double lerDouble(Scanner sc, String mensagem) {
        double valor = 0;
        boolean valido = false;
        do {
            System.out.println(mensagem);
            if (sc.hasNextDouble()) {
                valor = sc.nextDouble();
                valido = true;
            } else {
                System.out.println("Entrada inválida! Digite um número: ");
                sc.next();
            }
        } while (!valido);
        return valor;
    }
}