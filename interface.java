interface Test
{
double PI=3.142;

void test();

static void show()
{
System.out.println("show");
}
}
class Main
{
public static void main(String args[])
{
Test.show();
}
}
