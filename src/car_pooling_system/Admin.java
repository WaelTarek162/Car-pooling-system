/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_pooling_system;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Master
 */
/*
*Inheritance tree from User class
*/
public class Admin extends User{

private final String name="Admin";
private final String pass="123";
protected  ArrayList<String> rating = new ArrayList<>();
protected ArrayList<String> report = new ArrayList<>();

    public Admin() {
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }
    
     /*
    *final function for getting all review
    */
    public  final ArrayList<String> getRating() {
        for(int i=0; i<this.rating.size();i++)
        {
            System.out.println("rate "+(i+1)+" "+rating.get(i));
        }
    return null;
    
    }
    /*
    *final function for getting all report
    */
     public  final ArrayList<String> getReport() {
        for(int i=0; i<this.report.size();i++)
        {
            System.out.println("report number "+(i+1)+" "+report.get(i));
        }
    return null;
    
    }

    public void setRating(String rate) {
        this.rating.add(rate);
    }

    public void setReport(String rate) {
        this.report.add(rate);
    }
   
    
    

    
    
}
