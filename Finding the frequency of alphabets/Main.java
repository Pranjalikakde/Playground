import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int len=sb.length();
      int freq[]=new int[70];
      for(int i=0;i<70;i++)
      {
        freq[i]=0;
    }
      for(int i=0;i<len;i++)
      {
        if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')
        {
          int off=sb.charAt(i)-'A';
          char ch=(char)('a'+off);
          sb.setCharAt(i,ch);
        }
        if(sb.charAt(i) >= 'a' && sb.charAt(i) <='z')
        {
          freq[sb.charAt(i)-'a']++;
        }
      }
      for(int i=0;i<len;i++)
      {
        if(freq[sb.charAt(i)-'a']!=0)
        {
          System.out.print(sb.charAt(i)+""+freq[sb.charAt(i)-'a']+" ");
          freq[sb.charAt(i)-'a']=0;
        }
      }
    }
}