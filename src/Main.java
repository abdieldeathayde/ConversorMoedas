import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                ************************************************
                Seja bem vindo/a ao Conversor de Moeda =]
                
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileiro
                4) Real brasileiro =>> Dólar
                5) Dólar =>> peso colombiano
                6) Peso colombiano =>> Dólar
                7) Sair
                Escolha uma opção válida:
                 ************************************************
                """);

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> ConverteDolarParaPesoArgentino();
            case 2 -> ConverterPesoArgentinoParaDolar();
            case 3 -> ConverterDolarParaRealBrasileiro();
            case 4 -> ConverterRealBrasileiroParaDolar();
            case 5 -> ConverteDolarParaPesoColombiano();
            case 6 -> ConvertePesoColombianoParaDolar();
            case 7 -> System.out.println("Encerrando programa!");



            default -> throw new IllegalStateException("Unexpected value: " + opcao);
        }

        sc.close();
    }

    public static void ConverteDolarParaPesoArgentino() {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        System.out.println("Digite o valor que deseja converter:");
        double valor = sc.nextDouble();
        double peso = 1189.6700;



        System.out.println("Valor " + String.format("%.2f", valor) + " [USD] equivale ao valor final de " + String.format("%.2f", peso) + " [ARS]");

        sc.close();
    }

    public static void ConverterPesoArgentinoParaDolar() {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        System.out.println("Digite o valor que deseja converter:");
        double valor = sc.nextDouble();
        double peso = 0.00084034;

        System.out.println("Valor " + String.format("%.2f", valor) + " [ARS] equivale ao valor final de " + String.format("%.2f", peso) + " [USD]");
        sc.close();
    }

    public static void ConverterDolarParaRealBrasileiro() {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        System.out.println("Digite o valor que deseja converter:");
        double valor = sc.nextDouble();
        double peso = 5.6328;

        System.out.println("Valor " + String.format("%.2f", valor) + " [USD] equivale ao valor final de " + String.format("%.2f", peso) + " [BRL]");

        sc.close();
    }

    public static void ConverterRealBrasileiroParaDolar() {

        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        System.out.println("Digite o valor que deseja converter:");
        double valor = sc.nextDouble();
        double peso = 0.1785;

        System.out.println("Valor " + String.format("%.2f", valor) + " [BRL] equivale ao valor final de " + String.format("%.2f", peso) + " [USD]");
        sc.close();
    }

    public static void ConverteDolarParaPesoColombiano() {

        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        System.out.println("Digite o valor que deseja converter:");
        double valor = sc.nextDouble();
        double peso = 4102.9598;

        System.out.println("Valor " + String.format("%.2f", valor) + " [USD] equivale ao valor final de " + String.format("%.2f", peso) + " [COP]");
        sc.close();
    }

    public static void ConvertePesoColombianoParaDolar() {

        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        System.out.println("Digite o valor que deseja converter:");
        double valor = sc.nextDouble();
        double peso = 0.00024377;

        System.out.println("Valor " + String.format("%.2f", valor) + " [COP] equivale ao valor final de " + String.format("%.2f", peso) + " [USD]");
        sc.close();
    }
}