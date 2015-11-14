/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heuristica_vrptw;

import listasimple.Nodo;

/**
 *
 * @author Juan-pablo Barahona
 */

public class Edge {
   //Distancia que existe entre los clientes.
   private double distance;
   //Clientes que se unen por este arco
   private Nodo customer1,customer2;
   //Tiempo en que el cliente 1 termina su servicio.
   private double endOfServiceCustomer1;
   //Tiempo de espera al llegar al cliente 2.
   private double waitingTime;
   
   public Edge(Nodo customer1, Nodo customer2){
       this.setDistance(customer1, customer2);
   }

    /**
     * @return the distance
     */
    public double getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(Nodo customer1, Nodo customer2) {
        
        double valx = customer2.getxCoord()-customer1.getxCoord();
        double valy = customer2.getyCoord()-customer1.getyCoord();
        
        double d = Math.sqrt(Math.pow(valx, 2)+Math.pow(valy, 2));
        
        this.distance = d;
    }

    /**
     * @return the endOfServiceCustomer1
     */
    public double getEndOfServiceCustomer1() {
        return endOfServiceCustomer1;
    }

    /**
     * @param endOfServiceCustomer1 the endOfServiceCustomer1 to set
     */
    public void setEndOfServiceCustomer1(double endOfServiceCustomer1) {
        this.endOfServiceCustomer1 = endOfServiceCustomer1;
    }

    /**
     * @return the waitingTime
     */
    public double getWaitingTime() {
        return waitingTime;
    }

    /**
     * @param waitingTime the waitingTime to set
     */
    public void setWaitingTime(double waitingTime) {
        this.waitingTime = waitingTime;
    }

    /**
     * @return the customer1
     */
    public Nodo getCustomer1() {
        return customer1;
    }

    /**
     * @param customer1 the customer1 to set
     */
    public void setCustomer1(Nodo customer1) {
        this.customer1 = customer1;
    }

    /**
     * @return the customer2
     */
    public Nodo getCustomer2() {
        return customer2;
    }

    /**
     * @param customer2 the customer2 to set
     */
    public void setCustomer2(Nodo customer2) {
        this.customer2 = customer2;
    }
   
}
