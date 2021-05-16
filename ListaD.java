/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class ListaD {
    NodoListaD inicio;
    NodoListaD ultimo;
    
    public ListaD(){}

    public NodoListaD getInicio() {
        return inicio;
    }

    public void setInicio(NodoListaD inicio) {
        this.inicio = inicio;
    }

    public NodoListaD getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoListaD ultimo) {
        this.ultimo = ultimo;
    }
    
    public void addNodoInicio(int dato){
        NodoListaD nodoNew = new NodoListaD();
        nodoNew.setInformacion(dato);
        if(inicio == null){
            inicio = nodoNew;
            ultimo = nodoNew;
        }
        else{
            inicio.setAnterior(nodoNew);
            nodoNew.setSiguiente(inicio);
            inicio = nodoNew;
        }
    }
    
    public void addNodoFinal(int dato){
        NodoListaD nodoNew = new NodoListaD();
        nodoNew.setInformacion(dato);
        if(inicio == null){
            inicio = nodoNew;
            ultimo = nodoNew;
        }
        else{
            ultimo.setSiguiente(nodoNew);
            nodoNew.setAnterior(ultimo);
            ultimo = nodoNew;
        }
    }
    
    public void deleteNodoInicio(){
        if(inicio != null){
            inicio = inicio.getSiguiente();
            inicio.setAnterior(null);
        }
        else System.out.println("No hay nada que eliminar al inicio");
    }
    
    public void deleteNodoFinal(){
        if(ultimo != null){
            ultimo = ultimo.getAnterior();
            ultimo.setSiguiente(null);
        }
        else System.out.println("No hay nada que eliminar al final");
    }
    
    public void deleteNodo(int dato){
        NodoListaD aux = inicio;
        if(dato != inicio.getInformacion()) deleteNodoInicio();
        else if(dato != ultimo.getInformacion()) deleteNodoFinal();
        else{
            while(aux.getInformacion() != dato){
                aux = aux.getSiguiente();
            }

            aux.getAnterior().setSiguiente(aux.getSiguiente());
            aux.getSiguiente().setAnterior(aux.getAnterior());
        }
    }
    
    public void imprimirListaD(){
        NodoListaD aux = inicio;
        while(aux != null){
            System.out.println(aux.getInformacion());
            aux = aux.getSiguiente();
        }
    }
}
    

