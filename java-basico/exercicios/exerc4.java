public class exerc4 {
    public static void main(String[] args) {

        String vendedor = "Roberto";
        float salario = 1220.0f;
        float comissao = 0.15f; // Isso seria o mesmo que 15%
        float totalVendas = 15000.0f;

        float salarioTotalMes = salario + (comissao * totalVendas);

        System.out.println("Nome: " + vendedor + "\nSalario: " + salario + "\nSalario + comissao: " + salarioTotalMes);
    }
}
