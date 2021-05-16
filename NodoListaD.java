/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class NodoListaD {
    private int informacion;
    private NodoListaD siguiente;
    private NodoListaD anterior;
    
    public NodoListaD(){}

    public int getInformacion() {
        return informacion;
    }

    public void setInformacion(int informacion) {
        this.informacion = informacion;
    }

    public NodoListaD getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaD siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaD getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaD anterior) {
        this.anterior = anterior;
    }
    
    
}
