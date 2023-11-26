package Vista;

public class MockVistaSalirEnDificultad implements VistaInterface{
  //Mock simula jugador saliendo del programa cuando va a introducir dificultad
  @Override
  public void MostrarMenuDificultad() {
    System.out.println("\nBenvinguts a la sala principal del joc. Tria la dificultat:\n" +
        "0:Sortir\n" +
        "1:Fàcil\n" +
        "2:Mig\n" +
        "3:Difícil");
  }

  @Override
  public void MostrarMenuCategoria() {
    System.out.println("\nSelecciona una de les 5 categories:\n" +
        "0:Sortir\n" +
        "1:Esports\n" +
        "2:Animals\n" +
        "3:Països\n" +
        "4:Marca\n" +
        "5:Aliments");
  }

  @Override
  public void MostrarMenuLetra(int contador, int vidas, String liniasPalabra) {
    contador = 11-contador;
    System.out.println("Queden "+ contador +" paraules més.");
    System.out.println("Vides: "+vidas);
    System.out.println("Paraula: "+ liniasPalabra);
    System.out.println("Escull una lletra o 0 per sortir");
  }

  @Override
  public String IntroducirDificultad() {
    return "0";
  }

  @Override
  public String IntroducirCategoria() {
    return "1";
  }

  @Override
  public String IntroducirLetra() {
    return "a";
  }
}
