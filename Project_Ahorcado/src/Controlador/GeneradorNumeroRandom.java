package Controlador;

import java.util.ArrayList;

public class GeneradorNumeroRandom implements GeneradorNumeroRandomInterface{
  private ArrayList<Integer> indicesUsados = new ArrayList<>();
  private int contador = 0;

  public int getContador() {return contador;}

  //Devuelve un numero aleatorio del 0 al valor de "size"
  public int getNumeroRandom(int size){
    int numero = -1;

    if(size > 0 && size < 11){
      do{
        numero = (int) (Math.random() * size + 1) - 1;
      }while (indicesUsados.contains(numero));
      indicesUsados.add(numero);
    }
    contador++;
    return numero;
  }
}