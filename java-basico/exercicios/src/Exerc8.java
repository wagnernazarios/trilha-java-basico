package src;

import java.util.Scanner;

public class Exerc8 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor em REAL para a conversão.");
        double real = leitor.nextDouble();
        System.out.println("Informe a cotação do dolar atual");
        double dollar = leitor.nextDouble();

        double taxaCambio = 1 / dollar;

        double realConvertido = real * taxaCambio;

        String valorFormatado = String.format("%.2f", realConvertido);
        System.out.println("R$" + real + " convertido em dolar é igual : " + valorFormatado);

        leitor.close();
    }

}
