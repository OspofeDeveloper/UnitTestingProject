package Controlador;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LectorFicherosTest {

  //Test getters
  @Test
  void TestSetandGetFile(){
    LectorFicheros lector = new LectorFicheros("1");
    File filePrueba = new File("Prueba Setter");
    lector.setFile(filePrueba);
    assertEquals(filePrueba,lector.getFile());
    File filePrueba1 = new File("");
    lector.setFile(filePrueba1);
    assertEquals(filePrueba1,lector.getFile());
  }

  @Test
  void TestSetandGetNombreFile(){
    LectorFicheros lector = new LectorFicheros("1");
    lector.setNombreFile("Prueba Getter");
    assertEquals("Prueba Getter", lector.getNombreFile());
    lector.setNombreFile("");
    assertEquals("", lector.getNombreFile());
  }

  //Valores limite y particiones equivalente (dificultad = -10,0,1,2,3,4,10)
  //Fichero incorrecto
  @Test
  void TestConstructor() {
    LectorFicheros cargarPalabrasMenos10 = new LectorFicheros("-10");
    LectorFicheros cargarPalabras0 = new LectorFicheros("0");

    LectorFicheros cargarPalabras1 = new LectorFicheros("1");
    LectorFicheros cargarPalabras2 = new LectorFicheros("2");
    LectorFicheros cargarPalabras3 = new LectorFicheros("3");

    LectorFicheros cargarPalabras4 = new LectorFicheros("4");
    LectorFicheros cargarPalabras10 = new LectorFicheros("10");

    String pathFichero1 = "Project_Ahorcado/src/Modelo/facil.txt";
    String pathFichero2 = "Project_Ahorcado/src/Modelo/normal.txt";
    String pathFichero3 = "Project_Ahorcado/src/Modelo/dificil.txt";

    assertEquals(pathFichero1, cargarPalabras1.getNombreFile());
    assertEquals(pathFichero2, cargarPalabras2.getNombreFile());
    assertEquals(pathFichero3, cargarPalabras3.getNombreFile());

    assertEquals(null, cargarPalabrasMenos10.getNombreFile());
    assertEquals(null, cargarPalabras0.getNombreFile());
    assertEquals(null, cargarPalabras4.getNombreFile());
    assertEquals(null, cargarPalabras10.getNombreFile());
  }

  //Decision Coverage
  @Test
  void TestLlegirPalabras(){
    LectorFicheros cargarPalabras = new LectorFicheros("1");

    String[] listaEsperada1 = {"polo", "golf", "judo", "vela", "remo", "mma", "surf", "tiro", "luge", "bmx"};
    ArrayList<String> listaActual1 = cargarPalabras.LlegirParaules("1");
    assertArrayEquals(listaEsperada1, listaActual1.toArray(new String[10]));

    String[] listaEsperada2 = {"buho", "oso", "foca", "lobo", "pato", "orca", "sapo", "topo", "toro", "vaca"};
    ArrayList<String> listaActual2 = cargarPalabras.LlegirParaules("2");
    assertArrayEquals(listaEsperada2, listaActual2.toArray(new String[10]));

    String[] listaEsperada3 = {"iran", "irak", "laos", "cuba", "peru", "chad", "fiyi", "mali", "togo", "oman"};
    ArrayList<String> listaActual3 = cargarPalabras.LlegirParaules("3");
    assertArrayEquals(listaEsperada2, listaActual2.toArray(new String[10]));

    String[] listaEsperada4 = {"nike", "puma", "jeep", "kia", "audi", "ford", "seat", "boss", "apple", "zara"};
    ArrayList<String> listaActual4 = cargarPalabras.LlegirParaules("4");
    assertArrayEquals(listaEsperada2, listaActual2.toArray(new String[10]));

    String[] listaEsperada5 = {"sopa", "mole", "taco", "atun", "piña", "maiz", "uva", "yuka", "pera", "pan"};
    ArrayList<String> listaActual5 = cargarPalabras.LlegirParaules("5");
    assertArrayEquals(listaEsperada2, listaActual2.toArray(new String[10]));

    //Pruebas valores limites parametros de entrada
    String[] listaEsperada0 = {};
    ArrayList<String> listaActual0 = cargarPalabras.LlegirParaules("0");
    assertArrayEquals(listaEsperada0, listaActual0.toArray(new String[0]));

    String[] listaEsperada10Neg = {};
    ArrayList<String> listaActual10Neg = cargarPalabras.LlegirParaules("-10");
    assertArrayEquals(listaEsperada10Neg, listaActual10Neg.toArray(new String[0]));

    String[] listaEsperada10 = {};
    ArrayList<String> listaActual10 = cargarPalabras.LlegirParaules("10");
    assertArrayEquals(listaEsperada10, listaActual10.toArray(new String[0]));
  }

  @Test
  void TestFicheroIncorrecto() {
    try {
      LectorFicheros cargarPalabras = new LectorFicheros("1");
      File incorrecto = new File("src/Model/incorrecto.txt");
      cargarPalabras.setFile(incorrecto);

      ArrayList<String> listaActual1 = cargarPalabras.LlegirParaules("1");
      fail("Tendria que salir una Excepción por fichero incorrecto");
    } catch (IllegalArgumentException e) {
      System.out.println("Fichero incorrecto");
    }
  }
}