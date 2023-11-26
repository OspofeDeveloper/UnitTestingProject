package Controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectorFicheros {
  private String stringFichero;
  private File miFile;

  //Segun la dificultad se carga documento correspondiente
  public LectorFicheros(String dificultat){
    if(dificultat.matches("[1]")){
      miFile = new File("Project_Ahorcado/src/Modelo/facil.txt");
      stringFichero = "Project_Ahorcado/src/Modelo/facil.txt";
    }else if(dificultat.matches("[2]")) {
      miFile = new File("Project_Ahorcado/src/Modelo/normal.txt");
      stringFichero = "Project_Ahorcado/src/Modelo/normal.txt";
    }else if(dificultat.matches("[3]")){
      miFile = new File("Project_Ahorcado/src/Modelo/dificil.txt");
      stringFichero = "Project_Ahorcado/src/Modelo/dificil.txt";
    }
    else{
      System.out.println("Valor Dificultat Incorrecte");
    }
  }

  //Getters
  public String getNombreFile() { return stringFichero; }
  public File getFile() {return miFile;}

  //Setters
  public void setNombreFile(String nombreFile) {stringFichero = nombreFile;}
  public void setFile(File file) {miFile = file;}

  //Se cargan las 10 palabras correspondientes a la dificultad y categoria
  public ArrayList<String> LlegirParaules(String categoriaS) {
    if(categoriaS.matches("[1-5]")){
      int categoria = categoriaS.charAt(0)-48;
      try (BufferedReader frD = new BufferedReader(new FileReader(miFile)))
      {
        ArrayList<String> palabrasDocumento = new ArrayList<>();
        ArrayList<String> palabrasCategoria = new ArrayList<>();
        String linea;

        //Lectura de fichero
        while((linea=frD.readLine())!=null) {
          palabrasDocumento.add(linea);
        }

        //Se guardan solo las palabras de la categoria indicada
        for (int indexPalabra = (categoria-1) * 10; indexPalabra < ((categoria-1) * 10) + 10; indexPalabra++)
        {
          String palabra = palabrasDocumento.get(indexPalabra);
          palabrasCategoria.add(palabra);
        }

        return palabrasCategoria;
      }
      //Devuelve error si el documento es incorrecto
      catch (IOException e) {
        System.out.println("Error en la lectura del Documento de Palabras");
        throw new IllegalArgumentException();
      }
    }
    ArrayList<String> nullString = new ArrayList<>();
    return nullString;
  }
}
