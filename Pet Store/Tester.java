/**
*Tester for Pet Store project
*
*@author Luis Pena
*@version   (03/26/2022)
*
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Tester
{

   public static void main(String [] args)
   {
      
      //Instantiatin variables
      
      String userChoice = "";
      
      
      //Instantiating Scanner menu object
      
      Scanner menuChoices = new Scanner(System.in);
      
      
      //Instantiating ArrayList of Pet objects
      
      ArrayList<Pet> myPetStore = new ArrayList<Pet>();
         myPetStore.add(new Dog_Corgi());
         myPetStore.add(new Dog_Rough_Collie());
         myPetStore.add(new Dog_Rough_Collie_Banjo());
         myPetStore.add(new Cat_Maine_Coon());
         myPetStore.add(new Cat_American_Shorthair());
         myPetStore.add(new Cat_American_Shorthair_Oliver());
         myPetStore.add(new Rabbit_Mini_Lop());
         myPetStore.add(new Rabbit_Dutch());
         myPetStore.add(new Rabbit_Dutch_Diana());
       
       
       //Instantiating ArrayList for incoming pets output
       
       ArrayList<String> incomingPets = new ArrayList<String>();
       
       Cat_Maine_Coon calcifer = new Cat_Maine_Coon();
       Cat_American_Shorthair cayde = new Cat_American_Shorthair();
       Dog_Rough_Collie wendy = new Dog_Rough_Collie();
       Dog_Corgi charlie = new Dog_Corgi();
       
       
       //compareTo method to lexographically list each cat breed
             
       if(calcifer.compareTo(cayde) < 0)
       {
         incomingPets.add(calcifer.getBreed());
         incomingPets.add(cayde.getBreed());
       }
       
       else
       {
         incomingPets.add(cayde.getBreed());
         incomingPets.add(calcifer.getBreed());
       }
       
       
       //compareTo method to lexographically list each dog breed
       
       if(wendy.compareTo(charlie) < 0)
       {
         incomingPets.add(wendy.getBreed());
         incomingPets.add(charlie.getBreed());
       }
       
       else
       {
         incomingPets.add(charlie.getBreed());
         incomingPets.add(wendy.getBreed());
       }
       
       
       //Pet Store U.I. header
       
       System.out.println("Welcome to the Good Boys Pet store!");

       
       //Pet Store main menu
       
       System.out.println("\n\nPlease select the type of animal you "
                          + "wish to see:" + "\n\n1 - Dogs" + "\n2 - Cats"
                          + "\n3 - Rabbits" + "\n4 - Incoming Animals"
                          + "\nQ - Quit\n");
                           
       userChoice = menuChoices.nextLine();
       
       if(userChoice.equalsIgnoreCase("Q"))
       {
         System.out.println("\nThank you and have a wonderful day!");
         
         System.exit(0);
       }
       
       
       //Dog menu U.I.
         
       else if(userChoice.equals("1"))
       {  
          System.out.println("\nPlease select a breed:" + "\n\n1 - Corgi"
                               + "\n2 - Rough Collie\n");
          
          userChoice = menuChoices.nextLine();
          
          if(userChoice.equals("1"))
          {
            System.out.println(myPetStore.get(0).toString());
          }
          
          if(userChoice.equals("2"))
          {
            System.out.println(myPetStore.get(1).toString());
            
            System.out.println("-= Available Collies =- ");
            
            System.out.println(myPetStore.get(2).toString());
          }                       
       }
       
       
       //Cat menu U.I.
       
       else if(userChoice.equals("2"))
       {
          System.out.println("\nPlease select a breed:" + "\n\n1 - Maine Coon"
                               + "\n2 - American Shorthair\n");
          
          userChoice = menuChoices.nextLine();
          
          if(userChoice.equals("1"))
          {
            System.out.println(myPetStore.get(3).toString());
          }
          
          if(userChoice.equals("2"))
          {
            System.out.println(myPetStore.get(4).toString());
          
            System.out.println("-= Available American Shorthairs =- ");
            
            System.out.println(myPetStore.get(5).toString());
          
          }                       
       }
       
       
       //Rabbit menu U.I.
       
       else if(userChoice.equals("3"))
       {
          System.out.println("\nPlease select a breed:" + "\n\n1 - Mini Lop"
                               + "\n2 - Dutch\n");
          
          userChoice = menuChoices.nextLine();
          
          if(userChoice.equals("1"))
          {
            System.out.println(myPetStore.get(6).toString());
          }
          
          if(userChoice.equals("2"))
          {
            System.out.println(myPetStore.get(7).toString());
          
            System.out.println("-= Available Dutch Rabbits =- ");
            
            System.out.println(myPetStore.get(8).toString());
          
          }                       
       }
       
       
       //Incoming animals data output for compareTo method
       
        else if(userChoice.equals("4"))
       {  
          System.out.println("\n-= Incoming Pets (Available Soon) =-\n");
          
          System.out.println("\nCats -\n");
          
          System.out.println(incomingPets.get(0) + "\n"
                            + incomingPets.get(1)); 
                            
          System.out.println("\nDogs -\n");
          
          System.out.println(incomingPets.get(2) + "\n"
                            + incomingPets.get(3));                
       }
   }
}