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
public class Enemigo extends Personaje {  
    private int tipo;
    
    public Enemigo (){}

    public Enemigo(int vida, int tipo, int nivel) {       
        super(nivel,vida);
        this.tipo = tipo;     
    }
    
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }      
}
