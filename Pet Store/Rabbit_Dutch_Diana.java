/**
*Concrete class Rabbit_Dutch_Diana that extends class Rabbit_Dutch
*
*@author Luis Pena
*@version   (03/23/2022)
*
*/

public class Rabbit_Dutch_Diana extends Rabbit_Dutch
{

   //Declaring instance variables
   
   private String myName;
   private String myTemperament;
   private int myAge;
   private String myFavToy;
   private String myFavTreat;
   
   
   //Rabbit_Dutch_Diana class method
   
   Rabbit_Dutch_Diana()
   {
      myName = "Diana";
      myTemperament = "Calm";
      myAge = 3;
      myFavToy = "Squeaky Carrot";
      myFavTreat = "Lettuce";    
   }
   
   
   //Getter method(s) for Rabbit_Dutch_Diana class
   
   public String getName()
   {
      return myName;
   }
   
   public String getTemperament()
   {
      return myTemperament;
   }
   
   public int getAge()
   {
      return myAge;
   }
   
   public String getFavToy()
   {
      return myFavToy;
   }
   
   public String getFavTreat()
   {
      return myFavTreat;
   }
   
   
   //toString override method
   
   public String toString()
   {
      return "\nName: " + myName + "\nTemperament: " + myTemperament
             + "\nAge: " + myAge + "\nFavorite Toy: " + myFavToy
             + "\nFavorite Treat: " + myFavTreat + "\n";
   }
      
}