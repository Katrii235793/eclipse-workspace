package world;
class Student1
{        
    int rollno;        
    String name;        
    static String college = "ITS";        //static method to change the value of static variable        
    static void change()
    {       
        college = "MCET";        
    }       
    //constructor to initialize the variable        
    Student1(int r, String n)
    {        
        rollno = r;        
        name = n;        
    }  
    //method to display values        
    void display()
    {
        System.out.println(rollno+" "+name+" "+college);
    }
}
public class student {
  public static void main(String[] args) {
        // TODO Auto-generated method stub
         Student1.change();//calling change method      
         //creating objects      
         Student1 s1 = new Student1(07,"katrii");      
         Student1 s2 = new Student1(23,"aadhu");       
         Student1 s3 = new Student1(21,"sreelu");      
         //calling display method    
         s1.display();     
         s2.display();     
         s3.display();

  }
}