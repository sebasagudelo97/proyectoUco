package co.com.parqueadero.model;

import lombok.Data;

import java.time.LocalDate;


public class Movimiento {

    private Integer idMovimiento;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalilda;
    private String placa;
    private Tarifa tarifa;

    public Movimiento(Integer idMovimiento, LocalDate fechaIngreso, LocalDate fechaSalilda, String placa, Tarifa tarifa) {
        this.idMovimiento = idMovimiento;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalilda = fechaSalilda;
        this.placa = placa;
        this.tarifa = tarifa;
    }
}
