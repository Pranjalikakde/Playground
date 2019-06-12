import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    int fd=n1/100;
    int sd=(n1/10)%10;
    int ld=n1%10;
    int reverse=ld*100+sd*10+fd;
    System.out.println(reverse);
  }
}