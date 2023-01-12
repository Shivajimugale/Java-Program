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
catch(InterruptedException ie)
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
ChildThread ct=new ChildThread();
Thread t1=new Thread(ct);
t1.start();


Thread t2=new Thread(ct);
t2.start();

try
{
t1.join();
t2.join();

}
catch(InterruptedException ie)
{
ie.printStackTrace();
}
for(int i=1;i<=5;i++)
{
System.out.println("Main:"+i);
try
{
Thread.sleep(500);
}
catch(InterruptedException ie)
{
ie.printStackTrace();
}
}
}
}




