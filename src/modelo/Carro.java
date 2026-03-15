package modelo;

public class Carro extends Vehiculo {

    public Carro(String placa) {
        super(placa, "Carro");
    }

    @Override
    public double calcularPago(int horas) {
        return horas * 3000;
    }
}