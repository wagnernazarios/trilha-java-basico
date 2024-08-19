public class test {
    public static void main(String[] args) {
        String primeiroNome = "Wagner";
        String segundoNome = "Nazario";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        String nomeCompleto = primeiroNome + " " + segundoNome;
        return nomeCompleto;
    }

}
