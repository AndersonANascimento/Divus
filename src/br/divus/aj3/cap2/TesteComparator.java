package br.divus.aj3.cap2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteComparator {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente(1, "Cliente 01", 205);
        Cliente cl2 = new Cliente(2, "Global Code", 43);
        Cliente cl3 = new Cliente(3, "Cliente 02", 89);
        Cliente cl4 = new Cliente(4, "Cliente 03", 20);

        ComparadorClientesQtdPedidos comp = new ComparadorClientesQtdPedidos();
        Set<Cliente> ts = new TreeSet<Cliente>(comp);

        ts.add(cl1);
        ts.add(cl2);
        ts.add(cl3);
        ts.add(cl4);

        Iterator<Cliente> it = ts.iterator();
        System.out.println("\nUtilizando ComparadorClientesQtdPedidos");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        ComparadorClientesId compId = new ComparadorClientesId();
        Set<Cliente> ts2 = new TreeSet<Cliente>(compId);
        ts2.addAll(ts);

        Iterator<Cliente> it2 = ts2.iterator();
        System.out.println("\nUtilizando ComparadorClientesId");
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
