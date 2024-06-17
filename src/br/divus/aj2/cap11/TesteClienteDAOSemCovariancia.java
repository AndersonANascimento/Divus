package br.divus.aj2.cap11;

/**
 * TesteClienteDAOSemCovariancia - AJ2 - Código 11.17 - Página 255
 */
public class TesteClienteDAOSemCovariancia {
    public static void main(String[] args) {
        ClienteDAOSemCovariancia dao = new ClienteDAOSemCovariancia();
        Cliente c = (Cliente) dao.getByPrimaryKey(Integer.parseInt("20"));
        System.out.println(c);
    }
}
