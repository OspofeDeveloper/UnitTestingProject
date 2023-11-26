package Controlador;

import java.util.ArrayList;

public class MockGeneradorNumeroRandom implements GeneradorNumeroRandomInterface{
  private ArrayList<Integer> indicesUsados = new ArrayList<>();
  private int contador = 0;

  //Getter
  public int getContador() {return contador;}

  //Devolvemos por cada ejecucion las palabras en orden para hacer test
  public int getNumeroRandom(int size){
    switch (contador){
      case 0: contador++; return 0;
      case 1: contador++; return 1;
      case 2: contador++; return 2;
      case 3: contador++; return 3;
      case 4: contador++; return 4;
      case 5: contador++; return 5;
      case 6: contador++; return 6;
      case 7: contador++; return 7;
      case 8: contador++; return 8;
      case 9: contador++; return 9;
      default: contador++; return 10;
    }
  }
}