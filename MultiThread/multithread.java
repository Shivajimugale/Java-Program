class ChildThread extends Thread
{
public void run()
{
System.out.println("child starts....");

for(int i=1;i<=5;i++)
{
System.out.println("child:"+i);

try
{
sleep(500);
}
catch(InterruptedException  ie)
{
ie.printStackTrace();
}
}
}
}
class Main
{
public static void main(String args[])
{
System.out.println("main starts....");

ChildThread t=new ChildThread();
t.start();

for(int i=1;i<=5;i++)
{
System.out.println("Main:"+i);

try
{
  Thread.sleep(500);
}
catch(InterruptedException  ie)
{
ie.printStackTrace();
}
}
}
}

