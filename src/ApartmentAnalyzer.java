/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 38269
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;

public class ApartmentAnalyzer {
    private ArrayList<Apartment> apartments;
    public ApartmentAnalyzer(){
        apartments = new ArrayList<>();
    }
    
 public void loadData(String fileName){
     try {
         BufferedReader br = new BufferedReader(new FileReader(fileName));
         String line;
         br.readLine();
         while((line = br.readLine()) != null){
             String[] data = line.split(";");
             double area = Double.parseDouble(data[0]);
             String location = data[1];
             double price = Double.parseDouble(data[2]);
             double rooms = Double.parseDouble(data[3]);
             double squarePrice = Double.parseDouble(data[4]);
             String source = data[5];
             String title = data[6];
             
             Apartment apartment = new Apartment(area, location ,price ,rooms ,squarePrice ,source , title);
             apartments.add(apartment);
         }
         br.close();
         
     } catch(IOException e){
         System.out.println("Greska pri ucitavanju fajla");
         System.out.println(e.getMessage());
 }catch(NumberFormatException e){
     System.out.println("Greska pri pretvaranju broja");
     System.out.println(e.getMessage());
 }  
 }
   public int getNumberOfApartments(){
       return apartments.size();
   }
   
   public double averagePrice(){
       double sum = 0;
       for(Apartment apartment : apartments){
           sum += apartment.getPrice();
           
       }
       return sum/apartments.size();
       
   }
   
   public Apartment findMostExpensive(){
       Apartment mostExpensive = apartments.get(0);
       for(Apartment apartment : apartments){
           if(apartment.getPrice() > mostExpensive.getPrice()){
               mostExpensive = apartment;
           }
       }
       return mostExpensive;
   }
   
   public ArrayList<Apartment> filterByBudget(double maxPrice){
       ArrayList<Apartment> result = new ArrayList<>();
       for(Apartment apartment : apartments){
           if(apartment.getPrice() <= maxPrice){
               result.add(apartment);
                       }
       }
       return result;
   }
   
   public ArrayList<Apartment> sortBySquarePrice(){
       ArrayList<Apartment> sorted = new ArrayList<>(apartments);
       sorted.sort((a1, a2) ->
       Double.compare(a1.getSquarePrice(), a2.getSquarePrice())
               );
       return sorted;
   }
 }

