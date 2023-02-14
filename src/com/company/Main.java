package com.company;
import java.util.*;

class Guesser{
    int guessNum;
    int guessingNum(){
        System.out.println("guesser! guess the number");
        Scanner sc=new Scanner(System.in);
        guessNum=sc.nextInt();
        return guessNum;
    }
}

class Players{
    int guessNum;
    int guessingNum(){
        System.out.println("player! guess the number");
        Scanner sc=new Scanner(System.in);
        guessNum=sc.nextInt();
        return guessNum;
    }
}
class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

   void collectGuesser(){
        Guesser g=new Guesser();
        numFromGuesser=g.guessingNum();
   }
   void collectPlayer(){
       Players p1=new Players();
       Players p2=new Players();
       Players p3=new Players();
       numFromPlayer1=p1.guessingNum();
       numFromPlayer2=p2.guessingNum();
       numFromPlayer3=p3.guessingNum();
   }

   void compare(){
       if(numFromGuesser==numFromPlayer1){
           System.out.println("p1 won");
       }
       else if(numFromGuesser==numFromPlayer2){
           System.out.println("p2 won");
       }
       else if(numFromGuesser==numFromPlayer3){
           System.out.println("p3 won");
       }
       else{
           System.out.println("everyone is loser");
       }

   }


}

public class Main {

    public static void main(String[] args) {
	      Umpire u=new Umpire();
          u.collectGuesser();
          u.collectPlayer();
          u.compare();
    }
}
