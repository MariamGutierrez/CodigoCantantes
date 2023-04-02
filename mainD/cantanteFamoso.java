/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainD;

/**
 *
 * @author Usuario
 */
public class cantanteFamoso {
    int cod;
    String nombre;
    int discomasVentas;

    public cantanteFamoso() {
    }

    public cantanteFamoso(String nombre, int discomasVentas, int cod) {
        this.nombre = nombre;
        this.discomasVentas = discomasVentas;
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDiscomasVentas() {
        return discomasVentas;
    }

    public int getCod() {
        return cod;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDiscomasVentas(int discomasVentas) {
        this.discomasVentas = discomasVentas;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return " nombre del disco=" + nombre + " Ventas=" + discomasVentas ;
    }
    
    
     
}
