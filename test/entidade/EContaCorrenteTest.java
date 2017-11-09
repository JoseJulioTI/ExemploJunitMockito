
package entidade;

import org.junit.Test;
import static org.junit.Assert.*;


public class EContaCorrenteTest {
    
    public EContaCorrenteTest() { }

//    @Test
//    public void testGetSaldo() {
//        System.out.println("getSaldo");
//        EContaCorrente instance = new EContaCorrente();
//        Double expResult = null;
//        Double result = instance.getSaldo();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    @Test
    public void casoDeTeste01_CriacaoContaIgual_0() {
        System.out.println(" Teste - criar conta com saldo igual a 0");
         
        EContaCorrente instance = new EContaCorrente();
        Double resultadoEsperado = new Double(0);
        Double result = instance.getSaldo();
        assertEquals(resultadoEsperado, result);
        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void casoDeTeste02_CriacaoContaSaldoNulo() {
        System.out.println(" Teste - criar conta com saldo igual a null");
         
        EContaCorrente instance = new EContaCorrente();
        instance.setSaldo(null);
        fail("Era esperado um execeção. Teste falhou !");
    }
    
    @Test
    public void casoDeTeste03_CriacaoContaSaldo10() {
        System.out.println(" Teste - criar conta com saldo 10");
         
        EContaCorrente instance = new EContaCorrente(10.0);
        Double resultadoEsperado = 10.0;
        Double resultado = instance.getSaldo();
        assertEquals(resultadoEsperado, resultado);
    }
    
    @Test
    public void casoDeTeste03_CriacaoContaSaldo15() {
        System.out.println(" Teste - criar conta com saldo 15");
         
        EContaCorrente instance = new EContaCorrente(15.0);
        Double resultadoEsperado = 15.0;
        Double resultado = instance.getSaldo();
        assertEquals(resultadoEsperado, resultado);
    }
    
    
    
}
