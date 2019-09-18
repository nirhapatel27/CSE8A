import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 * <p>
 * Copyright Georgia Institute of Technology 2004
 *
 * @author Barb Ericson ericson@cc.gatech.edu
 *         <p>
 *         <p>
 *         Filename: Turtle.java
 *         Created by: Shuaiqi Xia, cs8a1 and Tony Xia, cs8a2
 *         Date:
 */

public class Turtle extends SimpleTurtle {
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
        Random numGenerator = new Random();
        // Choose either 0 or 1 (note that next int is NON inclusive 
        // of its argument).
        double choice = numGenerator.nextDouble();
        if (choice < probabilityToLeft) {
          return -1;
        } else {
          return 1;
        }
    }
    
    public static void main(String[] args) {
        World earth = new World();
        Turtle t1 = new Turtle(earth);
    }
   
    public int takeStep(int direction)
 
    {
      if (direction==-1)
      {this.turn(-45);
        this.forward(150);
      this.turn(45);}
      else if (direction==1)
      {this.turn(45);
        this.forward(150);
      this.turn(-45);}
    
    return 0;
    }
    public int rwPosition( int nSteps)
    {
     int numsteps = this.getRandomStep;
      this.takeStep(numsteps); 
    }
 
}


        

   

