package negocio;

import entidade.EContaCorrente;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import persistencia.PHistoricoMovimentacao;

public class NHistoricoMovimentacaoTest {
    
    public NHistoricoMovimentacaoTest() { }

    @Test
    public void testRegistrar() {
        System.out.println("teste dp registro de movimentações na conta");
        
        EContaCorrente conta = new EContaCorrente();
        
        PHistoricoMovimentacao persistencia = Mockito.mock(PHistoricoMovimentacao.class);
        NHistoricoMovimentacao instance = new NHistoricoMovimentacao(persistencia);
        
        when(persistencia.registrar(conta)).thenReturn(true);
        
        boolean resultadoEsperado = true;
        boolean resultado = instance.registrar(conta);
        
        assertEquals(resultadoEsperado, resultado);
    }
    
}
