package src;

import java.util.Scanner;

public class Exerc9 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float valorDepositado = 0.0f;
        float jurosPoupanca = 0.07f;

        System.out.print("Informe o valor depositado: ");
        valorDepositado = leitor.nextFloat();

        Float valorComJuros = valorDepositado * jurosPoupanca;
        float depositoComJuros = valorDepositado + valorComJuros;

        String valorDepositadoFormatado = String.format("%.2f", valorDepositado);
        String valorComJurosFormatado = String.format("%.2f", valorComJuros);
        String depositoComJurosFormatado = String.format("%.2f", depositoComJuros);

        System.out.println("Valor depositado: " + valorDepositadoFormatado + " reais."
                + "\nJuros do valor depositado depois de 1 mes:  "
                + valorComJurosFormatado + " reais."
                + "\nValor depositado com Juros: " + depositoComJurosFormatado + " reais.");

        leitor.close();

    }
}
