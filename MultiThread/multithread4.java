class ChildThread implements Runnable
{
public void run()
{
  for(int i=1;i<=5;i++)
{
System.out.println("child:"+i);
}
System.out.println("child ends");
}
}
class Main
{
public static void main(String args[])
{
ChildThread ct=new ChildThread();
Thread t=new Thread(ct);
t.start();
for(int i=1;i<=5;i++)
{
System.out.println("Main:"+i);
}
t.start();//Illegal ThreadStateException
System.out.println("Main ends");
}
}
