package Controlador;

public class Jugador {
  private int vidas;

  public Jugador() {
    vidas = 7;
  }

  //getters
  public int getVidas(){
    return vidas;
  }

  //setters
  public void setVidas(int vidas){
    this.vidas = vidas;
  }


  //Dependiendo de la situación en la que se encuentra el jugador suma o resta vidas
  public int updateVidas(String dificultad, boolean letraAcertada, boolean palabraAcertada){
    //Precondiciones de la función
    if(!dificultad.matches("[1-3]")){
      System.out.println("Los parámetros de entrada son incorrectos");
      return -1;
    }

    if(!letraAcertada && palabraAcertada){
      System.out.println("Los parámetros de entrada son incorrectos");
      return -1;
    }

    //Quita una vida si falla la letra
    if(!letraAcertada){
      vidas -= 1;
    }

    //Si acierta la palabra se le suman 1 o 2 vidas dependiendo en que dificultad juega
    switch (dificultad){
      case "1":
        if(palabraAcertada){
          vidas += 2;
        }
        break;
      case "2":
        if(palabraAcertada){
          vidas += 1;
        }
    }
    return vidas;
  }
}
