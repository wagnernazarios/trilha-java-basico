package src;

import java.util.Scanner;

public class Exerc10 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o valor das compras: ");
        float valorCompras = leitor.nextFloat();
        String valorComprasFormatado = String.format("%.2f", valorCompras);

        float valorParcelado = valorCompras / 5;
        String valorParceladoFormatado = String.format("%.2f", valorParcelado);

        System.out.println("Valor total das compras: " + valorComprasFormatado + " reais."
                + "\nValor das compras parcelado em 5x: " + valorParceladoFormatado + " reais.");
    }

}
