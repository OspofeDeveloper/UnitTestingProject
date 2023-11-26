package Controlador;

public class Validador {
  //Valida que la letra es un valor alfabetico
  public boolean ValidarLletra(String lletraDemanada) {
    if(lletraDemanada.matches("[0]")){
      System.out.println("\nHas introducido un 0 en letra");
      throw new IllegalArgumentException();
    }
    return lletraDemanada != null && lletraDemanada.matches("[a-z,A-Z]");
  }

  //Valida que la categoria es un numero entre 1 y 5
  public boolean ValidarCategoria(String categoria) {
    if(categoria.matches("[0]")){
      System.out.println("\nHas introducido un 0 en categoria");
      throw new IllegalArgumentException();
    }
    return categoria != null && categoria.matches("[1-5]");
  }

  //Valida que la dificultad es un numero entre 1 y 3
  public boolean ValidarDificultad(String dificultad) {
    if(dificultad.matches("[0]")){
      System.out.println("\nHas introducido un 0 en dificultad");
      throw new IllegalArgumentException();
    }
    return dificultad != null && dificultad.matches("[1-3]");
  }
}
