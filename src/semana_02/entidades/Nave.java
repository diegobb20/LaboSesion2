/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_02.entidades;

import semana_02.abstraciones.Personaje;

/**
 *
 * @author Estudiante
 */
public class Nave  extends Personaje{
    private int puntaje;
    
    public Nave(){}

    public Nave(int vidas, int puntaje, int nivel) {
        super(vidas,nivel);
        this.puntaje = puntaje;
    }
   
    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    } 
}
