/* Lab 1: Created by Ana Murillo. 
 * Practice and explore how declaration and assignments of primitives. 
 * This program will first create two variables to store how many bags and how many boxes we have. Then, it will create three additional different variables: one to store the weight of each box, one to store the weight of each
bag, and one to store the total weight of all our boxes and bags combined. This total weight will be shown on the terminal as a result.
 * 
 */
public class Lab1a
{
  
  public static void main(String[] args)
  {
    
    // Declaration of variables to store:
    // amount of boxes, amount of bags, weight of each bag, 
    // weight of each box and total weight
    int numBoxes = 1;
    int numBags = 2;


    //we have two different weights, both of which we want to use later
    double weight1 = 10.1;
    double weight2 = 5.2;
    double totalWeight = 0.0;
        
    //assignments and operations
    numBoxes = numBags;
    numBags = 3;
    
    
    totalWeight = numBoxes*weight1+numBags*weight2;
    
    // display the combined weight of all our bags and boxes together in two different ways:
    System.out.println("The number of boxes times the weight of the boxes plus the number of bags times the weight of the bags is: ");
    System.out.println(numBoxes*weight1+numBags*weight2);
    System.out.println(totalWeight);


  }
}