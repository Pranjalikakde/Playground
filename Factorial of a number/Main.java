import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int f=1;
      for(int c=1;c<=n;c++)
      {
        f=f*c;
      }
      System.out.println(f);
	}
}