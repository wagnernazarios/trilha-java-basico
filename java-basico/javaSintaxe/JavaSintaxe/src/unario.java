public class unario {

    public static void main(String[] args) {

        int numero = 5;

        // * operador unario não altera a variavel principal na saida
        System.out.println(-numero);

        // * O valor continua como no original
        System.out.println(numero);

        // * porem ele so altera o valor se for reatribuido
        numero = -numero;

        System.out.println(numero);

        // * o mesmo valor para torna-lo positivo
        numero = +numero;

        System.out.println(numero);

    }

}
