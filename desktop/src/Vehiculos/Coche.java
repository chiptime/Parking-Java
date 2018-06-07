package Vehiculos;

public class Coche extends Vehiculo {
    private String DNI;
    private boolean electrico;

    public Coche(String matricula, String marca, String modelo, String DNI, boolean electrico) {
        super(matricula, marca, modelo);
        this.DNI = DNI;
        this.electrico = electrico;
    }
}
