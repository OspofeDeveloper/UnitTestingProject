package Vista;

import Controlador.MockGeneradorNumeroRandom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainVistaTest {
  //Uso de mocks
  MockGeneradorNumeroRandom generador;

  @BeforeEach
  void setUp(){
    generador = new MockGeneradorNumeroRandom();
  }

  @Test
  void TestSalirJuegoDificultad() {
    try {
      MockVistaSalirEnDificultad mockVista = new MockVistaSalirEnDificultad();
      MainVista mainClass = new MainVista();

      mainClass.main(mockVista, generador);
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  void TestSalirJuegoCategoria() {
    try {
      MockVistaSalirEnCategoria mockVista = new MockVistaSalirEnCategoria();
      MainVista mainClass = new MainVista();

      mainClass.main(mockVista, generador);
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  void TestSalirJuegoLetra() {
    try {
      MockVistaSalirEnLetra mockVista = new MockVistaSalirEnLetra();
      MainVista mainClass = new MainVista();

      mainClass.main(mockVista, generador);
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  void TestIntroducirCaracteresIncorrectos() {
    try {
      MockVistaIntroducirValoresIncorrectos mockVista = new MockVistaIntroducirValoresIncorrectos();
      MainVista mainClass = new MainVista();

      mainClass.main(mockVista, generador);
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  void TestRepetirLetra() {
    try {
      MockVistaRepetirLetra mockVista = new MockVistaRepetirLetra();
      MainVista mainClass = new MainVista();

      mainClass.main(mockVista, generador);
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  void TestAcabarSinVidas() {
    try {
      MockVistaAcabasLasVidas mockVista = new MockVistaAcabasLasVidas();
      MainVista mainClass = new MainVista();

      mainClass.main(mockVista, generador);
    }catch (IllegalArgumentException e){

    }
  }

  @Test
  void TestGanarPartida() {
    try {
      MockGuanyarPartida mockVista = new MockGuanyarPartida();
      MainVista mainClass = new MainVista();

      mainClass.main(mockVista, generador);
    }catch (IllegalArgumentException e){

    }
  }
}