 import java.util.*;

public class Main 
{
    public static void main(String [] args)
    {
        System.out.println("-------------------------------------------------------------------------------------------");
        

        System.out.println("-------------------------------------------------------------------------------------------");


        System.out.println("-------------------------------------------------------------------------------------------");

        
        List<Student> studs = new ArrayList<>();
        studs.add(new Student("Nicholas", 65, 3.5));
        studs.add(new Student("Britany", 82, 2.9));
        studs.add(new Student("Aybarinee", 90, 2.4));
        studs.add(new Student("April", 90, 2.8));
        
        Comparator<Student> stu = new Comparator<Student>() 
        {
            public int compare(Student st1, Student st2)
            {
                return st1.getIDnum() - st2.getIDnum();
            }
            
        };

        //This sorts in ascending order
        Collections.sort(studs, stu);
        //This sorts in descending order
        Collections.reverse(studs);
        
        int num = 0;
        for(Student x: studs)
        {
            System.out.println(x);
            if( x.getIDnum() != 0)
                num += 1; 
        }
        System.out.println(num);


    }
} 
