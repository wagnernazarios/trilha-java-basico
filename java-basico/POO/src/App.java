import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Pessoa objetPessoa = new Pessoa();

        System.out.println("Informe seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Informe seu peso: ");
        objetPessoa.setPeso(leitor.nextFloat());

        System.out.println("Informe sua altura: ");
        objetPessoa.setAltura(leitor.nextFloat());


        float imcPessoa = objetPessoa.calcularIMC();
        System.out.println(nome + ", seu IMC é: " + imcPessoa);
    }

}
