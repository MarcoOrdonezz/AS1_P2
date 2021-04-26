package parcial2Analisis.model;

import java.util.*;

/**
 * 
 */
public class EventoEntity {

    /**
     * Default constructor
     */
    public EventoEntity() {
    }

    /**
     * 
     */
    private String fecha;

    /**
     * 
     */
    private String nombreEvento;

    /**
     * 
     */
    private String descripcion;

 
    public String getFecha() {
        // TODO implement here
        return fecha;
    }

    /**
     * @param fecha 
     * @return
     */
    public void setFecha(String fecha) {
        // TODO implement here
        this.fecha=fecha;
    }

    /**
     * @return
     */
    public String getNombreEvento() {
        // TODO implement here
        return nombreEvento;
    }

    /**
     * @param nombreEvento 
     * @return
     */
    public void setNombreEvento(String nombreEvento) {
        // TODO implement here
        this.nombreEvento=nombreEvento;
    }

    /**
     * @return
     */
    public String getDescripcion() {
        // TODO implement here
        return descripcion;
    }

    /**
     * @param descripcion 
     * @return
     */
    public void setDescripcion(String descripcion) {
        // TODO implement here
        this.descripcion=descripcion;
    }

}