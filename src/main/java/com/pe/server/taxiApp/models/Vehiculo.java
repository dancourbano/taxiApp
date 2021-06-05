package com.pe.server.taxiApp.models;


        import com.fasterxml.jackson.annotation.JsonIgnore;

        import javax.persistence.*;
        import java.util.Set;

/**
 * Created by DANIEL on 18/01/2017.
 */
@Entity
@Table(name = "vehiculo")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_vehiculo;
    @Column
    private String placa;
    @Column
    private String modelo;
    @Column
    private String marca;
    @Column
    private String tipo_servicio;
    @Column
    private String color;
    @Column
    private String foto;




    public int getIdVehiculo() {
        return id_vehiculo;
    }

    public void setIdVehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }


}
