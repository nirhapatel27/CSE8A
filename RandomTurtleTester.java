/* Filename: RandomTurtleTester.java 
* Created by: Shuaiqi Xia, cs8a1 and Tony Xia, cs8a2
* Date: 
*/ 
public class RandomTurtleTester {
    //The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args) { 
       //Put all your code to test the random turtle walk here
       World earth = new World(1000,1000);
       Turtle t1 = new Turtle(500,1000,earth);
        
        t1.takeStep(-1);
        t1.takeStep(1);
    
    
    World w = new World(1000,1000); 
    Turtle t2 = new Turtle (500,1000,w); 
    t2.rwPosition(6); 
    }
}

