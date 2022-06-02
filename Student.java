
public class Student implements Comparable<Student>
{
    private String name;
    private int grade;
    private double gpa;
    private static int count;
    private int idnum;


    public Student(String name, int grade,double gpa)
    {
        count++;
        this.idnum= count;
        this.name= name;
        this.grade = grade;
        this.gpa = gpa;
    
    }
   
    public String getName()
    {
        return this.name;
    }

    public int getGrade()
    {
        return this.grade;
    }

    public double getGPA()
    {
        return this.gpa;
    }

    public int getIDnum()
    {
        return this.idnum;
    }

    public String toString()
    {
        return "Name:" + "" + " "+ this.getName() + ", " + "Grade:" + " " + this.getGrade() + ", " 
         + "GPA:" + " " + this.getGPA() + " " + "IDnum:" + " " + this.idnum;
    }


    //This is sorting students based on thier grade

    public int compareTo(Student other)
    {
        return other.getGrade() - this.getGrade();
    }

}
