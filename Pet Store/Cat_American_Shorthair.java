/**
*Concrete class Cat_American_Shorthair that extends class Cat
*
*@author Luis Pena
*@version   (03/23/2022)
*
*/

public class Cat_American_Shorthair extends Cat
{

   //Declaring instance variables

   private String myBreed;
   private String myOrigin;
   private String myCoatType;
   private String myColoring;
   private String myTemperament;
   
   
   //Cat_American_Shorthair class method
   
   Cat_American_Shorthair()
   {
      myBreed = "American Shorthair";
      myOrigin = "United States";   
      myCoatType = "Short";
      myColoring = "Gray/White";
      myTemperament = "Curious";    
   }
   
   
   //Getter method(s) for Cat_American_Shorthair class
   
   public String getBreed()
   {
      return myBreed;
   }
   
   public String getOrigin()
   {
      return myOrigin;
   }
   
   public String getCoatType()
   {
      return myCoatType;
   }
   
   public String getColoring()
   {
      return myColoring;
   }
   
   public String getTemperament()
   {
      return myTemperament;
   }
   
   
   //toString override method
   
   public String toString()
   {
      return "\nBreed: " + myBreed + "\nOrigin: " + myOrigin + "\nCoat Type: " 
             + myCoatType + "\nColoring: " + myColoring  + "\nTemperament: " 
             + myTemperament + "\n";
   }
   
   
   //compareTo override method
   
   public int compareTo(Cat other)
   {
      int nameOrder = myBreed.compareTo(other.getBreed());
      
      if(nameOrder > 0)
      {
         return 1;
      }
      
      else if(nameOrder < 0)
      {
         return -1;
      }
      
      else
      {
         return 0;
      }
   }      
}