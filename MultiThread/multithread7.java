class ChildThread implements Runnable
{
public void run()
{

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
ChildThread ct =new ChildThread();
Thread t=new Thread(ct);
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
if(i<=1)
{
try
{
t.join();
}
catch(InterruptedException ie)
{
ie.printStackTrace();
}
}
}
}
}




