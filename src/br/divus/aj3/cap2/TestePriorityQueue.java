package br.divus.aj3.cap2;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestePriorityQueue {
    public static void main(String[] args) {
        ComparadorClientesQtdPedidos comp = new ComparadorClientesQtdPedidos();
        Queue<Cliente> clientes = new PriorityQueue<>(11, comp);
        clientes.add(new Cliente(1, "Cliente 01", 205));
        clientes.add(new Cliente(2, "Globalcode", 43));
        clientes.add(new Cliente(3, "Cliente 02", 89));
        clientes.add(new Cliente(1, "Cliente 03", 20));
        while (!clientes.isEmpty()) {
            System.out.println("Processando cliente:");
            System.out.println(clientes.poll());
        }
    }
}
