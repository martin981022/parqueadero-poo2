package modelo;

public abstract class Vehiculo {

    protected String placa;
    protected String tipo;

    public Vehiculo(String placa, String tipo) {
        this.placa = placa;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract double calcularPago(int horas);
}
