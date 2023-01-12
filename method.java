class Interestcalculation
{

double iRate;

InterestCalculation()
{
this(3.0);
}

InterestCalculation(double interestRate)
{
System.out.println("Welcome customer....");
System.out.println("The rate of interest is  : "+intrestRate+"%");
iRate=interestRate/100;
}
double calculateInterest(double amount)
{
return(amount*iRate);
}
}
class Main
{
public static void main(String args[])
{
interestcalculation ic=new Interestcalculation();
double interestAmount=ic.calculationIntrest(100000);
System.out.println(interestAmount);
System.out.println();

interestcalculation ic1=new Interestcalculation(10.0);
interestAmount=ic1.calculationInterest(100000);
System.out.println(interestAmount);
}
}