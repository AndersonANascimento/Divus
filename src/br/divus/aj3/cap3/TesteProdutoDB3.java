package br.divus.aj3.cap3;

import java.util.List;

public class TesteProdutoDB3 {
    public static void main(String[] args) throws GlobalcodeException {
        ProdutoDB db = new ProdutoDB();
        if (args.length == 1) {
            int id = Integer.parseInt(args[0]);
            int qtdDelete = db.delete(id);
            System.out.println("" + qtdDelete + " produto(s) deletado(s)!");
        } else {
            List<Produto> produtos = db.getAllProdutos();
            System.out.printf("Foram encontrados %d produtos!\n", produtos.size());
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println(produtos.get(i));
            }
        }
    }
}
