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
/*final class*/
public final class ticket {
    
    taxi info_of_taxi=new taxi();
    VIP_car info_of_vip =new VIP_car();
    passenger info_of_passenger =new passenger();
    public ticket() {
    }
    
    /*this function will take the type of car and will generate all information about passenger and the trib */
    public void getTicket(int choise_of_car_type){
        if(choise_of_car_type==1){
        System.out.println("the ticket information: "+"\nDriver name is :"+info_of_taxi.getDriver());
        System.out.println("name of client is :"+info_of_passenger.getName());
        System.out.println("Route is :"+info_of_taxi.getRoute());
        System.out.println("code of car is:"+info_of_taxi.getCode());
        
        }else if(choise_of_car_type==2){
         System.out.println("the ticket information: "+"\nDriver name is :"+info_of_vip.getDriver());
        System.out.println("name of client is :"+info_of_passenger.getName());
        System.out.println("Route is :"+info_of_vip.getRoute());
        System.out.println("code of car is:"+info_of_vip.getCode());
        }else{
            System.err.println("enter the correct choise");
            this.getTicket(choise_of_car_type);
        
        }
    
    }

    public void setInfo(taxi info) {
        this.info_of_taxi = info;
    }

    public void setInfo_of_vip(VIP_car info_of_vip) {
        this.info_of_vip = info_of_vip;
    }

    public void setInfo_of_passenger(passenger info_of_passenger) {
        this.info_of_passenger = info_of_passenger;
    }

   

    
    
}
