/**
*Concrete class Cat_Maine_Coon that extends class Cat
*
*@author Luis Pena
*@version   (03/23/2022)
*
*/

public class Cat_Maine_Coon extends Cat
{

   //Declaring instance variables

   private String myBreed;
   private String mySize;
   private String myCoatType;
   private String myColoring;
   private String myIntelligence;
   
   
   //Cat_Maine_Coon class method
   
   Cat_Maine_Coon()
   {
      myBreed = "Maine Coon";
      mySize = "Large"; 
      myCoatType = "Long";
      myColoring = "Gray/Black Stripes";
      myIntelligence = "High";    
   }
   
   
   //Getter method(s) for Cat_Maine_Coon class
   
   public String getBreed()
   {
      return myBreed;
   }
   
   public String getSize()
   {
      return mySize;
   }
   
   public String getCoatType()
   {
      return myCoatType;
   }
   
   public String getColoring()
   {
      return myColoring;
   }
   
   public String getIntelligence()
   {
      return myIntelligence;
   }
   
   
   //toString override method
   
   public String toString()
   {
      return "\nBreed: " + myBreed + "\nSize: " + mySize + "\nCoat Type: " 
             + myCoatType + "\nColoring: " + myColoring  + "\nIntelligence: " 
             + myIntelligence + "\n";
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