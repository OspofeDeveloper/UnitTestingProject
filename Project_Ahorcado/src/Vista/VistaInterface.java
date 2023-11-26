package Vista;

public interface VistaInterface {
    //Diferentes menus que se le muestran al jugador
    public void MostrarMenuDificultad();
    public void MostrarMenuCategoria();
    public void MostrarMenuLetra(int contador, int vidas, String liniasPalabra);

    //Funciones para introducir datos del jugador
    public String IntroducirDificultad();
    public String IntroducirCategoria();
    public String IntroducirLetra();
}
