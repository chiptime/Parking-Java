import Parking.Parking;
import Vehiculos.Vehiculo;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hola Mundo");
        Vehiculo vehiculo = new Vehiculo("asd","asd","dsad");
        System.out.println(vehiculo.getMarca() +vehiculo.getMatricula()+vehiculo.getModelo());

        Parking parking = new Parking(5,10);

        for(int i = 0; i < 50; i++) {
            //  private void imprimirParking(Plaza plaza){
            if (parking.getPlazas().get(i).isLibre())
                if (parking.getPlazas().get(i).getPosicion() % 10 == 0)
                    System.out.println();
                else
                    System.out.print(" ");
            else if (parking.getPlazas().get(i).getPosicion() % 10 == 0)
                System.out.println();
            else
                System.out.print("X");
        }
     //   }
    }
}
