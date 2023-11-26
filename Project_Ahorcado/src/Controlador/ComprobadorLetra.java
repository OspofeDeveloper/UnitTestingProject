package Controlador;

public class ComprobadorLetra {
  //Mira si la letra "lletraDemanada" se encuantra dentro de la palabra "palabra"
  public boolean buscarLletra(String lletraDemanada, String palabra)
  {
    //Precondiciones para la búsqueda
    if(lletraDemanada.length() > 1){
      return false;
    }
    if(palabra.length() < 2){
      return false;
    }
    boolean trobat = false;

    //Bucle principal para la búsqueda
    for (int lletraParaula=0; lletraParaula<palabra.length(); lletraParaula++){
      if(palabra.contains(lletraDemanada.toLowerCase()))
        trobat = true;
    }
    return trobat;
  }
}
