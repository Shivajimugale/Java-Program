interface x
{
int i=10;
}
interface y
{
int i=100;
}
class xy implements x,y
{
void show()
{
System.out.println(i);
}
}
