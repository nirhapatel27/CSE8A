public class Lab8a
{
  public static void main(String [] args)
  {

//**** PART A ***

    Student a = new Student();
    System.out.println(a);
  
    Student b = new Student("Marshall Mathers");
    System.out.println(b);
  
    double [] grades = new double[3];
    grades[0]=4.0;
    grades[1]=3.5;
    grades[2]=2.5;
    
    Student c = new Student("Jermaine Cole", grades);
    System.out.println(c);
    
    //This part won't work until you complete Part A!
    Student d = new Student("Marcus Hopson", grades, "Computer Science");
    System.out.println(d); 


  


  }
}
