/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_02.entidades;

import semana_02.abstraciones.Elemento;

/**
 *
 * @author Estudiante
 */
public class Espacio extends Elemento {
    
    private int tiempo;
    private int ambiente;
    
    public Espacio(){}

    public Espacio(int tiempo, int nivel, int ambiente) {
        super(nivel);
        this.tiempo = tiempo;
        this.ambiente = ambiente;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(int ambiente) {
        this.ambiente = ambiente;
    }
    
}
