/**
*Concrete class Rabbit_Mini_Lop that extends class Rabbit
*
*@author Luis Pena
*@version   (03/23/2022)
*
*/

public class Rabbit_Mini_Lop extends Rabbit
{

   //Declaring instance variables

   private String myBreed;
   private String myOrigin;
   private String mySize;
   private String myEarType;
   private String myColoring;
   
   
   //Rabbit_Mini_Lop class method
   
   Rabbit_Mini_Lop()
   {
      myBreed = "Mini Lop";
      myOrigin = "Germany";
      mySize = "Tiny";
      myEarType = "Full Lop";
      myColoring = "White/Gray";   
   }
   
   
   //Getter method(s) for Rabbit_Mini_Lop class
   
   public String getBreed()
   {
      return myBreed;
   }
   
   public String getOrigin()
   {
      return myOrigin;
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
   
   
   //toString override method
   
   public String toString()
   {
      return "\nBreed: " + myBreed + "\nOrigin: " + myOrigin + "\nSize: "
             + mySize + "\nEar Type: " + myEarType + "\nColoring: " 
             + myColoring + "\n";
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