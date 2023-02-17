/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Back;

import java.util.Random;

/**
 *
 * @author enriq
 */
public class Barbero {
    Boolean libre;
    int ID;
    int tiempo;
    
    public Boolean getLibre() {
        return libre;
    }

    public void setLibre(Boolean libre) {
        this.libre = libre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    public void barberoTermina(){
        libre = true;
    }
    public void barberoEmpieza(){
        libre = false;
        tiempo = random();
    }
    
    private int random(){
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(30);
        return numero;
    }
    
    public void disminuirTiempo(){
        tiempo--;
    }
}
