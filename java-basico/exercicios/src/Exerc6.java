package src;

public class Exerc6 {

    public static void main(String[] args) {

        int a = 60;
        int b = 45;

        System.out.println("Valor 1: " + a + "\nValor 2: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nValor 1: " + a + "\nValor 2: " + b);

    }
}