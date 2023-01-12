class ChildThread implements Runnable 
{
public void run()
{
System.out.println("child starts....");

for(int i=1;i<=5;i++)
{
System.out.println("child:"+i);

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
class Main
{
public static void main(String args[])
{
ChildThread obj=new ChildThread();

Thread t=new Thread(obj);
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

