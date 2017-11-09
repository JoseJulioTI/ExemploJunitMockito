package negocio;

import entidade.EContaCorrente;
import persistencia.PHistoricoMovimentacao;

public class NHistoricoMovimentacao {
    PHistoricoMovimentacao persistencia;

    public NHistoricoMovimentacao(PHistoricoMovimentacao persistencia) {
        this.persistencia = persistencia;
    }
    
    public boolean registrar(EContaCorrente conta) {
        return persistencia.registrar(conta);
    }
    
}
