package exercicio4;

public class Main {

    public static void main(String[] args) {

        Invoice inv = new Invoice(1, "Mousepad", 16, 40.0f);

        System.out.println("Valor total: " + inv.getInvoiceAmount() + " reais.");
    }
}
