package Vehiculos;

public class Moto extends Vehiculo {
    private int cilindrada;


    public Moto(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }
}
