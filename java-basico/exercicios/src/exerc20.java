package src;

import java.util.Scanner;

public class Exerc20 {

    public static void main(String[] args) {

        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        char desejaRepetir = 's';
        int totalCarros = 0;
        int totalSeminovos = 0;

        try (Scanner leitor = new Scanner(System.in)) {
            while (desejaRepetir == 'S' || desejaRepetir == 's') {

                System.out.println("Informe o ano de fabricação do veiculo");
                anoFabricacao = leitor.nextInt();
                System.out.println("Informe o valor do veiculo");
                valorCarro = leitor.nextFloat();

                if (anoFabricacao <= 2000) {
                    porcentagemDesconto = 0.12f;
                } else {
                    porcentagemDesconto = 0.07f;
                    totalSeminovos++;
                }

                totalCarros++;

                valorDesconto = valorCarro * porcentagemDesconto;
                valorPagar = valorCarro - valorDesconto;

                System.out.println("O valor do desconto e:" + valorDesconto);
                System.out.println("O valor a ser pago e: " + valorPagar);

                System.out.println("Deseja Repetir? S - Sim / N - Não");
                desejaRepetir = leitor.next().charAt(0);
            }
        }

        System.out.println("Total de carros seminovos: " + totalSeminovos);
        System.out.println("Total de carros: " + totalCarros);

    }
}
