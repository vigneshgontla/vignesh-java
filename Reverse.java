import java.util.Scanner;
public class Reverse{
public static void main(String[] args)
{
  System.out.println("Enter an string");
  Scanner s=new Scanner(System.in);
  String n=s.nextLine();
  int x;
  int i;
  x=n.length();
  System.out.println("The resultant string");
  for(i=(x-1);i>-1;i--)
     {
        System.out.print(n.charAt(i));
     }
}
}
