import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Pessoa objetPessoa = new Pessoa();

        System.out.println("Informe seu nome: ");
        String nome = leitor.nextLine();

        float peso = Pessoa.lerFloat(leitor, "Informe seu peso: ");
        objetPessoa.setPeso(peso);

        float altura = Pessoa.lerFloat(leitor, "Informe sua altura: ");
        objetPessoa.setAltura(altura);

        float imcPessoa = objetPessoa.calcularIMC();
        System.out.println(nome + ", seu IMC é: " + imcPessoa);

        leitor.close();

    }

}
