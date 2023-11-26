package Controlador;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorTest {
  private Validador validador;

  @BeforeEach
  void setUp()
  {
    validador = new Validador();
  }

  //Valores limite y statement coverage
  //Decision Coverage
  @Test
  void TestValidarLetra(){
    testValidador(validador.ValidarLletra("a"),true);
    testValidador(validador.ValidarLletra("A"),true);
    testValidador(validador.ValidarLletra("*"),false);
    testValidador(validador.ValidarLletra("1"),false);
    testValidador(validador.ValidarLletra("abc"),false);
    testValidador(validador.ValidarLletra(""), false);
  }

  @Test
  void TestExitLetra() {
    try{
      validador.ValidarLletra("0");
      fail("Tendria que salir una Excepción por valor=0");
    }catch(IllegalArgumentException e){
      System.out.println("Has salido de la partida");
    }
  }

  //Valores limite y statement coverage
  //Decision Coverage
  @Test
  void TestValidarCategoria() {
    testValidador(validador.ValidarCategoria("-10"),false);
    testValidador(validador.ValidarCategoria("1"),true);
    testValidador(validador.ValidarCategoria("2"),true);
    testValidador(validador.ValidarCategoria("3"),true);
    testValidador(validador.ValidarCategoria("4"),true);
    testValidador(validador.ValidarCategoria("5"),true);
    testValidador(validador.ValidarCategoria("6"),false);
    testValidador(validador.ValidarCategoria("10"),false);
  }

  @Test
  void TestExitCategoria() {
    try{
      validador.ValidarCategoria("0");
      fail("Tendria que salir una Excepción por valor=0");
    }catch(IllegalArgumentException e){
      System.out.println("Has salido de la partida");
    }
  }

  //Valores limite y statement coverage
  //Decision Coverage
  @Test
  void TestValidarDificultad() {
    testValidador(validador.ValidarDificultad("-10") , false);
    testValidador(validador.ValidarDificultad("1"), true);
    testValidador(validador.ValidarDificultad("2"), true);
    testValidador(validador.ValidarDificultad("3"), true);
    testValidador(validador.ValidarDificultad("4"), false);
    testValidador(validador.ValidarDificultad("10"), false);
  }

  @Test
  void TestExitDificultad() {
    try{
      validador.ValidarDificultad("0");
      fail("Tendria que salir una Excepción por valor=0");
    }catch(IllegalArgumentException e){
      System.out.println("Has salido de la partida");
    }
  }

  private void testValidador(boolean valida, boolean decision) {
    boolean lletraCorrecta = valida;
    if (decision)
      assertTrue(lletraCorrecta);
    else
      assertFalse(lletraCorrecta);
  }
}