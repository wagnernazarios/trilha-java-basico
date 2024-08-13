public class vendedor extends funcionario {
    // Para que uma classe herde dados ou caracteristica de outra classe basta
    // adiociar extends e o nome da classe e no metodo construtor adicionar um
    // super()

    private int comissaPorItens;
    private int ItensVendidos;

    public vendedor() {
        super();
    }

    public int getComissaPorItens() {
        return comissaPorItens;
    }

    public void setComissaPorItens(int comissaPorItens) {
        this.comissaPorItens = comissaPorItens;
    }

    public int getItensVendidos() {
        return ItensVendidos;
    }

    public void setItensVendidos(int itensVendidos) {
        ItensVendidos = itensVendidos;
    }

}
