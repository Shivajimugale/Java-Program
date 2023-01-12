//write a java program to convert figure to words

import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner in=new Scanner(System.in);
  System.out.println("Enter the number");
  int n=in.nextInt();
  int x=n,y=n;
  int b=x%10,a=y%10;
  String[] single_Digit=new String[]{"zero","one"two"three","four","five",
                                      "six","seven","eight","nine"};
  String[] two_Digits=new String[]{"","ten","eleven","twelve","thirteen","fourteen","fifteen",
                                      "sixteen","seventeen","eighteen","nineteen"};
 String[] tens_multiple=new String[]{"","","twenty","thirty","fourty","fifty","sixty",
                                     "seventy","eighty","ninety"};

if(a==1)
{
System.out.println(two_digits[b+1]);
}
else if (b==0)

System.out.println(tens_multiplies[a]);

else
System.out.println(tens_multiplies[a]+"-"+single_digits[b]);
}
}
