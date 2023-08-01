/**
*Abstract class Rabbit that implements class Pet
*
*@author Luis Pena
*@version   (03/22/2022)
*
*/

public abstract class Rabbit implements Pet, Comparable<Rabbit>
{
   
   //Declaring instance variables
   
   private String myType;
   private String myDiet;
   private int myLifeSpan;
   
   
   //Rabbit class method
   
   Rabbit()
   {
      myType = "Rabbit";
      myDiet = "Herbivore";
      myLifeSpan = 10;     
   }
   
   
   //Concrete method(s) for Rabbit class
   
   public String getType()
   {
      return myType;
   }
   
   public String getDiet()
   {
      return myDiet;
   }
   
   public int getLifeSpan()
   {
      return myLifeSpan;
   }
   
   
   //Abstract method(s) for Rabbit class
   
   public abstract String getBreed();
   
   public abstract String getEarType();
}