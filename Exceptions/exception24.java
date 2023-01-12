/*throws demonstration*/
import bank.*;

class SBAccount
{
public static void main(String args[])
{
try
{
BankingThirdParty.withdraw();
}
catch(InsufficientFundException ise)
{
System.out.println("Insufficient fund....Try again...");
main(null);
}
}
}
class CurrentAccount
{
public static void main(String args[])
{
try
{
BankingThirdParty.withdraw();
}
catch(InsufficientFundException ise)
{
System.out.println("Enjoy OD facility");
}
}
}