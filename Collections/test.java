abstract class AccountHolder
{
int id;
String name;
String city;
double balance;

AccountHolder (){}

AccountHolder(int id,String name,string city,double balance);
{
this.id=id;
this.name=name;
this.city=city;
this.balance=balance;
}
void show()
{
System.out.println(id);
System.out.println(name);
System.out.println(city);
System.out.println(balance);
}
abstract double intCalc();
abstract double taxCalc(double intrest);
}
class SBAccount extends AccountHolder
{
SBAccount(){}
SBAccount(int id,String name,String city,double balance)
{
super(id,name,city,balance);
}
double intCalc()
{
double intrest=(0.08*balance);
return intrest;
}
double taxCalc(double intrest)
{
double tax=(0.10*intrest);
return tax;
}
class FDAccount extends AccountHolder
{
FDAccount (){}

FDAccount(int id,String name,String city,double balance)
{
super(id,name,city,balance);
}
double intCalc()
{
double intrest=(0.16*balance);
return intrest;
}
double taxCalc(double intrest)
{
double tax=(0.20*intrest);
return tax;
}
}
class Main
{
public static void main(String args[])
{
SBAccount sb=new SBAccount(100,"Scott","London",100000);
sb.show();
double intrest=sb.intCalc();
double tax=sb.taxCalc(intrest);
System.out.println(intrest);
System.out.println(tax);
System.out.println();

FDAccount sb=new SBAccount(200,"John","Newyork",100000);
fd.show();
intrest=sb.intCalc();
tax=sb.taxCalc(intrest);
System.out.println(intrest);
System.out.println(tax);
}
}














