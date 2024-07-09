package br.divus.aj2.cap13;


public class Banco {
    public Conta abrirConta(TipoConta tipo) {
        Conta conta = null;
        if (tipo == TipoConta.CONTA_CORRENTE) {
            conta = new ContaCorrente();
        }
        assert conta != null : "a conta não foi criada!";
        return conta;
    }
}
