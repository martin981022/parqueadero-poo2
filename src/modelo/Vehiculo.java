package modelo;

import java.time.LocalDateTime;

public abstract class Vehiculo {

    protected String placa;
    protected String tipo;
    protected LocalDateTime horaIngreso;

    public Vehiculo(String placa, String tipo) {
        this.placa = placa;
        this.tipo = tipo;
        this.horaIngreso = LocalDateTime.now();
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDateTime getHoraIngreso() {
        return horaIngreso;
    }

    public abstract double calcularPago(int horas);
}