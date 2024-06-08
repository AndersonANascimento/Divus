package com.aj2.aj2lab10_01;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Esta classe e responsavel pelo teste das Herancas envolvidas
 * entre as classes Agencia e AgenciaPlus
 * 
 * 
 */
public class TestaAgenciaPlus {

    public static void main(String[] args) {
        Banco banco = new Banco("Globalcode Bank", 1000);
        AgenciaPlus agPlus = new AgenciaPlus("003", banco, 200d, 900d);
        AgenciaPlus agPrime = new AgenciaPlus("3715", banco, 100d, 450d);
        Cliente cliente1 = new Cliente("Anderson Nascimento", "456.125.362-91");
        Cliente cliente5 = new Cliente("Cliente 5", "4988223");
        Cliente cliente6 = new Cliente("Cliente 6", "8100700");

        ContaEspecial contaA = new ContaEspecial(300d, "21717", cliente1, agPrime, 200d);
        ContaEspecial contaG = new ContaEspecial(1300d, "6171", cliente5, agPlus, 400d);
        ContaEspecial contaH = new ContaEspecial(600d, "7251", cliente5, agPlus, 450d);
        ContaEspecial contaI = new ContaEspecial(750d, "3220", cliente6, agPlus, 2200d);

        contaA.saque(500d);
        contaG.saque(240d);
        contaH.saque(300d);
        contaI.saque(1300d);
        
        contaG.imprimeDados();
        contaH.imprimeDados();
        contaI.imprimeDados();
        contaA.imprimeDados();
        
        ContaEspecial[] contas = {contaA, contaG, contaH, contaI};
        
        agPlus.ajustarLimites(contas);
        agPrime.ajustarLimites(contas);
        
        // limites ajustados: contaG = 500.00 / contaH = 450.00 / contaI = 1650.00 
    }
}
