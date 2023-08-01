/**
*Abstract class Cat that implements class Pet
*
*@author Luis Pena
*@version   (03/22/2022)
*
*/

public abstract class Cat implements Pet, Comparable<Cat>
{

   //Declaring instance variables

   private String myType;
   private String myDiet;
   private int myLifeSpan;
   
   
   //Cat class method
   
   Cat()
   {
      myType = "Cat";
      myDiet = "Carnivore";
      myLifeSpan = 18;     
   }
   
   
   //Concrete method(s) for Cat class
   
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
   
   
   //Abstract method(s) for Cat class
   
   public abstract String getBreed();
   
   public abstract String getCoatType();
}