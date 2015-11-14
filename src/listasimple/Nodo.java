package listasimple;

/**
 *
 * @author Juan-pablo Barahona
 */
public class Nodo {
    
    private int number;
    private double xCoord;
    private double yCoord;
    private double demand;
    private int timeWindowStart;
    private int timeWindowEnd;
    private int serviceTime;
    private Nodo siguiente;
    
    public void Crear_Nodo(int number, double xCoord, double yCoord, double demand, int timeWindowStart, int timeWindowEnd, int serviceTime, Nodo siguiente){
        this.setNumber(number);
        this.setxCoord(xCoord);
        this.setyCoord(yCoord);
        this.setDemand(demand);
        this.setTimeWindowStart(timeWindowStart);
        this.setTimeWindowEnd(timeWindowEnd);
        this.setServiceTime(serviceTime);

        this.setSiguiente(siguiente);
    }
    
    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the xCoord
     */
    public double getxCoord() {
        return xCoord;
    }

    /**
     * @param xCoord the xCoord to set
     */
    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    /**
     * @return the yCoord
     */
    public double getyCoord() {
        return yCoord;
    }

    /**
     * @param yCoord the yCoord to set
     */
    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    /**
     * @return the demand
     */
    public double getDemand() {
        return demand;
    }

    /**
     * @param demand the demand to set
     */
    public void setDemand(double demand) {
        this.demand = demand;
    }

    /**
     * @return the timeWindowStart
     */
    public int getTimeWindowStart() {
        return timeWindowStart;
    }

    /**
     * @param timeWindowStart the timeWindowStart to set
     */
    public void setTimeWindowStart(int timeWindowStart) {
        this.timeWindowStart = timeWindowStart;
    }

    /**
     * @return the timeWindowEnd
     */
    public int getTimeWindowEnd() {
        return timeWindowEnd;
    }

    /**
     * @param timeWindowEnd the timeWindowEnd to set
     */
    public void setTimeWindowEnd(int timeWindowEnd) {
        this.timeWindowEnd = timeWindowEnd;
    }

    /**
     * @return the serviceTime
     */
    public int getServiceTime() {
        return serviceTime;
    }

    /**
     * @param serviceTime the serviceTime to set
     */
    public void setServiceTime(int serviceTime) {
        this.serviceTime = serviceTime;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
