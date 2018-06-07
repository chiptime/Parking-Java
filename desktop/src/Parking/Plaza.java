package Parking;

public class Plaza {
    private int posicion;
    private boolean libre;
    private char representacion;

    public Plaza(boolean libre) {
       // this.posicion = posicion;
        this.libre = libre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public char getRepresentacion() {
        return representacion;
    }

    public void setRepresentacion(char representacion) {
        this.representacion = representacion;
    }
}
