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
public class VIP_car implements Car  {

    public VIP_car() {
    }
    
    private  int  code; 
    
    private static int counter;/*calculated parameters*/
    private  static float  cost;
    private String Route;
    private String from;
    private String to;
    private int code_starting=6938;
    private final static int capacity=6;
     private final int maximum_tribs=8;
    private int number_of_reservation;
    private String Driver;
   
    public static float getcost(){
    
    return cost;
    }
    
    
    @Override
    public void set_the_way(String starting, String distination) {
        this.Route=starting+"-"+distination;
        
    }

    public VIP_car(int code, String Route, String from, String to,String driver) {
        
        this.code = code;
        this.Route = Route;
        this.from = from;
        this.to = to;
        Driver=driver;
    }

    
    /*Polymorphism & Overloading */
    public static void setCost(float cost) {
        VIP_car.cost = cost;
    }
    
/*Polymorphism & Overloading */
    public static void setCost(float cost,float discount){
        VIP_car.cost=cost*discount;
    }


    public void setCode(int code) {
        this.code = code;
    }

    public void setRoute(String Route) {
        this.Route = Route;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setCode_starting(int code_starting) {
        this.code_starting = code_starting;
    }

    public int getCode() {
        return code;
    }

    public static float getCost() {
        return cost;
    }


    public final String getRoute() {
        return Route;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getCode_starting() {
        return code_starting;
    }

    public static int getCapacity() {
        return capacity;
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

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String D) {
        this.Driver = D;
    }
    


    
}
