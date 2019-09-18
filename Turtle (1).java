import java.util.*;
import java.awt.*;

/**
 * 
 * Filename: Turtle.java
 * Created by: Nirha Patel, cs8afbdo and Edgar Chavez, cs8afasy
 * Date: 16th October, 2016
 * Prgram Description:
 * RandomTurtleTester: This program runs for 3 turtles. 
 * The first turtle takes two steps by 
 * varying the probability of going to left from -1 to 1.
 * The second turtle takes the maximum number of steps and moves the turtle in random directions. until the maximum number of
 * steps are me by randomly going left or right. It prints the displacement at the end of the steps (7).
 * The third tutrle take in the maximum displacement and displays the total amount of steps to cover that amount of
 * displacement by randomly going either left or right. It displays the number of steps at the end of maximum displacement (6).
 * 
 * RandomTurtleTester2: This code does some analysis on random walks of the turtle without actually moving the turtle.
 * It takes in different probability to go to left and takes in diffferent number of steps to print out the 
 * result of average signed-displacement and average squared displacement for all the different combinitions.  In this program, 
 * the turtle does not move but just displays the result.
 * 
 * Turtle.java: This code is the method code to run the methods in RandomTurtleTester and RandomTurtleTester2. 
 * It defines and initialises the variables. It puts the methods in loop for the number of trials to repeat the method. It creates
 * different public class for different cases to get input and different returns to give some output.
 * 
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 * <p>
 * Copyright Georgia Institute of Technology 2004
 *
 * @author Barb Ericson ericson@cc.gatech.edu
 *         <p>

 */

public class Turtle extends SimpleTurtle {
  public int result = 0;  //Result defined
    ////////////////// constructors ///////////////////////

    /**
     * Constructor that takes the x and y and a picture to
     * draw on
     *
     * @param x       the starting x position
     * @param y       the starting y position
     * @param picture the picture to draw on
     */
    public Turtle(int x, int y, Picture picture) {
        // let the parent constructor handle it
        super(x, y, picture);
    }

    /**
     * Constructor that takes the x and y and a model
     * display to draw it on
     *
     * @param x              the starting x position
     * @param y              the starting y position
     * @param modelDisplayer the thing that displays the model
     */
    public Turtle(int x, int y,
                  ModelDisplay modelDisplayer) {
        // let the parent constructor handle it
        super(x, y, modelDisplayer);
    }

    /**
     * Constructor that takes the model display
     *
     * @param modelDisplay the thing that displays the model
     */
    public Turtle(ModelDisplay modelDisplay) {
        // let the parent constructor handle it
        super(modelDisplay);
    }

    /**
     * Constructor that takes a picture to draw on
     *
     * @param p the picture to draw on
     */
    public Turtle(Picture p) {
        // let the parent constructor handle it
        super(p);
    }

    /////////////////// methods ///////////////////////

    /**
     * Return whether or not the turtle should take a step to the left (-1)
     * or the right (+1)
     * Input: probabilityToLeft, the probability the tutle moving left. Should between 0-1.
     * Returns: -1 to represent a step to the left, 1 to represent a
     * step to the right.
     */
    public int getRandomStep(double probabilityToLeft) {
        Random numGenerator = new Random();   //for the Turtle1 to move first step towards left and second towards right.
        // Choose either 0 or 1 (note that next int is NON inclusive 
        // of its argument).
        double choice = numGenerator.nextDouble();
        if (choice < probabilityToLeft) {
          result--;
          return -1;  //left move
        } else {
          result++;
          return 1;  //right move
        }
    }
    
    public int countSteps(int maxDisplacement) {
    int newresult=0;  //The final result
      while (Math.abs(result)<maxDisplacement){  //This is for the turtle to move until the speicifc amount of displacement is
        //not met in either left or right direction.
      Random numGenerator= new Random();
      double choice = numGenerator.nextDouble();
     if(choice< 0.5) {  //if the choice is less than 0.5, move towards left. if not than move towards right.
        result--;
        takeStep(-1);
      } else {
        result++;
        takeStep(1);
      }
      newresult++;
      }
      
      return newresult;
    
    
    }
    
   
    public void takeStep(int direction)  //This defines the takestep method to move either left by 45 degrees or right by 45 degrees.
 
    {
      if (direction==-1)
      {this.turn(-45);
        this.forward(150);
      this.turn(45);}
      else if (direction==1)
      {this.turn(45);
        this.forward(150);
      this.turn(-45);}
    
    }
    public int rwPosition( int nSteps)  //this method takes the total number of steps. 
      //Till the maximum number of steps is not met, the while loop will go on.the result will show the total displacement after these steps.
    {
      int num = nSteps;
      while(num > 0)
      {takeStep(getRandomStep(.5));
        num--;}
      return result;
    }
    
 public int rwPositionPlain (int nSteps, double probabilityLeft)  //this method is used in RandomTurtleTester2 where the number 
   //of steps and probability to left is to be changed. This method does not consist of takeStep and thus the turtle is not moved.
 {
       int result=0;
       int num = nSteps;
      while(num > 0)
      {
        
        result +=  getRandomStep(probabilityLeft);
        num--;}
      
      
   return result;}
}

        

   

