/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_pooling_system;

/**
 *
 * @author Master
 */
public class taxi implements Car {
    private  int  code; 
    private final static float  cost=50;
    private String Route;
    private String from;
    private String to;
    private final int maximum_tribs=8;
    private int number_of_reservation;
    private final static int capacity=4;   ////Static and final data member
    private String Driver;
    

    public taxi() {
    }
   
    
    
        public taxi(int code, String from, String to,int reseve,String driver) {
        this.code = code;
        this.number_of_reservation=reseve;
        this.from = from;
        this.to = to;
        Driver=driver;
        
        
    }

    public int getCode() {
        return code;
    }

    public String getRoute() {
        return Route;
    }

    public static int getCapacity() {
        return capacity;
    }

    public void setRoute(String Route) {
        this.Route = Route;
    }

        
        
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getNumber_of_reservation() {
        return number_of_reservation;
    }

    public void setNumber_of_reservation(int number_of_reservation) {
        this.number_of_reservation = number_of_reservation;
    }

    public int getMaximum_tribs() {
        return maximum_tribs;
    }



    public float getCost() {
        return cost;
    }

        public float getCost(String Get_discount) {
        return cost/2;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String Driver) {
        this.Driver = Driver;
    }
    






///Polymorphism & Overloading 
    @Override
    public void set_the_way(String starting,String distination) {
       from=starting;
       to=distination;
    }
    
}
