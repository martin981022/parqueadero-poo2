package main;

import modelo.Carro;
import modelo.Moto;
import servicio.ParqueaderoService;
import java.util.Scanner;
import main.VentanaParqueadero;


public class Main {

    public static void main(String[] args) {

        VentanaParqueadero ventana = new VentanaParqueadero();
        ventana.setVisible(true);

        Scanner sc = new Scanner(System.in);
        ParqueaderoService parqueadero = new ParqueaderoService();

        while (true) {

            System.out.println("\nPARQUEADERO");
            System.out.println("1. Ingresar carro");
            System.out.println("2. Ingresar moto");
            System.out.println("3. Ver vehículos");
            System.out.println("4. Salida de vehículo (calcular pago)");
            System.out.println("5. Salir");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("Ingrese placa:");
                    String placaCarro = sc.nextLine();

                    parqueadero.registrarIngreso(new Carro(placaCarro));

                    break;

                case 2:

                    System.out.println("Ingrese placa:");
                    String placaMoto = sc.nextLine();

                    parqueadero.registrarIngreso(new Moto(placaMoto));

                    break;

                case 3:

                    parqueadero.mostrarVehiculos();

                    break;

                case 4:

                    System.out.println("Ingrese la placa del vehículo que sale:");
                    String placaSalida = sc.nextLine();

                    parqueadero.eliminarVehiculo(placaSalida);

                    break;

                case 5:

                    System.exit(0);

            }

        }

    }

}