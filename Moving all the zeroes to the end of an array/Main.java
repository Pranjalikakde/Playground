import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        a[i]=in.nextInt();
    }
      zeros(n,a);
      for(int i=0;i<=n-1;i++)
      {
        System.out.print(a[i] + " ");
}
    }
  public static void zeros(int n,int a[])
  {
    int c=0;
    for(int i=0;i<=n-1;i++)
    {
      if(a[i] != 0)
      {
        int temp=a[i];
        a[i]=a[c];
        a[c]=temp;
        c++;
      }
      
    }
  }
}