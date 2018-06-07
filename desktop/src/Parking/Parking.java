package Parking;

import Parking.Plaza;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Parking {
    private int filas;
    private int columnas;
    private ArrayList<Plaza> plazas;
    private static Parking parking;

    public Parking(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        plazas = new ArrayList<Plaza>();
        cargarPlaza();
        //imprimirParking();
    }

    public static Parking getInstance() {
        return parking;
    }

    public static Parking setInstance() {
        return parking;
    }

    public ArrayList<Plaza> getPlazas() {
        return plazas;
    }

    public void setPlazas(ArrayList<Plaza> plazas) {
        this.plazas = plazas;
    }

    private void addPlaza(Plaza plaza) {
        plazas.add(plaza);
        plaza.setPosicion(plazas.indexOf(plaza));
    }
    private void cargarPlaza(){
        //guardar en un array multidimensional la plaza para imprimir

        for(int f = 0; f < 5; f++){
            for(int c = 0; c < 10; c++)
                if (f == 0 || f == 4) {
                    if (c == 0 || c == 9)
                        addPlaza(new Plaza(false));
                }
                else
                    if(c > 0 && c < 9)
                        addPlaza(new Plaza(true));
        }
    }
}
