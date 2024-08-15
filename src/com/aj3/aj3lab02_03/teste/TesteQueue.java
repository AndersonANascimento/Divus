/*
* Globalcode - "The Developers Company"
* 
* Academia do Java
* 
*/
package com.aj3.aj3lab02_03.teste;
/*
 * Dicas para realizar este laborat�rio:
 * 
 * metodo poll() - recupera e remove, retorna null se fila  vazia
 * metodo remove() - recupera e remove, NoSuchElementException se fila vazia
 *
 * metodo peek() - recupera e nao remove, retorna null se fila vazia
 * metodo element() - recupera e nao remove, NoSuchElementException se fila vazia
 * 
 */

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

import com.aj3.aj3lab02_03.beans.Cliente;

public class TesteQueue {

	public static void main(String args[]) {
		Cliente c4 = new Cliente("Cliente1", "1111", "cpf1", 4);
		Cliente c3 = new Cliente("Cliente2", "2222", "cpf2", 3);
		Cliente c1 = new Cliente("Cliente3", "3333", "cpf3", 1);
		Cliente c2 = new Cliente("Cliente3", "3333", "cpf3", 2);
		// a. Crie um objeto do tipo PriorityQueue.
		Queue<Cliente> clientes = new PriorityQueue<>();
		
		// b. Insira os clientes usando metodo offer(Object)
		clientes.offer(c1);
		clientes.offer(c2);
		clientes.offer(c3);
		clientes.offer(c4);
		
		imprimirQueue(clientes);
		
		// c. Recupere e remova o primeiro elemento (veja dicas acima)
		Cliente clienteRemovido = clientes.poll();
		System.out.println("Cliente Removido = " + clienteRemovido);

		// d. Recupere, sem remover, o primeiro elemento (veja dicas acima)
		Cliente clienteRecuperado = clientes.peek();
		System.out.println("Cliente recuperado = " + clienteRecuperado);
		
		imprimirQueue(clientes);
	}

	public static void imprimirQueue(Queue<Cliente> clientes) {
		Iterator<Cliente> ponteiroClientes = clientes.iterator();
		while (ponteiroClientes.hasNext()) {
			System.out.println(ponteiroClientes.next());
		}
		System.out.println();
	}

}