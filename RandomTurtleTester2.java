/* Filename: RandomTurtleTester.java 
*Created by: Nirha Patel, cs8afbdo and Edgar Chavez, cs8afasy
* 
* Date: 16 October,2016
*

*1. and 2, Result 1: Average final signed-displacement for a random walker after making different number of random steps
* |100 random steps|20 random steps|300 random steps
* Average final signed-displacement 
* |0|0|1
* 
* Result 2: Average final signed-displacement for a random walker after making different probability to go left for 100 random steps.
* |0.25 probability to left|0.5 probability to left|0.75 probability to left
* Average final signed-displacement
* |51|0|-49
* 
* Result 3: Average final signed-displacement for a random walker after making different probability to go left for different random steps 
* |0.25 probability to left for 100 random steps|0.5 probability to left for 20 random steps|0.75 probability to left for 300 random steps
* Average final signed-displacement
* |50|0|-151
* 
* Comment on result 1: As the probability is 0.5, the result for the average would be mainly between -1 to 1 as there are 150 trials 
* and there is rare chances of the average being larger than 1 or lesser than -1. There would be no effect of 
* number of steps as it is similar to flipping a coin with 2 choices only. 
* 
* Comment on result 2: The answer would be more positive when the probability is less than 0.5 because the probability to go to 
* left will decrease. When the probability is 0.5, the answer would be zero because we are taking 150 trails and after
* all the average would be 0. When the probability is more than 0.5, then the answer would be negative because 
* there is more probability to go to left than to go to right.
* 
* Comment of result 3: Changing the number of steps would just change the extreme ends of maximum and minimum.
* More the number of steps, more the positive value for the probability which is lesser than 0.5. 
* This is because the positive numbers would add up for all the trials.
* The number of steps would not matter for 0.5 as in result 1. For the probability greater than 0.5, 
* the result would be negative and more the number of steps, more the negative number. 
* this is because the negative numbers would add up for all the trials.
*
*

*3. and 4, average: 
* Result 4: Average final squared-displacement for a random walker after making different probability to go left for 100 random steps.
* |0.25 probability to left|0.5 probability to left|0.75 probability to left
* Average final squared-displacement
* |51|1|50
* 
* Result 5:Average final squared-displacement for a random walker after making different probability to go left for different random steps 
* |0.25 probability to left for 100 random steps|0.5 probability to left for 20 random steps|0.75 probability to left for 300 random steps
* Average final squared-displacement
* |49|1|148
* 
* Comment on result 4: The Answer would be all positive becuase it is squaring the value and then adding. and then taking the square-root.
* The result for probability less than 0.5 and greater than 0.5 would be almost same as it is all positive after squaring. The answer
* for probability of 0.5 would be mostly be through 0 and 1 becuase the probability would just cancel each other out during 150 trials.
* 
* Comment on result 5: The Answer would depend on the number of steps.The answer would be more positive when the probability is less 
* than 0.5 or greater than 0.5. The answers for each trial would just add up resulting in big numbers who would be almost similar to 
* each other. The size of the value would be directly proportional to the number of steps for both the conditions.
* When the probability is 0.5, the answer would be zero because we are taking 150 trails and after
* all the average would be 0.
*/

public class RandomTurtleTester2 {
    private static Turtle t;    
//The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args) { 
       //Put all your code to test the random turtle walk here
      //new world is created
     World w= new World(1000,1000);
     Turtle t= new Turtle (500,1000, w); 
     int numTrials= 0;
     int totalDisplacement=0;
     while (numTrials <150)//the loop would go on till the trial is less than 150
      {totalDisplacement= totalDisplacement+t.rwPositionPlain(100,0.25);   // defining the number of steps and porbability to go to left
      numTrials=numTrials+1;
    }
     int average = totalDisplacement / 150;   // it is divided by the number of trials
     System.out.println(average);   //Prints out the first result with 100 steps and probability to go tot left 0.25
     
     numTrials= 0;
     totalDisplacement=0;
     while (numTrials <150)
      {totalDisplacement= totalDisplacement+t.rwPositionPlain(20,0.5);  // defining the number of steps and porbability to go to left   
      numTrials=numTrials+1;
    }
     average = totalDisplacement / 150;  // it is divided by the number of trials
     System.out.println(average);    //Prints out the first result with 100 steps and probability to go tot left 0.5
     
     numTrials= 0;
     totalDisplacement=0;
     while (numTrials <150)
      {totalDisplacement= totalDisplacement+t.rwPositionPlain(300,0.75);  // defining the number of steps and porbability to go to left
      numTrials=numTrials+1;
    }
     average = totalDisplacement / 150;  // it is divided by the number of trials
     System.out.println(average);  //Prints out the first result with 100 steps and probability to go tot left 0.25
     
     numTrials= 0;
     totalDisplacement=0;
     while (numTrials <150)
      {totalDisplacement= (totalDisplacement+(t.rwPositionPlain(100,0.25))*(t.rwPositionPlain(100,0.25)));  // Finding the square of each 
                                                                                      //total displaceent and adding to the previous one
      numTrials=numTrials+1;
    }
     average = totalDisplacement / 150;
     average = (int)Math.sqrt(average);
     System.out.println(average);
     
     numTrials= 0;
     totalDisplacement=0;
     while (numTrials <150)
      {totalDisplacement= (totalDisplacement+(t.rwPositionPlain(20,0.5))*(t.rwPositionPlain(20,0.5))); //new number of steps and probability to left
      numTrials=numTrials+1;
    }
     average = totalDisplacement / 150;
     average = (int)Math.sqrt(average);
     System.out.println(average);
     
     numTrials= 0;
     totalDisplacement=0;
     while (numTrials <150)
      {totalDisplacement= (totalDisplacement+(t.rwPositionPlain(300,0.75))*(t.rwPositionPlain(300,0.75)));  ////new number of steps and probability to left
      numTrials=numTrials+1;
    }
     average = totalDisplacement / 150;
     average = (int)Math.sqrt(average);
     System.out.println(average);
    }
   }
     


