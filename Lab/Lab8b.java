public class Lab8b
{
  public static void main(String [] args)
  {
    
//**** PART B ****
    //This won't work until you finish Part B!
    Student e = new Student();
    e.setName("Aaron Yates");
    e.setGrade(0, 4.0);
    e.setMajor("Bioengineering");
    System.out.println(e);
    System.out.println(e.getName() +
                       " has changed his mind and realized CS is much better");
    e.setMajor("Computer Science");
    System.out.println(e.getName() + " has a new major! It is " + e.getMajor());

    Student s1 = new Student();
    Student s2 = s1;
    s2.setMajor( "Chemistry" ); 
    System.out.println(s1.getMajor());


    
  }
}