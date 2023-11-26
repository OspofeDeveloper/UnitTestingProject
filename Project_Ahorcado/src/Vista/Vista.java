package Vista;

import java.util.Scanner;

public class Vista implements VistaInterface{
  //Clase que permite al usuario interactuar con el juego
  public void MostrarMenuDificultad(){
    System.out.println("\nBenvinguts a la sala principal del joc. Tria la dificultat:\n" +
        "0:Sortir\n" +
        "1:Fàcil\n" +
        "2:Mig\n" +
        "3:Difícil");
  }

  public void MostrarMenuCategoria(){
    System.out.println("\nSelecciona una de les 5 categories:\n" +
        "0:Sortir\n" +
        "1:Esports\n" +
        "2:Animals\n" +
        "3:Països\n" +
        "4:Marca\n" +
        "5:Aliments");
  }
  public void MostrarMenuLetra(  int contador, int vidas, String liniasPalabra){
    contador = 11-contador;
    System.out.println("Queden "+ contador +" paraules més.");
    System.out.println("Vides: "+vidas);
    System.out.println("Paraula: "+ liniasPalabra);
    System.out.println("Escull una lletra o 0 per sortir");
  }
  public String IntroducirDificultad(){
    Scanner dificultadTeclado = new Scanner(System.in);
    String dificultad = dificultadTeclado.next();
    return dificultad;
  }

  public String IntroducirCategoria(){
    Scanner dificultadTeclado = new Scanner(System.in);
    String categoria = dificultadTeclado.next();
    return categoria;
  }

  public String IntroducirLetra(){
    Scanner letraTeclado = new Scanner(System.in);
    String letra = letraTeclado.next();
    return letra;
  }
}
