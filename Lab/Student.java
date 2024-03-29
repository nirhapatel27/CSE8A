 import java.io.*;
import java.util.*;

/**
* Class that describes a student.  A student has a name and an
* array of grades.  You can get information about a student
* such as her/his name and grade average.
*
* @author Barb Ericson ericson@cc.gatech.edu
*/
public class Student
{

  //////////// fields //////////////////
  /** the name of the student: first last */
  private String name;

  /** an array of grades for this student */
  private double[] gradeArray;

  //////////// constructors ///////////
private String major;
  /**
   * No argument constructor.  Leaves
   * all fields with default values
   */
  public Student() {
    this.name = "Joe Student";
    this.gradeArray = new double[10];
    this.major="Undecided";
  }

  /**
   * Constructor that takes the name
   * @param theName the student's name
   */
  public Student(String theName)
  {
    this.name = theName;
    this.gradeArray = new double[10];
    this.major="Undecided";
  }

  /**
   * Constructor that takes the name
   * and an array of grades
   * @param theName the student's name
   * @param theGradeArray the array of grades
   */
  public Student(String theName,
                 double[] theGradeArray)
  {
    this.name = theName;
    this.gradeArray = theGradeArray;
    this.major="Undecided";
  }

   public Student(String theName,
                 double[] theGradeArray, String theMajor)
  {
    this.name = theName;
    this.gradeArray = theGradeArray;
    this.major=theMajor;
  }
/////////// methods ///////////////

  /**
   * Method to return the name of this student
   * @return the student's name
   */
  public String getName() { return this.name; }

  /**
   * Method to set the name for this student
   * @param theName the new name to use
   * @return true if success else false
   */
  public void setName(String theName)
  {
    this.name = theName;
  }
  /**
   * Method to get the grade in the grade array
   * at the passed index
   * @param index the index that we want the grade for
   * @return the grade in the grade array at this passed index
   */
  public String getMajor() { return this.major; }

  /**
   * Method to set the name for this student
   * @param theName the new name to use
   * @return true if success else false
   */
  public void setMajor(String theMajor)
  {
    this.major = theMajor;
  }
  public double getGrade(int index)
  {
    return this.gradeArray[index];
  }

  /**
   * Method to replace the array of grades
   * @param theArray the new array of grades to use
   * @return true if sucess, else false
   */
  public void setGradeArray(double[] theArray)
  {
    this.gradeArray = theArray;
  }

  /**
   * Method to set a grade at an index
   * @param index the index to set it at
   * @param newGrade the grade to use
   * @return true if success else false
   */
  public void setGrade(int index,
                          double newGrade)
  {
    this.gradeArray[index] = newGrade;
  }

  
  /**
   * Method to return a string with information about this student
   * @return a string with information about the student
   */  public String toString()
  {
    return "Student object named: " + this.name +
           " Average: " + this.getAverage() +
      " Major: " + this.major;
  }

  
/***********PART B STARTS HERE**************/
  /**
   * Method to return the average of the grades for this student
   * @return the average of the grades or 0.0 if no grade array or
   * no grades
   */
   public int numGrade()
   {
     return gradeArray.length;
   }
  public void addGrade (double newGrade)
  {
    double [] newGrades= new double [numGrade()+1];
    for (int i=0;i<numGrade();i++)
    {
      newGrades[i]=gradeArray[i];
    }
   newGrades[numGrade()]=newGrade;
   gradeArray=newGrades;
  }
  
  public double getAverage()
  {
    double average = 0.0;
  
    double sum = 0.0;
    for (int i = 0; i < this.gradeArray.length; i++)
    {
      sum = sum + this.gradeArray[i];
    }
    average = sum / this.gradeArray.length;
    return average;
  }
}