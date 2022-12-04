//import java.util.*;
package data.structure.java;
class person{
    private String name;
    private  String noOfVehicle;
    private String vehicle1;
    private  String Vehicle2;
     void setPersonDetails(String newName,String noOfVehicle,String vehicle1,String vehicle2){
        this.name=newName;
        this.noOfVehicle=noOfVehicle;
        this.vehicle1=vehicle1;
        this.Vehicle2=vehicle2;
     }
     void getPersonDetails(){
         System.out.println(name+" has "+noOfVehicle+",vehicle one is "+vehicle1+" and another is "+Vehicle2 );
     }
 
 }
 class vehicle {
     protected String fuel;
     protected String uses;
     protected String operation;
 
     static class hondaAccordCar extends vehicle{
 
 
       void sethondaAccordCar(String newfuel,String uses,String madein){
           this.fuel=newfuel;
           this.uses= uses;
           this.operation=madein;
       }
         void  getHondaAccordCar(){
             System.out.println("Honda accord car runs on fuel called "+fuel);
             System.out.println("Honda accord is "+uses+" and "+operation+" in India");
         }
     }
   static class  DucatiBike extends vehicle{
 
         void  setDucatiBike(String newFuel,String uses,String imported){
             this.fuel= newFuel;
             this.uses=uses;
             this.operation=imported;
         }
         void getDucatiBike(){
             System.out.println("Ducati runs on fuel called "+fuel);
             System.out.println("Ducati is "+uses+" and "+operation+" vehicle");
         }
 
   }
 
     public static void main(String[] args) {
 
         // creating object for person whose name is sourabh
 
         person p = new person();
     
         p.setPersonDetails("Sourabh","two","honda accord car","Ducati Bike");
         p.getPersonDetails();
        //  creating object forHonda accord car
 
         hondaAccordCar h = new hondaAccordCar();
         h.sethondaAccordCar("diesel","new","made");
         h.getHondaAccordCar();
 
         // creatting object for Ducati Bike
 
         DucatiBike d = new DucatiBike();
         d.setDucatiBike("petrol","used","imported");
         d.getDucatiBike();
 
     }
 }