
package negocio;

import entidade.EContaCorrente;


public class NContaCorrente {
    EContaCorrente conta;

    public NContaCorrente() {
        conta = new EContaCorrente();
    }
    
    public void depositar(Double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
    }
}
