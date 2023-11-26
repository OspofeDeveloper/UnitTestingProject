package Controlador;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PalabraTest {
  //Valores limite y statement coverage
  @Test
  void TestConstructorYGetter() {
    ArrayList<String> listaPalabras = new ArrayList<String>(Arrays.asList("uno","dos","tres"));
    GeneradorNumeroRandom generadorNumeroRandom = new GeneradorNumeroRandom();
    Palabra palabra = new Palabra(listaPalabras,generadorNumeroRandom);

    assertEquals(listaPalabras, palabra.getListaPalabras());
    assertEquals(generadorNumeroRandom, palabra.getGenerador());
  }

  //Valores limite y statement coverage
  @Test
  void TestGetMiPalabraYPalabraRonda() {
    MockGeneradorNumeroRandom MocknumeroRandom = new MockGeneradorNumeroRandom();
    ArrayList<String> listaPalabras = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f","g","h","i","j"));
    Palabra palabra = new Palabra(listaPalabras, MocknumeroRandom);

    assertEquals("a",palabra.palabraRonda());
    assertEquals("a",palabra.getMiPalabra());

    assertEquals("b",palabra.palabraRonda());
    assertEquals("b",palabra.getMiPalabra());
    for(int i = 0; i<3; i++){
      palabra.palabraRonda();
    }
    assertEquals("f",palabra.palabraRonda());
    assertEquals("f",palabra.getMiPalabra());

    for(int i = 0; i<2; i++){
      palabra.palabraRonda();
    }
    assertEquals("i",palabra.palabraRonda());
    assertEquals("i",palabra.getMiPalabra());

    assertEquals("j",palabra.palabraRonda());
    assertEquals("j",palabra.getMiPalabra());

    assertEquals("Numero Aleatori incorrecto",palabra.palabraRonda());
    assertEquals("Numero Aleatori incorrecto",palabra.getMiPalabra());

    assertEquals(11, MocknumeroRandom.getContador());
  }

  //Path Coverage
  @Test
  void TestGetLiniasyGetMiLinia(){
    ArrayList<String> palabras = new ArrayList<>(Arrays.asList("polo","golf","judo","vela","remo","mma","surf","tiro","luge","bmx"));
    MockGeneradorNumeroRandom MocknumeroRandom = new MockGeneradorNumeroRandom();
    Palabra palabraLinias = new Palabra(palabras, MocknumeroRandom);

    palabraLinias.setMilinia(palabraLinias.palabraRonda());

    //Testear parametros de entrada
    String alphabeticActual = palabraLinias.getLinias("+");
    assertEquals("____", palabraLinias.getMiLinias());
    assertEquals("____", alphabeticActual);


    String lengthActual = palabraLinias.getLinias("ja");
    assertEquals("____", palabraLinias.getMiLinias());
    assertEquals("____", lengthActual);


    String alphabeticActual1 = palabraLinias.getLinias("2");
    assertEquals("____", palabraLinias.getMiLinias());
    assertEquals("____", alphabeticActual1);

    //Testear internamente la funcion

    String foundActual = palabraLinias.getLinias("l");
    assertEquals("__l_", palabraLinias.getMiLinias());
    assertEquals("__l_", foundActual);

    String letraNoEncontrada = palabraLinias.getLinias("e");
    assertEquals("__l_", palabraLinias.getMiLinias());
    assertEquals("__l_", letraNoEncontrada);

    palabraLinias.getLinias("p");
    String palabraCompleta = palabraLinias.getLinias("o");
    assertEquals("polo", palabraLinias.getMiLinias());
    assertEquals("polo", palabraCompleta);

    //Statement Coverage Asegurado
    //Path, Decision and Condition Coverage Asegurado

  }
}