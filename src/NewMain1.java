


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 38269
 */

   import java.util.ArrayList;     
public class NewMain1 {

    public static void main(String[] args){
     ApartmentAnalyzer analyzer = new ApartmentAnalyzer();
     analyzer.loadData("apartments_java.csv");
     System.out.println("broj ucitanih stanova: "
             +analyzer.getNumberOfApartments()
     );
     
     System.out.printf("Prosecna cena stana : %.2f EUR%n", analyzer.averagePrice());
     
     System.out.println("Najskuplji stan : ");
     System.out.println(analyzer.findMostExpensive());
     
     ArrayList<Apartment> affordable = analyzer.filterByBudget(150000);
     System.out.println("Broj stanova do 150000 EUR: " + affordable.size());
     for(int i=0; i < Math.min(5, affordable.size()); i++){
         System.out.println(affordable.get(i));
        
         
     }
     
     ArrayList<Apartment> sorted = analyzer.sortBySquarePrice();
     System.out.println("Top 5 najjeftinijih po EUR/m2 : ");
     for(int i=0; i< Math.min(5, sorted.size()); i++){
         System.out.println(sorted.get(i));
     }
     
        
    }
      
          
      
    }    
       
       
       
 
               
        
        
            
        
        

    
    
   
    
    


    
    

