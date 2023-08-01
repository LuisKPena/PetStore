/**
*Concrete class Rabbit_Dutch that extends class Rabbit
*
*@author Luis Pena
*@version   (03/23/2022)
*
*/

public class Rabbit_Dutch extends Rabbit
{

   //Declaring instance variables

   private String myBreed;
   private String mySize;
   private String myEarType;
   private String myColoring;
   private int myAvgWeight;
   
   
   //Rabbit_Dutch class method
   
   Rabbit_Dutch()
   {
      myBreed = "Dutch";
      mySize = "Medium";
      myEarType = "Stright/Up";
      myColoring = "White";
      myAvgWeight = 3;    
   }
   
   
   //Getter method(s) for Rabbit_Dutch class
 
   
   public String getBreed()
   {
      return myBreed;
   }
     
   public String getSize()
   {
      return mySize;
   }
   
   public String getEarType()
   {
      return myEarType;
   }
   
   public String getColoring()
   {
      return myColoring;
   }
   
   public int getAvgWeight()
   {
      return myAvgWeight;
   }
   
   
   //toString override method
   
   public String toString()
   {
      return "\nBreed: " + myBreed + "\nSize: " + mySize + "\nEar Type: " 
             + myEarType + "\nColoring: " + myColoring + "\nAverage Weight (lbs): " 
             + myAvgWeight + "\n";
   }
   
   
   //compareTo override method
   
   public int compareTo(Rabbit other)
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