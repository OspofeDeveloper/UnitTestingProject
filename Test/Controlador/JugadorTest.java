package Controlador;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JugadorTest {

  //Test getters
  @Test
  void TestGetVidas() {
    Jugador playerTest = new Jugador();
    playerTest.setVidas(5);
    assertTrue(playerTest.getVidas() == 5);
  }

  @Test
  void TestSetVidas() {
    Jugador playerTest = new Jugador();
    int vidas = 5;
    playerTest.setVidas(vidas);
    assertTrue(playerTest.getVidas() == 5);
  }

  //Pairwise testing
  //Decision y Condition Coverage
  @Test
  void testUpdateVidas() {
    Jugador playerTest = new Jugador();
    int vidas;

    vidas = playerTest.updateVidas("1", true, false);
    assertTrue(playerTest.getVidas() == 7);

    vidas = playerTest.updateVidas("1", true, true);
    assertEquals(9, playerTest.getVidas());

    playerTest.setVidas(7);
    vidas = playerTest.updateVidas("1", false, true);
    assertTrue(vidas == -1);

    playerTest.setVidas(7);
    vidas = playerTest.updateVidas("2", true, true);
    assertTrue(playerTest.getVidas() == 8);

    playerTest.setVidas(7);
    vidas = playerTest.updateVidas("2", false, false);
    assertTrue(playerTest.getVidas() == 6);

    playerTest.setVidas(7);
    vidas = playerTest.updateVidas("3", false, true);
    assertTrue(vidas == -1);

    playerTest.setVidas(7);
    vidas = playerTest.updateVidas("3", true, false);
    assertTrue(playerTest.getVidas() == 7);

    vidas = playerTest.updateVidas("0", true, true);
    assertTrue(vidas == -1);

    vidas = playerTest.updateVidas("4", true, true);
    assertTrue(vidas == -1);

    vidas = playerTest.updateVidas("-10", true, true);
    assertTrue(vidas == -1);

    vidas = playerTest.updateVidas("10", true, true);
    assertTrue(vidas == -1);

    playerTest.setVidas(1);
    vidas = playerTest.updateVidas("1", false, false);
    assertTrue(playerTest.getVidas() == 0);
  }
}