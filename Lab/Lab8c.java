public class Lab8c
{
  public static void main(String [] args)
  {
    //**** PART C ****
    double [] grades = new double[3];
    grades[0] = 4.0;
    grades[1] = 4.0;
    grades[2] = 3.0;
    Student student = new Student("Ryan Montgomery", grades, "Linguistics");
    
    System.out.println(student);
    
    //This won't work until you finish Part C!
    student.addGrade(2.5);
    
    System.out.println(student);
    
    student.addGrade(1.0);
    
    System.out.println(student);
  }
  
}