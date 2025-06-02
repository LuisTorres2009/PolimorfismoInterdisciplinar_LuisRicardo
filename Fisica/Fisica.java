// Classe principal do sistema de cálculo de energia física
// Permite ao usuário calcular energia potencial, cinética e mecânica
import java.util.Scanner;
import java.util.ArrayList;

public class Fisica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        ArrayList<Energia> hist = new ArrayList<>(); // Lista para armazenar os cálculos realizados
        Energia energia = null;
        double m; // massa
        double h; // altura
        double v; // velocidade

        // Menu interativo com opções de cálculo
        do {
            System.out.println("\n ----------------------------------------------");
            System.out.println("|         Sistema de Cálculo de Energia        |");
            System.out.println(" ----------------------------------------------");
            System.out.println("1 - Energia Potencial ");
            System.out.println("2 - Energia Cinética ");
            System.out.println("3 - Energia Mecânica ");
            System.out.println("0 - Voltar ");
            op = lerInt(scanner, "Escolha o tipo de energia: ");

            // Decisão com base na escolha do usuário
            switch (op) {
                case 1:
                    System.out.println("Calcular Energia Potencial!");
                    m = lerDouble(scanner, "Insira a massa (KG): ");
                    h = lerDouble(scanner, "Insira a altura (M): ");
                    energia = new EnergiaP(m, m, h);
                    hist.add(energia); // adiciona ao histórico
                    break;

                case 2:
                    System.out.println("Calcular Energia Cinética!");
                    m = lerDouble(scanner, "Insira a massa (KG): ");
                    v = lerDouble(scanner, "Insira a velocidade (M/s): ");
                    energia = new EnergiaC(m, v);
                    hist.add(energia);
                    break;

                case 3:
                    System.out.println("Calcular Energia Mecânica!");
                    m = lerDouble(scanner, "Insira a massa (KG): ");
                    v = lerDouble(scanner, "Insira a velocidade (M/s): ");
                    h = lerDouble(scanner, "Insira a altura (M): ");
                    energia = new EnergiaM(m, m, h, v);
                    hist.add(energia);
                    break;

                case 0:
                    System.out.println("Voltando...");
                    System.out.println("Histórico de Cálculos: ");
                    for (Energia e : hist) {
                        e.exibirResultados();
                    }
                    break;

                default:
                    System.out.println("Por favor, insira um número apenas das opções acima.");
            }

            // Exibe os resultados do cálculo atual
            if (energia != null) {
                System.out.println("\nResultados: ");
                energia.exibirResultados();
                energia = null;
            }

        } while (op != 0);
    }

    // Método para ler valores inteiros com verificação
    public static int lerInt(Scanner scanner, String mensagem) {
        int valor = 0;
        boolean valido = false;
        do {
            System.out.println(mensagem);
            if (scanner.hasNextInt()) {
                valor = scanner.nextInt();
                valido = true;
            } else {
                System.out.println("Entrada inválida! Digite um número:");
                scanner.next();
            }
        } while (!valido);
        return valor;
    }

    // Método para ler valores decimais com verificação
    public static double lerDouble(Scanner scanner, String mensagem) {
        double valor = 0;
        boolean valido = false;
        do {
            System.out.println(mensagem);
            if (scanner.hasNextDouble()) {
                valor = scanner.nextDouble();
                valido = true;
            } else {
                System.out.println("Entrada inválida! Digite um número: ");
                scanner.next();
            }
        } while (!valido);
        return valor;
    }
}