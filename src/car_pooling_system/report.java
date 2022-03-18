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
/*Inheritance tree from abstract class (rating)*/
public class report extends rating {
   

   
    Admin admin =new Admin();
   

    public report() {
    }
    
    
/*Overriding */
    @Override
    public void setText(String t) {
        this.admin.setRating(t);
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

   

    
    
    
    
}
