package Controlador;

import java.util.ArrayList;

public class Palabra {
  private  int letrasProbadas = 0;
  private ArrayList<String> miListaPalabras = new ArrayList<>();
  private GeneradorNumeroRandomInterface miGenerador;
  private StringBuilder miLineas = new StringBuilder();
  private ArrayList<Character> misLetras = new ArrayList<>();
  private String miPalabra = new String();

  public Palabra(ArrayList<String> listaPalabras, GeneradorNumeroRandomInterface generador){
    miListaPalabras = listaPalabras;
    miGenerador = generador;
  }

  //Getters
  public GeneradorNumeroRandomInterface getGenerador() {return miGenerador;}
  public ArrayList<String> getListaPalabras() {return miListaPalabras;}
  public String getMiPalabra() { return miPalabra;}
  public String getMiLinias() {return miLineas.toString();}

  //Setters
  public String setMilinia(String palabra){
    miLineas = new StringBuilder();
    for (int n = 0;  n < palabra.length(); n++)
      miLineas.append("_");

    return miLineas.toString();
  }

  //Devuelve la palabra que hay que adivinar en la ronda
  public String palabraRonda(){
    //Genera numero aleatorio
    int numRand = miGenerador.getNumeroRandom(10);

    //Carga la palabra con indice numRand
    if ( numRand >= 0 && numRand < 10) {
      miPalabra = miListaPalabras.get(numRand);
    }
    else {
      System.out.println("Numero Aleatori incorrecto");
      miPalabra = "Numero Aleatori incorrecto";
    }
    return miPalabra;
  }

  //Devuelve las linias que ve el jugador a lo largo de la ronda
  public String getLinias(String letra){
    //Precondiciones para cambiar linias
    if(letra.length() > 1){
      System.out.println("El tamaño de la letra no es el correcto");
      String ret = getMiLinias();
      return ret;
    }
    if(!Character.isAlphabetic(letra.charAt(0))){
      System.out.println("La letra tiene que ser un valor alfabético");
      String ret = getMiLinias();
      return ret;
    }

    //Bucle que cambia letra acertada por linia
    for (int i = 0; i < miPalabra.length(); i++)
    {
      if(letra.charAt(0) == miPalabra.charAt(i)){
        miLineas.deleteCharAt(i);
        miLineas.insert(i,letra);
      }
    }
    return miLineas.toString();
  }
}
