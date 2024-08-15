package br.divus.aj3.cap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TesteOrdenacao {
    public static void main(String[] args) {
        Integer[] elementos = {1, 5, 7, 4, 9, 6, 10, 8, 2, 3};
        Arrays.sort(elementos);
        System.out.println("Array ordenado:");
        System.out.println(Arrays.toString(elementos));

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(1, "Cliente 01", 205));
        clientes.add(new Cliente(3, "Cliente 02", 89));
        clientes.add(new Cliente(1, "Cliente 03", 20));
        clientes.add(new Cliente(2, "Global Code", 43));

        ComparadorClientesId compId = new ComparadorClientesId();
        Collections.sort(clientes, compId);
        System.out.println("Lista ordenada");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i));
        }
    }
}
