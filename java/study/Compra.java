package study;

public class Compra {
    private int id;
    private double valorDaCompra;
    private String nomeDoCliente;
    private String nomeDoProduto;
    private int baixaNoEstoque;
    public Compra() {

    }

    public Compra(int id, double valorDaCompra, String nomeDoCliente, String nomeDoProduto,int baixaNoEstoque) {
        this.id = id;
        this.valorDaCompra = valorDaCompra;
        this.nomeDoCliente = nomeDoCliente;
        this.nomeDoProduto = nomeDoProduto;
        this.baixaNoEstoque = baixaNoEstoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public void setBaixaNoEstoque(int baixaNoEstoque) {this.baixaNoEstoque = baixaNoEstoque;}

    public int getBaixaNoEstoque() {return baixaNoEstoque;}

    public boolean verificarSaldo(double saldoDoCliente, double valorDoProduto) {
        if (saldoDoCliente >= valorDoProduto) {
            return true;
        }
        return false;
    }

    public boolean verificarEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 1) {
            return true;
        }
        return false;
    }
}




