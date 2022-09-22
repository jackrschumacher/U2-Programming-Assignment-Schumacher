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
  System.out.println("Please enter your first name: ");
  String firstName = input.nextLine();
  System.out.println("Ok!, your first name is:"+ firstName);
  System.out.println("Please enter your last name: ");
  String lastName = input.nextLine();
  System.out.println("Ok!, your last name is:");

  // If first name length is less than 4, take the length of the existing name, if not use the first 4 letters
  if(firstName.length() < 4){
    firstName = firstName.substring(0);
  }
  else {
    firstName = firstName.substring(0,4);
  }
  // If last name length is less than 4, take length of existing name, if not use first 4 letters
  if(lastName.length() < 4){
    lastName = lastName.substring(0);
  }
  else{
    lastName = lastName.substring(0,4);
  }

  // 
  System.out.println("Your MASD email adress is: "+lastName.toLowerCase()+firstName.toLowerCase()+"@stu.masd.k12.wi.us");
  
  
   
  }
}