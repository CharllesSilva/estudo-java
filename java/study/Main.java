package study;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto(1, "Tv 69'", 2999.99, 1);
        System.out.println("Nome do produto: " + produto1.getNome());

        System.out.println("Preço do produto: " + produto1.getValor());

        Cliente cliente1 = new Cliente(1, "luca Cabeção", 1000.00);
        System.out.println("Nome do cliente: " + cliente1.getNome());

        System.out.println("Saldo do cliente: " + cliente1.saldo);


        Compra compra1 = new Compra();

        if (compra1.verificarSaldo(cliente1.getSaldo(), produto1.getValor())) {

            System.out.println("saldo suficiente para compra!");

        } else {
            System.out.println("saldo insuficiente para compra!");
            return ;
        }

        if (compra1.verificarEstoque(produto1.getQuantidadeEstoque() )){

            System.out.println("Produto em estoque!");

        }else {
            System.out.println("Produto em falta no estoque!");
        }
        System.out.println("deseja confirmar a compra? sim/nao ");
        Scanner scan = new Scanner(System.in);
        String usuario = scan.nextLine();

        if (usuario == "sim"){
            System.out.println("Compra confirmada");
        }
        double saldoAtual = cliente1.getSaldo() - produto1.getValor();
        System.out.printf("Saldo atual do cliente: %.2f\n",saldoAtual);

        int estoqueAtual = produto1.getQuantidadeEstoque() - 1;
        System.out.println("Quantidade do produto em estoque: "+estoqueAtual);

    }
}

