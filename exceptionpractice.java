import java.util.Scanner;

public class exceptionpractice
{
	public static void main(String[] args) 
	{
	    
	    Scanner scanner = new Scanner(System.in);
	    int choice = scanner.nextInt();
	    
	    String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "accessories"};
	    
	    //complete the code
	    try 
        {
            for(int x=0; x<categories.length; x++)
                System.out.println(categories[x]);
	        
	    } 
        catch(IndexOutOfBoundsException i) 
        {
	        System.out.println("Wrong Option");
	    }
	}
}