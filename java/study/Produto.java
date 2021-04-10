package study;

public class Produto {

    int id;
    String nome;
    double valor;
    int quantidadeEstoque;

   public Produto(){

   }
    public Produto(int id, String nome, double valor,int quantidadeEstoque) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeEstoque(){return quantidadeEstoque;}

    public void setQuantidadeEstoque(int quantidadeEstoque){this.quantidadeEstoque = quantidadeEstoque;}




}
