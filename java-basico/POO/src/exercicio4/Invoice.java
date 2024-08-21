package exercicio4;

public class Invoice {

    private int codigoProduto;
    private String descricao;
    private int qtdProduto;
    private float valorUnitario;

    public Invoice(int codigoProduto, String descricao, int qtdProduto, float valorUnitario) {
        this.setCodigoProduto(codigoProduto);
        this.setDescricao(descricao);
        this.setQtdProduto(qtdProduto);
        this.setValorUnitario(valorUnitario);
    }

    public String getInvoiceAmount() {
        float valorTotal = qtdProduto * valorUnitario;
        String valotTotalFormatado = String.format("%.2f", valorTotal);
        return valotTotalFormatado;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        if (qtdProduto < 0) {
            this.qtdProduto = 0;
        } else {
            this.qtdProduto = qtdProduto;
        }
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        if (valorUnitario < 0) {
            this.valorUnitario = 0;
        } else {
            this.valorUnitario = valorUnitario;

        }
    }

}