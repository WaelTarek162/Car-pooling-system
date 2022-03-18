/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_pooling_system;

/**
 *
 * @author wael
 */
/*
*Inheritance tree from User class
*/
public class passenger extends User {   /////////Inheritance tree

    private float cost; 
    private int number_of_reservation;

    public passenger(float coast, String name, String pass, int age, String gender,int n) {
        super(name, pass, age, gender);
        this.cost = coast;
        this.number_of_reservation=n;
    }




    public passenger() {
    }

    public float getCost() {
        return cost;
    }

    public void setCoast(float coast) {
        this.cost = coast;
    }
    
    public void calculate_cost(int number_of_passenger,float costOfTrip, String gender){
        
        this.cost=costOfTrip;
    if(this.getAge()<=18&& gender.equals("female"))
    {
    cost=(cost*number_of_passenger)-(cost/number_of_passenger);
    }
    else{
    
    cost=costOfTrip*number_of_passenger;
    }
    
    }

    public int getNumber_of_reservation() {
        return number_of_reservation;
    }

    public void setNumber_of_reservation(int number_of_reservation) {
        this.number_of_reservation = number_of_reservation;
    }
    
    
}
