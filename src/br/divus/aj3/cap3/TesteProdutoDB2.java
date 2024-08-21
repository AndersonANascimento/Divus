package br.divus.aj3.cap3;

import java.util.List;

public class TesteProdutoDB2 {
    public static void main(String[] args) throws GlobalcodeException {
        ProdutoDB db = new ProdutoDB();
        if (args.length == 1) {
            int id = Integer.parseInt(args[0]);
            Produto produto = db.getProduto(id);
            if (produto != null)
                System.out.println("Produto encontrado..." + produto);
            else
                System.out.println("Produto NÃO encontrado!");
        } else {
            List<Produto> produtos = db.getAllProdutos();
            System.out.printf("Foram encontrados %d produtos!\n", produtos.size());
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println(produtos.get(i));
            }
        }
    }
}
