/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listasimple;

/**
 *
 * @author Juan-pablo Barahona
 */
public class ListaSimple {
    private int tamano;
    private int nvehiculos;
    private int capacida;
    private Nodo inicio;
    private Nodo fin;
    
    /*Creamos la lista*/
    public void Crear_lista(int nvehiculos, int capacida){
        this.setTamano(0);
        this.setInicio(this.fin = null);
        this.setNvehiculos(nvehiculos);
        this.setCapacida(capacida);
    }
    
    /*Insertamos datos a la lista*/
    public void insertarCustomer (int number, double xCoord, double yCoord, double demand, int serviceTime, int timeWindowStart, int timeWindowEnd){
        Nodo nuevo = new Nodo();
        nuevo.Crear_Nodo(number, xCoord, yCoord, demand, serviceTime, timeWindowStart, timeWindowEnd,null);
        if(this.getTamano() == 0){
            this.setInicio(this.fin = nuevo);
        }else{
            this.getFin().setSiguiente(nuevo);
            this.setFin(nuevo);
        }
        this.setTamano(this.getTamano() + 1);
    }
    
    /*Muesta los datos que contiene la lista*/
    public void Mostrar_lista(){
        Nodo aux = this.getInicio();
        while(aux != null){
            System.out.println(aux.getNumber());
            aux = aux.getSiguiente();
        }
    }
    
    /*Encontrar el nodo que contiene el DATO solicitado*/
    public Nodo Encontrar_Dato(int number){
        Nodo nodo = getInicio();
        while(nodo != null){
            if(nodo.getNumber() == number){
                System.out.println("El cliente Nº: "+number+" fue encotrado.");
                return nodo;
            }
            nodo = nodo.getSiguiente();
     }
        return null;
    }
    
    /*Eliminar un dato de la lista*/
    public void Eliminar (int numeroCliente){
        Nodo nodo = Encontrar_Dato(numeroCliente);
        System.out.println("El nodo es: "+nodo.getNumber());
           if(nodo == null){
               System.out.println("[ERROR:]No se encuentra el dato en la lista.");
           }else{
               if(nodo.getSiguiente() == null)
               nodo.setSiguiente(nodo.getSiguiente().getSiguiente());
           }
    }    

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    /**
     * @return the nvehiculos
     */
    public int getNvehiculos() {
        return nvehiculos;
    }

    /**
     * @param nvehiculos the nvehiculos to set
     */
    public void setNvehiculos(int nvehiculos) {
        this.nvehiculos = nvehiculos;
    }

    /**
     * @return the capacida
     */
    public int getCapacida() {
        return capacida;
    }

    /**
     * @param capacida the capacida to set
     */
    public void setCapacida(int capacida) {
        this.capacida = capacida;
    }

    /**
     * @return the inicio
     */
    public Nodo getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fin
     */
    public Nodo getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(Nodo fin) {
        this.fin = fin;
    }
}
