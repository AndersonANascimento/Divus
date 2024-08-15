package br.divus.aj3.cap2;

import java.util.Comparator;

public class ComparadorClientesQtdPedidos implements Comparator<Cliente> {

    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.getQtdPedidos() - o2.getQtdPedidos();
    }
}
