/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segovia_3_strings;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author TheInnerNerd
 */
public class Segovia_3_Strings {
static boolean playagain;
static Scanner sc = new Scanner(System.in);
static Random rand = new Random();
static int counter = 5;
   
    public static void main(String[] args) {
        playagain = true;
      System.out.println("what is your name??");
      String name = sc.nextLine();
      while (counter > 0){
      System.out.println("Okay " + name + ", guess a number from 0 to 100!" + " you have " + counter + " guesses left!");
       // runs aslong the condition statement is true
           playthegame(); 
           
           if (counter == 1){
               System.out.println("you lose >:(");
               playagain = false;
               
           }
           counter--;
      }
       
   }
static void playthegame(){
       int guess = sc.nextInt();
       int number = rand.nextInt(101);
       if (guess > 100){
           System.out.println("I said between 0 and 100 idiot >:(");
       }
       else{
           if(guess == number){
               System.out.println("You're right it was "+ guess +"!" + "GREAT JOB!!!");
            playagain = false;
           }
            else{
           if(guess > number){
            System.out.println("Sorry you guessed too high! you guessed " + guess  + " and it was " + number + "!");
           }
           else{
             System.out.println("Sorry you guessed too low! you guessed " + guess + " and it was " + number + "!");
               }
              }  
            }
       }
}
