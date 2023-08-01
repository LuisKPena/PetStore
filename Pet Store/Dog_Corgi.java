/**
*Concrete class Dog_Corgi that extends class Dog
*
*@author Luis Pena
*@version   (03/23/2022)
*
*/

public class Dog_Corgi extends Dog
{

   //Declaring instance variables

   private String myBreed;
   private String myJob;
   private String myEnergyLevel;
   private String myCoatType;
   private String myColoring;
   
   
   //Dog_Corgi class method
   
   Dog_Corgi()
   {
      myBreed = "Pembroke Welsh Corgi";
      myJob = "Herding";
      myEnergyLevel = "Moderate";
      myCoatType = "Short";
      myColoring = "Champagne/White";    
   }
   
   
   //Getter method(s) for Dog_Corgi class
   
   public String getBreed()
   {
      return myBreed;
   }
   
   public String getJob()
   {
      return myJob;
   }
   
   public String getEnergyLevel()
   {
      return myEnergyLevel;
   }
   
   public String getCoatType()
   {
      return myCoatType;
   }
   
   public String getColoring()
   {
      return myColoring;
   }
   
   
   //toString override method
   
   public String toString()
   {
      return "\nBreed: " + myBreed + "\nJob: " + myJob + "\nEnergy Level: " 
             + myEnergyLevel + "\nCoat Type: " + myCoatType + "\nColoring: " 
             + myColoring + "\n";
   }
   
   
   //compareTo override method
   
   public int compareTo(Dog other)
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