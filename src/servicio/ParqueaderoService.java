package servicio;

import modelo.Vehiculo;
import java.util.ArrayList;
import java.time.Duration;
import java.time.LocalDateTime;

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

    public String eliminarVehiculo(String placa) {

    for (int i = 0; i < listaVehiculos.size(); i++) {

        Vehiculo v = listaVehiculos.get(i);

        if (v.getPlaca().equalsIgnoreCase(placa)) {

            LocalDateTime salida = LocalDateTime.now();

            Duration tiempo = Duration.between(v.getHoraIngreso(), salida);

            long minutos = tiempo.toMinutes();

            double total;

            if (v.getTipo().equalsIgnoreCase("Carro")) {
                total = minutos * 100;
            } else {
                total = minutos * 50;
            }

            listaVehiculos.remove(i);

            return "====== TICKET PARQUEADERO ======\n"
                    + "Placa: " + v.getPlaca()
                    + "\nTipo: " + v.getTipo()
                    + "\nHora ingreso: " + v.getHoraIngreso()
                    + "\nHora salida: " + salida
                    + "\nTiempo estacionado: " + minutos + " minutos"
                    + "\n\nTotal a pagar: $" + total
                    + "\n===============================";
        }
    }

    return "Vehículo no encontrado";
}
    }