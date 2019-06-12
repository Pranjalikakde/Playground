import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int new_num=n;
      int count=0;
      if(n==0)
      {
        System.out.println(n);
      }
      else
      {
        while(n>0)
        {
          count++;
          n=n/10;
        }
      }
      n=new_num;
      int sum=0;
      int pow=1;
      while(n>0)
      {
        int rem=n%10;
        for(int ncount=1;ncount<=count;ncount++)
        {
          pow=pow*rem;
        }
        sum=sum+pow;
        pow=1;
        n=n/10;
      }
      if(sum==new_num)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}