import Vista.*;
import Controlador.*;

public class Main {
    public static void main(String[] args){
        //Hace llamada a programa principal
        Vista vista = new Vista();
        MainVista mainVista = new MainVista();
        GeneradorNumeroRandom generador = new GeneradorNumeroRandom();
        mainVista.main(vista, generador);
    }
}
