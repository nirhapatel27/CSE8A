/* Filename: RandomTurtleTester.java 
* Created by: Nirha Patel, cs8afbdo and Edgar Chavez, cs8afasy
* Date: 16th October,2016
*/ 
public class RandomTurtleTester {
    //The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args) { 
       //Put all your code to test the random turtle walk here
       World earth = new World(1000,1000);   //World 1 was created
       Turtle t1 = new Turtle(500,1000,earth);  //new turtle was created
        
        t1.takeStep(-1);  // step to left
        t1.takeStep(1);  //step to right
    
    
    World w2 = new World(1000,1000);   //new world created for second turtle
    Turtle t2 = new Turtle (500,1000,w2); 
    System.out.println(t2.rwPosition(7));  // total number of steps defined to 7. the system will print the displacement after 7 steps
     
    World w3= new World(1000,1000);  // new world created for third turtle
    Turtle t3=new Turtle (500,1000,w3);
    System.out.println(t3.countSteps(6));  //total displacement defined to 6. The system will print the total steps to reach this displacement.
    }
}

