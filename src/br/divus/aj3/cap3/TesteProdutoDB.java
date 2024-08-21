package br.divus.aj3.cap3;

public class TesteProdutoDB {
    public static void main(String[] args) throws GlobalcodeException {
        ProdutoDB db = new ProdutoDB();
        db.createTable();
        Produto produto = null;
        int id = 0;
        String nome = null;
        int preco = 0;

        if (args.length == 2) {
            System.out.println("O produto será inserido no BD!");
            nome = args[0];
            preco = Integer.parseInt(args[1]);
            produto = new Produto(nome, preco);
        } else if (args.length == 3) {
            System.out.println("O produto será atualizado no BD!");
            nome = args[0];
            preco = Integer.parseInt(args[1]);
            id = Integer.parseInt(args[2]);
            produto = new Produto(id, nome, preco);
        } else {
            System.out.println("Sintaxe para utilização deste programa:");
            System.out.println("Para inserir um novo produto: <nome do produto> <preço do produto>");
            System.out.println("Para atualizar um produto: <nome do produto> <preço do produto> <id>");
            return;
        }
        db.save(produto);
    }
}
