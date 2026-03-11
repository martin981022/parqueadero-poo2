package servicio;

import modelo.Vehiculo;
import java.util.ArrayList;

public class ParqueaderoService {

    private ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

    public void registrarIngreso(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
        System.out.println("Vehiculo ingresado: " + vehiculo.getPlaca());
    }

    public void mostrarVehiculos() {

        for (Vehiculo v : listaVehiculos) {
            System.out.println(v.getPlaca() + " - " + v.getTipo());
        }
    }

    public ArrayList<Vehiculo> obtenerVehiculos() {
        return listaVehiculos;
    }

    public void eliminarVehiculo(String placa) {

        for (int i = 0; i < listaVehiculos.size(); i++) {

            if (listaVehiculos.get(i).getPlaca().equals(placa)) {
                listaVehiculos.remove(i);
                break;
            }
        }
    }
}
