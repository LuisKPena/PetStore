/**
*Concrete class Dog_Rough_Collie that extends class Dog
*
*@author Luis Pena
*@version   (03/23/2022)
*
*/

public class Dog_Rough_Collie extends Dog
{

   //Declaring instance variables

   private String myJob;
   private String myIntelligence;
   private String myBreed;
   private String myCoatType;
   private String myColoring;
   
   
   //Dog_Rough_Collie class method
   
   Dog_Rough_Collie()
   {
      myBreed = "Scottish Collie";
      myJob = "Herding";
      myIntelligence = "High";
      myCoatType = "Rough (Long)";
      myColoring = "Black/Brown/White";    
   }
   
   
   //Getter method(s) for Dog_Rough_Collie class
   
   public String getBreed()
   {
      return myBreed;
   }
   
   public String getJob()
   {
      return myJob;
   }
   
   public String getIntelligence()
   {
      return myIntelligence;
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
      return "\nBreed: " + myBreed + "\nJob: " + myJob + "\nIntelligence: " 
             + myIntelligence + "\nCoat Type: " + myCoatType + "\nColoring: " 
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