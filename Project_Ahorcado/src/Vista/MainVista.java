package Vista;
import Controlador.*;

import java.util.ArrayList;

public class MainVista {
  //Bucle principal programa
  public static void main(VistaInterface vista, GeneradorNumeroRandomInterface generadorNumeroRandom){
    Validador validador = new Validador();
    Jugador jugador = new Jugador();
    ComprobadorLetra comprobadorLetra = new ComprobadorLetra();
    Reloj reloj = new Reloj();

    vista.MostrarMenuDificultad();
    String dificultad = vista.IntroducirDificultad();
    while(validador.ValidarDificultad(dificultad) == false){
      System.out.println("\nLa dificultad introducida no es valida. Vuelve a introducirla");
      dificultad = vista.IntroducirDificultad();
    }
    //datosPartida.setDificultad(dificultad);

    vista.MostrarMenuCategoria();
    String categoria = vista.IntroducirCategoria();
    while(validador.ValidarCategoria(categoria) == false){
      System.out.println("\nLa categoria introducida no es valida. Vuelve a introducirla");
      categoria = vista.IntroducirCategoria();
    }
    //datosPartida.setCategoria(categoria);

    LectorFicheros cargadorDocumentoPalabras = new LectorFicheros(dificultad);
    ArrayList<String> listaPalabras = cargadorDocumentoPalabras.LlegirParaules(categoria);
    Palabra palabraJuego = new Palabra(listaPalabras, generadorNumeroRandom);

    while(generadorNumeroRandom.getContador() < 10)
    {
      palabraJuego.palabraRonda();
      palabraJuego.setMilinia(palabraJuego.getMiPalabra());
      String linias = palabraJuego.setMilinia(palabraJuego.getMiPalabra());
      ArrayList<String> letrasUsadas = new ArrayList<>();
      reloj.start();

      while(palabraJuego.getMiLinias().contains("_") == true && jugador.getVidas() > 0){
        vista.MostrarMenuLetra(generadorNumeroRandom.getContador(), jugador.getVidas(), linias);
        String nextLetra = vista.IntroducirLetra();
        while(validador.ValidarLletra(nextLetra) == false){
          System.out.println("\nLa letra introducida no es valida. Vuelve a introducirla");
          vista.MostrarMenuLetra(generadorNumeroRandom.getContador(), jugador.getVidas(), palabraJuego.getLinias(nextLetra));
          nextLetra = vista.IntroducirLetra();
        }
        while(letrasUsadas.contains(nextLetra)){
          System.out.println("\nLa letra ya ha sido usada. Vuelve a introducirla");
          vista.MostrarMenuLetra(generadorNumeroRandom.getContador(), jugador.getVidas(), palabraJuego.getLinias(nextLetra));
          nextLetra = vista.IntroducirLetra();
        }
        letrasUsadas.add(nextLetra);
        if (comprobadorLetra.buscarLletra(nextLetra, palabraJuego.getMiPalabra()) == true){
          linias = palabraJuego.getLinias(nextLetra);
        }else{
          if( jugador.getVidas() == 1) {
            System.out.println("\nTe has quedado sin vidas" +
                    "\nLa palabra correcta era " + palabraJuego.getMiPalabra());
          }
          jugador.updateVidas(dificultad,false,false);
        }
      }
      if(jugador.getVidas() == 0)
        throw new IllegalArgumentException();
      else{
        System.out.println("\nPalabra adivinada!! La palabra era " + palabraJuego.getMiPalabra());
        jugador.updateVidas(dificultad, true, true);
      }
    }
    reloj.stop();
    System.out.println("\nFelicidades!!! Has adivinado todas las palabras");
    System.out.println("Has tardado " + reloj.getElapsedSeconds() + " segundos");
    throw new IllegalArgumentException();
  }
}
