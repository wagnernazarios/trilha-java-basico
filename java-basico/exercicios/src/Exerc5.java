package src;

import java.util.Scanner;

public class Exerc5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = leitor.nextLine();
        System.out.print("Digite a nota 1: ");
        double nota1 = leitor.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = leitor.nextDouble();
        System.out.print("Digite a nota 3: ");
        double nota3 = leitor.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3);

        System.out.println("\nNome: " + nomeAluno + "\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nNota 3: " + nota3
                + "\nMedia: " + media);

        leitor.close();
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }
}
