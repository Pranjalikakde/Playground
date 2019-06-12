import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in  = new Scanner(System.in);
        // Get the n value
	    int n = in.nextInt();
      int val=n;
	    for(int curr_row = 1; curr_row <= n; curr_row++)
	    {
            // Handle space for each row
	        for(int space = val; space >=1; space--)
	        {
	            System.out.print(space);
	        }
            val--;
	        System.out.println();
	    }
	}
}
	