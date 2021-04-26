package parcial2Analisis.model;

import java.util.*;

/**
 * 
 */
public class VehiculoEntity {


    public VehiculoEntity() {
    }


    private String modelo;


    private String marca;

    /**
     * 
     */
    private double precio;

    /**
     * @return
     */
    public String getModelo() {
        // TODO implement here
        return modelo;
    }

    public void setModelo(String vin) {
        // TODO implement here
        this.modelo=modelo;
    }

    /**
     * @return
     */
    public String getMarca() {
        // TODO implement here
        return marca;
    }

    /**
     * @param marca 
     * @return
     */
    public void setMarca(String marca) {
        // TODO implement here
        this.marca=marca;
    }

    /**
     * @return
     */
    public double getPrecio() {
        // TODO implement here
        return precio;
    }

    /**
     * @param precio 
     * @return
     */
    public void setPrecio(double precio) {
        // TODO implement here
        this.precio=precio;
    }

}