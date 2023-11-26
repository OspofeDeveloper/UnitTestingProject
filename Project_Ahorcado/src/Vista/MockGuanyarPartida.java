package Vista;

public class MockGuanyarPartida implements VistaInterface{
  //Mock simula jugador ganando partida
  private int contadorLetra = 0;
  public void MostrarMenuDificultad() {
    System.out.println("\nBenvinguts a la sala principal del joc. Tria la dificultat:\n" +
        "0:Sortir\n" +
        "1:Fàcil\n" +
        "2:Mig\n" +
        "3:Difícil");
  }

  public void MostrarMenuCategoria() {
    System.out.println("\nSelecciona una de les 5 categories:\n" +
        "0:Sortir\n" +
        "1:Esports\n" +
        "2:Animals\n" +
        "3:Països\n" +
        "4:Marca\n" +
        "5:Aliments");
  }

  public void MostrarMenuLetra(int contador, int vidas, String liniasPalabra) {
    contador = 11 - contador;
    System.out.println("\nQueden "+ contador +" paraules més.");
    System.out.println("Vides: "+vidas);
    System.out.println("Paraula: "+ liniasPalabra);
    System.out.println("Escull una lletra o 0 per sortir");
  }

  public String IntroducirDificultad() {
    return "1";
  }

  public String IntroducirCategoria() {
    return "1";
  }

  public String IntroducirLetra() {
    switch (contadorLetra){
      case 0: contadorLetra++; return "p";
      case 1: contadorLetra++; return "o";
      case 2: contadorLetra++; return "l";

      case 3: contadorLetra++; return "g";
      case 4: contadorLetra++; return "o";
      case 5: contadorLetra++; return "l";
      case 6: contadorLetra++; return "f";

      case 7: contadorLetra++; return "j";
      case 8: contadorLetra++; return "u";
      case 9: contadorLetra++; return "d";
      case 10: contadorLetra++; return "o";

      case 11: contadorLetra++; return "v";
      case 12: contadorLetra++; return "e";
      case 13: contadorLetra++; return "l";
      case 14: contadorLetra++; return "a";

      case 15: contadorLetra++; return "r";
      case 16: contadorLetra++; return "e";
      case 17: contadorLetra++; return "m";
      case 18: contadorLetra++; return "o";

      case 19: contadorLetra++; return "m";
      case 20: contadorLetra++; return "a";

      case 21: contadorLetra++; return "s";
      case 22: contadorLetra++; return "u";
      case 23: contadorLetra++; return "r";
      case 24: contadorLetra++; return "f";

      case 25: contadorLetra++; return "t";
      case 26: contadorLetra++; return "i";
      case 27: contadorLetra++; return "r";
      case 28: contadorLetra++; return "o";

      case 29: contadorLetra++; return "l";
      case 30: contadorLetra++; return "u";
      case 31: contadorLetra++; return "g";
      case 32: contadorLetra++; return "e";

      case 33: contadorLetra++; return "b";
      case 34: contadorLetra++; return "m";
      default: return "x";
    }
  }
}
