package chapter14;

import java.util.Random;

public class Commercial implements Comparable{

    private Random r = new Random();
    private String product;
    private int sales;
    private int numberADs;

    public Commercial(String productName){
        product = productName;
        sales = 0;
        numberADs = 0;
    }
    public void showCommercial(int numAds){
        numberADs+=numAds;
        sales+=r.nextInt(100)*numAds;
    }
    public int compareTo(Object o){
        Commercial c = (Commercial) o;
        if(c.getSales() > this.getSales()){
            return -1;
        } else if (this.equals(c)){
            return 0;
        } else {
            return 1;
        }
    }
    public boolean equals(Commercial c){
        if (c.getSales() == this.getSales())return true;
        return false;
    }
    public String toString(){
        return "Product Name: " + product + "; # Sold: " + sales + "; Number of ADs: " + numberADs;
    }
    public int getSales(){
        return sales;
    }
    public int getNumberADs(){
        return numberADs;
    }
    public String getProductName(){
        return product;
    }
}