package parcial2Analisis.model;

import java.util.*;

/**
 * 
 */
public class EmpresaEntity {



    /**
     * 
     */
    private String nombreComercial;

 
    private String nombreLegal;


    private String direccionFiscal;


    private int nit;

    /**
     * @return
     */
    public String getNombreComercial() {
        // TODO implement here
        return nombreComercial;
    }


    public void setNombreComercial(String nombreComercial) {
        // TODO implement here
         this.nombreComercial= nombreComercial;
    }

    /**
     * @return
     */
    public String getnombreLegal() {
        // TODO implement here
        return nombreLegal;
    }

    /**
     * @param nombreLegal 
     * @return
     */
    public void setNombreLegal(String nombreLegal) {
        // TODO implement here
        this.nombreLegal=nombreLegal;
    }

    /**
     * @return
     */
    public String getDireccionFiscal() {
        // TODO implement here
        return direccionFiscal;
    }

    /**
     * @param direccionFiscal 
     * @return
     */
    public void setDireccionFiscal(String direccionFiscal) {
        // TODO implement here
        this.direccionFiscal=direccionFiscal;
    }

    /**
     * @return
     */
    public int getNit() {
        // TODO implement here
        return nit;
    }


    public void setNit(int nit) {
        // TODO implement here
        this.nit=nit;
    }

}