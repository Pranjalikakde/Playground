import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int new_num=n;
      int sum=0;
      while(n>0)
      {
        int rem=n%10;
        int f=1;
      for(int c=1;c<=rem;c++)
      {
        f=f*c;
      }
        sum=sum+f;
        n=n/10;
      }
      if(new_num==sum)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      
      
	}
}