import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner (System.in);
      int n1=in.nextInt();
      int fd=n1/10;
      int sd=n1%10;
      int sum=fd+sd;
      System.out.println(sum);
	}
}