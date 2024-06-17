package br.divus.aj2.cap11;

/**
 * TesteClienteDAO - AJ2 - Código 11.19 - Página 255
 */
public class TesteClienteDAO {
    public static void main(String[] args) {
        ClienteDAO dao = new ClienteDAO();
        Cliente c = dao.getByPrimaryKey(Double.parseDouble("20"));
        System.out.println(c);
    }
}
