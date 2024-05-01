/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.mycompany.groupproject251;

/**
 *
 * @author AHC
 */
public class Price {
       private String fabric;
    private boolean isUrgent = false;
    private double meter;
    private String garment;

    
    public Price(String fabric,  double meter,boolean isUrgent,String garment) {
        this.fabric = fabric;
        this.meter = meter;
        this.isUrgent=isUrgent;
        this.garment=garment;
        
    }
    //---------------------------------------------------------------------------------------

    public String getFabric() {
        return fabric;
    }

    


    public boolean isIsUrgent() {
        return isUrgent;
    }

    public double getMeter() {
        return meter;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getGarment() {
        return garment;
    }


    public void setIsUrgent(boolean isUrgent) {
        this.isUrgent = isUrgent;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }
    
   
    
    public double getPrice(){
      int fCost = getFabricCost(); // fabric cost
      int gCost = 0; // garment cost
      if (garment.equalsIgnoreCase("dress")){
          gCost = 200;
      }
      else if (garment.equalsIgnoreCase("blouse")){
          gCost = 50;
      }
      else if(garment.equalsIgnoreCase("skirt")){
          gCost=100;
      }
      double price= gCost + (fCost*meter);
      if(isUrgent){
          price= price + (price * 0.15);
      }
      
      
        
        
        
        return price;
        //if the price < 0 that means the fabric doesn't found
        
    }
    
  
  
  public int getFabricCost(){
      int fCost = -1;
      String[][] Fabrics = new String[10][2];
      
    Fabrics[0][0] = "crepe";
    Fabrics[0][1] = "20";

    Fabrics[1][0] = "Polyester";
    Fabrics[1][1] = "15"; 
    
    Fabrics[2][0] = "Leather";
    Fabrics[2][1] = "30";

    Fabrics[3][0] = "Linen";
    Fabrics[3][1] = "15";
    
    Fabrics[4][0] = "Satin";
    Fabrics[4][1] = "20";
    
    Fabrics[5][0] = "Chiffon";
    Fabrics[5][1] = "15";
    
    Fabrics[6][0] = "Cotton";
    Fabrics[6][1] = "30";
    
    Fabrics[7][0] = "Denim";
    Fabrics[7][1] = "20";
    
    Fabrics[8][0] = "Silk";
    Fabrics[8][1] = "30";
    
    Fabrics[9][0] = "Tulle";
    Fabrics[9][1] = "10";
    for(int i = 0; i < 10; i++){
        for(int j = 0; j < 2; j++){
           if (Fabrics[i][0].equalsIgnoreCase(fabric)){
               int stringIndex;
               stringIndex = Integer.parseInt(Fabrics[i][1]);
               fCost= stringIndex;
           }
        }
    }
    
    
      return fCost;
    

     
  }

  
}
