/**
*Concrete class Dog_Rough_Collie_Banjo that extends class Dog_Rough_Collie
*
*@author Luis Pena
*@version   (03/23/2022)
*
*/

public class Dog_Rough_Collie_Banjo extends Dog_Rough_Collie
{

   //Declaring instance variables

   private String myName;
   private int myWeight;
   private int myAge;
   private String myFavToy;
   private String myFavTreat;
   
   
   //Dog_Rough_Collie_Banjo class method
   
   Dog_Rough_Collie_Banjo()
   {
      myName = "Banjo";
      myWeight = 80;
      myAge = 6;
      myFavToy = "Tennis Ball";
      myFavTreat = "Snausages";    
   }
   
   
   //Getter method(s) for Dog_Rough_Collie_Banjo class
   
   public String getName()
   {
      return myName;
   }
   
   public int getWeight()
   {
      return myWeight;
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
      return "\nName: " + myName + "\nWeight (lbs): " + myWeight 
             + "\nAge: " + myAge + "\nFavorite Toy: " + myFavToy 
             + "\nFavorite Treat: " + myFavTreat + "\n";
   } 
      
}