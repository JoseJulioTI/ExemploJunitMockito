package negocio;

import entidade.EContaCorrente;
import org.junit.Test;
import static org.junit.Assert.*;

public class NContaCorrenteTest {
    
    public NContaCorrenteTest() { }


    @Test
    public void casoDeTeste05_CriacaoContaSaldo10_Deposita30() {
        System.out.println(" Teste - criar conta com saldo 10 e depositar 30");
         
        NContaCorrente instance = new NContaCorrente();
        instance.conta = new EContaCorrente(10.0);
        
        instance.depositar(30.0);
        
        Double resultadoEsperado = 40.0;
        Double resultado = instance.conta.getSaldo();
        assertEquals(resultadoEsperado, resultado);
    }
    
    @Test
    public void casoDeTeste06_CriacaoContaSaldo0_Deposita10() {
        System.out.println(" Teste - criar conta com saldo 0 e depositar 10");
         
        NContaCorrente instance = new NContaCorrente();
        instance.conta = new EContaCorrente(0.0);
        
        instance.depositar(10.0);
        
        Double resultadoEsperado = 10.0;
        Double resultado = instance.conta.getSaldo();
        assertEquals(resultadoEsperado, resultado);
    }
    
}
