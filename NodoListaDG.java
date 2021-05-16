/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class NodoListaDG <A> {
    private A informacion;
    private NodoListaDG <A> siguiente;
    private NodoListaDG <A> anterior;
    
    public NodoListaDG(){}

    public A getInformacion() {
        return informacion;
    }

    public void setInformacion(A informacion) {
        this.informacion = informacion;
    }

    public NodoListaDG<A> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaDG<A> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaDG<A> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaDG<A> anterior) {
        this.anterior = anterior;
    }
}
