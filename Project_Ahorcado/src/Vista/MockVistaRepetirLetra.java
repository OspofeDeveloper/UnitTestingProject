package Vista;

public class MockVistaRepetirLetra implements VistaInterface{
  //Mock simula jugador introduciendo la misma letra en diferentes rondas
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
      case 0: contadorLetra++; return "w";
      case 1: contadorLetra++; return "w";
      case 2: contadorLetra++; return "o";
      default: return "0";
    }
  }
}
