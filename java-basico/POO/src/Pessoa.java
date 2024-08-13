import java.util.Scanner;

public class Pessoa {
    private float peso;
    private float altura;

    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    static float lerFloat(Scanner leitor, String mensagem) {
        float valor = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.print(mensagem);
            if (leitor.hasNextFloat()) {
                valor = leitor.nextFloat();
                entradaValida = true;
            } else {
                System.out.println("Entrada inválida! Por favor, digite um número válido.");
                leitor.next(); // Limpa a entrada inválida
            }
        }
        return valor;
    }

}
