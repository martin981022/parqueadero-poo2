package modelo;

public class Moto extends Vehiculo {

    public Moto(String placa) {
        super(placa, "Moto");
    }

    @Override
    public double calcularPago(int horas) {
        return horas * 1500;
    }
}