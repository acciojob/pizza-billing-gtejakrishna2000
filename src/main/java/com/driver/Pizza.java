package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;


    private boolean isCheese = false;
    private boolean isTopping = false;
    private boolean isPackage = false;
    private final int vegPizza = 300;
    private final int nVegPizza = 400;
    private final int csePrice = 80;
    private final int tppngsVeg = 70;
    private final int tppngsnVeg = 120;
    private final int pckage = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
           this.price = 300;
        }
        else{
            this.price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
       if(!isCheese){
           this.price = this.price + csePrice;
           isCheese = true;
       }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isTopping && isVeg){
          this.price = this.price + tppngsVeg;
          isTopping = true;
          isCheese = true;
        }
        else if(!isTopping && !isVeg){
          this.price = this.price + tppngsnVeg;
          isTopping = true;
          isCheese = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
       if(!isPackage){
           this.price += pckage;
           isPackage = true;
       }
    }

    public String getBill(){
        // your code goes here
        if(isVeg){
            this.bill =  "Base Price Of The Pizza: "+vegPizza+"\n";
        }
        else{
            this.bill =  "Base Price Of The Pizza: "+nVegPizza+"\n";
        }
        if(isCheese){
            this.bill +=  "Extra Cheese Added: "+csePrice +"\n";
        }
        if(isTopping && isVeg){
            this.bill +=  "Extra Toppings Added: "+tppngsVeg+"\n";
        }
        else if(isTopping && !isVeg){
            this.bill +=  "Extra Toppings Added: "+tppngsnVeg+"\n";
        }
        if(isPackage)
        {this.bill +=  "Paperbag Added: "+pckage+"\n";}
        this.bill +=  "Total Price: " + this.price +"\n";
        return this.bill;
    }
}
