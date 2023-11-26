package Vista;

public class MockVistaIntroducirValoresIncorrectos implements VistaInterface{
  //Mock simula jugador introduciendo valores incorrectos (dificultad, categoria, letra)
  private int contadorCategoria = 1;
  private int contadorDificultad = 1;
  private int contadorLetra = 1;
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
    switch (contadorDificultad){
      case 1: contadorDificultad++; return "-1";
      case 2: contadorDificultad++; return "10";
      case 3: contadorDificultad++; return "a";
      case 4: contadorDificultad++; return "%";
      default: contadorDificultad++; return "1";
    }
  }

  public String IntroducirCategoria() {
    switch (contadorCategoria){
      case 1: contadorCategoria++; return "-1";
      case 2: contadorCategoria++; return "10";
      case 3: contadorCategoria++; return "a";
      case 4: contadorCategoria++; return "%";
      default: contadorCategoria++; return "1";
    }
  }

  public String IntroducirLetra() {
    switch (contadorLetra){
      case 1: contadorLetra++; return "1";
      case 2: contadorLetra++; return "%";
      case 3: contadorLetra++; return "a";
      default: contadorLetra++; return "0";
    }
  }
}
