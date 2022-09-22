/**

Jack Schumacher
AP CS A
Orange (5)
Chapter 2- String Methods
Programming Assignment 2
September 2022

This program uses string methods in order to Create MASD emails.
*/


import java.util.Scanner;
class Main {
  // Have the user input thier first and last name - assign String variables for both the first and last name of the users
  public static void main(String[] args) { 
  Scanner input = new Scanner(System.in);
  System.out.println("Please enter your first name");
  String firstName = input.nextLine();
  System.out.println("Ok!, your first name is:"+ firstName);
  System.out.println("Please enter your last name");
  String lastName = input.nextLine();
  System.out.println("Ok!, your last name is:")

  if(firstName.length() < 4){
    firstName = firstName.substring(0);
  else{
    firstName = firstName.substring(0,4);
  }
    
    
  }
  
  
   
  }
}