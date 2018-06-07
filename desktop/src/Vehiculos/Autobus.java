package Vehiculos;

public class Autobus extends Vehiculo {
    private int nPlazas;
    private String compañia;

    public Autobus(String matricula, String marca, String modelo, int nPlazas, String compañia) {
        super(matricula, marca, modelo);
        this.nPlazas = nPlazas;
        this.compañia = compañia;
    }
}
