/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 38269
 */
public class Apartment {
    private double area;
    private String location;
    private double price;
    private double rooms;
    private double squarePrice;
    private String source;
    private String title;
    
    public Apartment(double area, String location, double price, double rooms, double squarePrice, String source, String title){
        this.area=area;
        this.location=location;
        this.price=price;
        this.rooms=rooms;
        this.squarePrice=squarePrice;
        this.source=source;
        this.title=title;
        
    }
    
    public double getArea(){
        return area;
    }
    
    public String getLocation(){
        return location;
    }
    
    public double getPrice(){
        return price;
    }
    
    public double getRooms(){
        return rooms;
    }
    
    public double getSquarePrice(){
        return squarePrice;
    }
    
    public String getSource(){
        return source;
    }
    
    public String getTitle(){
        return title;
    }
    
    @Override
    public String toString(){
        return title + " | " + location + " | " + area + " m2 | "+ rooms +" rooms | "+price + " EUR | " + squarePrice + " EUR/m2 | "+ source ;
    }
}
