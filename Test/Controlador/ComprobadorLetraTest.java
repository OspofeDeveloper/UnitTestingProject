package Controlador;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComprobadorLetraTest {
  private ComprobadorLetra buscadorLletra;

  @BeforeEach
  void setUp() {
    buscadorLletra = new ComprobadorLetra();
  }

  //Valores límite (minuscula true, minuscula false, mayuscula, numero, simbolo, mas de 1 caracter)
  //Decision y Condition coverage
  @Test
  void TestBuscarLletra() {
    testComprobador(buscadorLletra.buscarLletra("a", "pala"), true);
    testComprobador(buscadorLletra.buscarLletra("a", "surf"), false);
    testComprobador(buscadorLletra.buscarLletra("A", "pala"), true);
    testComprobador(buscadorLletra.buscarLletra("1", "pala"), false);
    testComprobador(buscadorLletra.buscarLletra("*", "hola"), false);
    testComprobador(buscadorLletra.buscarLletra("ab", "pala"), false);
  }

  //Test loop simple (iteraciones = 0,1,2,m,n-1,n)
  @Test
  void TestLoopSimple(){
    testComprobador(buscadorLletra.buscarLletra("a", ""), false);
    testComprobador(buscadorLletra.buscarLletra("a", "a"), false);
    testComprobador(buscadorLletra.buscarLletra("a", "ba"), true);
    testComprobador(buscadorLletra.buscarLletra("a", "bbbbbba"), true);
    testComprobador(buscadorLletra.buscarLletra("a", "bbbbbbbbbbba"), true);
    testComprobador(buscadorLletra.buscarLletra("a", "bbbbbbbbbbbba"), true);
  }
  private void testComprobador(boolean valida, boolean decision) {
    boolean lletraCorrecta = valida;
    if(decision)
      assertTrue(lletraCorrecta);
    else
      assertFalse(lletraCorrecta);
  }
}