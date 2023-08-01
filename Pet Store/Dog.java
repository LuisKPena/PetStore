/**
*Abstract class Dog that implements class Pet
*
*@author Luis Pena
*@version   (03/22/2022)
*
*/

public abstract class Dog implements Pet, Comparable<Dog>
{

   //Declaring instance variables

   private String myType;
   private String myDiet;
   private int myLifeSpan;
   
   
   //Dog class method
   
   Dog()
   {
      myType = "Dog";
      myDiet = "Omnivore";
      myLifeSpan = 13;     
   }
   
   
   //Concrete method(s) for Dog class
   
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
   
   
   //Abstract method(s) for Dog class
   
   public abstract String getBreed();
   
   public abstract String getJob();
}