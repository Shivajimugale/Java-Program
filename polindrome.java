class Polindrome
{
public static void main(String args[])
{
String X="abcdedcba";
int i=0,j=X.length()-1;

while(i<j)
{
if (X.charAt(i)!=X.charAt(j))
{
System.out.println("not polindrome");
}
i++;
j--;
}
System.out.println("polindrome");
}
}

