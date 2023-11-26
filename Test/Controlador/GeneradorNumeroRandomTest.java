package Controlador;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class GeneradorNumeroRandomTest {
  private GeneradorNumeroRandom generador;

  @BeforeEach
  void SetUp() {
    generador = new GeneradorNumeroRandom();
  }

  //Test de getter
  @Test
  void TestGetterContador(){
    GeneradorNumeroRandom generador = new GeneradorNumeroRandom();
    int contador = generador.getContador();
    assertEquals(0, contador);
  }

  //Tests valores limite y particiones secuenciales (size = -10,0,1,2,5,9,10,11,20)
  //Decision coverage en la clase GeneradorNumeroRandom
  @Test
  void GenerarNumeroSizeNegativa(){
    int numero = generador.getNumeroRandom(-10);
    assertEquals(-1, numero);
  }

  @Test
  void GenerarNumeroSize0yLimiteInferior(){
    int numero = generador.getNumeroRandom(0);
    assertEquals(-1, numero);
  }
  @Test
  void GeGenerarNumeroSize1(){
    int size = 1;
    ArrayList<Integer> numRand = new ArrayList<>();
    ArrayList<Integer> valoresCorrectos = new ArrayList<>(Arrays.asList(0));

    for(int i = 0; i < size; i++){
      numRand.add(generador.getNumeroRandom(size));
    }
    Collections.sort(numRand);
    assertEquals(valoresCorrectos, numRand);
  }

  @Test
  void GeGenerarNumeroSize2(){
    int size = 2;
    ArrayList<Integer> numRand = new ArrayList<>();
    ArrayList<Integer> valoresCorrectos = new ArrayList<>(Arrays.asList(0,1));

    for(int i = 0; i < size; i++){
      numRand.add(generador.getNumeroRandom(size));
    }
    Collections.sort(numRand);
    assertEquals(valoresCorrectos, numRand);
  }

  @Test
  void GenerarNumeroSize5() {
    int size = 5;
    ArrayList<Integer> numRand = new ArrayList<>();
    ArrayList<Integer> valoresCorrectos = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));

    for(int i = 0; i < size; i++){
      numRand.add(generador.getNumeroRandom(size));
    }
    Collections.sort(numRand);
    assertEquals(valoresCorrectos, numRand);

  }

  @Test
  void GenerarNumeroSize9() {
    int size = 9;
    ArrayList<Integer> numRand = new ArrayList<>();
    ArrayList<Integer> valoresCorrectos = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8));

    for(int i = 0; i < size; i++){
      numRand.add(generador.getNumeroRandom(size));
    }
    Collections.sort(numRand);
    assertEquals(valoresCorrectos, numRand);

  }

  @Test
  void GenerarNumeroSize10() {
    int size = 10;
    ArrayList<Integer> numRand = new ArrayList<>();
    ArrayList<Integer> valoresCorrectos = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

    for(int i = 0; i < size; i++){
      numRand.add(generador.getNumeroRandom(size));
    }
    Collections.sort(numRand);
    assertEquals(valoresCorrectos, numRand);
  }

  @Test
  void GenerarNumeroSize11LimiteSuperior() {
    int numero = generador.getNumeroRandom(11);
    assertEquals(-1, numero);
  }

  @Test
  void GenerarNumeroSize20ValorExterno() {
    int numero = generador.getNumeroRandom(20);
    assertEquals(-1, numero);
  }

}


