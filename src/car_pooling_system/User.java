/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_pooling_system;

import static java.lang.System.in;

/**
 *
 * @author Master
 */
/*
*suber class for Admin and passenger
*/
public class User {
    private  String name;
    private  String pass;
    private  int age;
    private  String gender;

    public User(String name, String pass, int age, String gender) {
        this.name = name;
        this.pass = pass;
        this.age = age;
        this.gender = gender;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
}
