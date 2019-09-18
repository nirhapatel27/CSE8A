/* MAKE SURE YOU UPDATE THESE COMMENTS WITH YOUR OWN INFORMATION
 * (And then remove this top instructional comment)
 * File Name: DrawMyName.java
 * Created by:  Nirha Patel, cs8afbdo and Edgar Chavez, cs8afasy
 * Due Date:    Oct 4th, 2016
 *
 */
import java.awt.Color;
public class DrawMyName
{
    // The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args)
    {
     
      World w = new World();
      Turtle jose = new Turtle(100,102,w); //Creates a turtle in w at (x,y) (100,102)     

      jose.setPenWidth(3);   //Pen width changed because it is the first letter
      jose.moveTo(100,102);   //Starting place of the turtle. starting at the bottom of the N
      jose.forward(42);
      jose.turn(135);      //Start of second line of N.
      jose.forward(57);
      jose.turn(-135);
      jose.forward(42);   //Third line input. N was completed
      jose.penUp();
      jose.moveTo(157,60);  //moved to new position at the top of I.
      jose.penDown();     // Letter I started
      jose.setPenWidth(1);  //pen width changed for all the letters except the first letter N
      jose.setPenColor(Color.red);
      jose.turnRight();
      jose.forward(30);
      jose.penUp();
      jose.moveTo(172,60);
      jose.penDown();   //top line of letter I completed.
      jose.turnRight();
      jose.forward(40);   //mid line of letter I completed
      jose.turnRight();
      jose.forward(15);
      jose.turn(180);
      jose.forward(30);    //bottom line of letter I completed. Letter I got completed
      jose.penUp();
      jose.moveTo(207,100);   //position of letter R.
      jose.penDown();     // start of letter R.
      jose.setPenColor(Color.black);
      jose.turnLeft();
      jose.forward(40);   //left line of R completed.
      jose.turnRight();
      jose.forward(30);
      jose.turnRight();
      jose.forward(20);
      jose.turnRight();
      jose.forward(30);   //the top loop of letter R got completed.
      jose.turn(-145);
      jose.forward(36);     //the slant line of R was completed. R was completed
      jose.penUp();
      jose.moveTo(257,100);  //position of letter H
      jose.penDown();    //start of letter H
      jose.setPenColor(Color.yellow);
      jose.turn(-125);
      jose.forward(40);  //left line of letter H completed
      jose.penUp();
      jose.moveTo(257,80);
      jose.penDown();
      jose.turnRight();
      jose.forward(30);   //middle line of letter H completed.
      jose.turnLeft();
      jose.forward(20);
      jose.turn(180);
      jose.forward(40);    //right vertical line of letter H completed. H got completed
      jose.penUp();
      jose.moveTo(307,100);   //position of letter A.
      jose.penDown();     // start of letter A.
      jose.setPenColor(Color.blue);
      jose.turn(-155);
      jose.forward(46);    //first slant line of letter A completed.
      jose.turn(136);
      jose.forward(44);   // second slant line of letter A completed
      jose.penUp();
      jose.moveTo(332,85);
      jose.penDown();
      jose.turn(111);
      jose.forward(18);    //middle line of A got completed. A got completed
      jose.hide();
    }
}
