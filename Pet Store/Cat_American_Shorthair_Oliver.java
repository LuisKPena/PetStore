/**
*Concrete class Cat_American_Shorthair_Oliver that extends class Dog_American_Shorthair
*
*@author Luis Pena
*@version   (03/23/2022)
*
*/

public class Cat_American_Shorthair_Oliver extends Cat_American_Shorthair
{

   //Declaring instance variables

   private String myName;
   private String myEyeColor;
   private int myAge;
   private String myFavToy;
   private String myFavTreat;
   
   
   //Cat_American_Shorthair_Oliver class method
   
   Cat_American_Shorthair_Oliver()
   {
      myName = "Oliver";
      myEyeColor = "Yellow";
      myAge = 7;
      myFavToy = "Cardboard Box";
      myFavTreat = "Tuna";    
   }
   
   
   //Getter method(s) for Cat_American_Shorthair_Oliver class
   
   public String getName()
   {
      return myName;
   }
   
   public String getEyeColor()
   {
      return myEyeColor;
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
      return "\nName: " + myName + "\nEye Color: " + myEyeColor
             + "\nAge: " + myAge + "\nFavorite Toy: " + myFavToy 
             + "\nFavorite Treat: " + myFavTreat + "\n";
   }      
}