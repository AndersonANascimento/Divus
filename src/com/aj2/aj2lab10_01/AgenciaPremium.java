package com.aj2.aj2lab10_01;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 *
 * 
 * 1) Modifique esta classe para que herde de Agencia
 * 
 * 2) Acrescente um construtor valido. 
 * 
 * 3) Sobrescreva o metodo abstrato ajustarLimiteIndividual
 *    de acordo com as seguintes regras de negocio:
 *    
 *    a) se o saldo estiver negativo, abaixo de -5000.00 o limite deve ser ajustado para 1000.00
 *    b) se o saldo estiver positivo, abaixo de +5000.00 o limite deve ser ajustado para 30% do saldo  
 *    c) se o saldo estiver positivo, acima de  +5000.00 o limite deve ser ajustado para 50% do saldo
 * 
 */
public class AgenciaPremium extends Agencia {

    public AgenciaPremium(String num, Banco bc) {
        super(num, bc);
    }

    @Override
    protected void ajustarLimiteIndividual(ContaEspecial contaEspecial) {
        double saldo = contaEspecial.getSaldo();
        if (saldo < -5000d) {
            contaEspecial.setLimite(1000d);
        } else if (saldo < 5000d) {
            contaEspecial.setLimite(saldo * 0.3);
        } else if (saldo >= 5000d) {
            contaEspecial.setLimite(saldo * 0.5);
        }
    }
}
