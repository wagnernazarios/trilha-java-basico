public class Concatenacao {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String concatenacao = "?";

        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(concatenacao);

    }

    @Override
    public String toString() {
        return "App []";
    }
}
