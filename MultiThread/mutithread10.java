class ChildThread1 implements Runnable
{
public void run()

for(int i=1;i<=5;i++)
{
System.out.println("T1:"+i);
}
}
}
class ChildThread2 implements Runnable
{
public void run()

for(int i=1;i<=5;i++)
{
System.out.println("T2:"+i);
}
}
}
class Main
{
public static void main(String args[])
{
ChildThread1=new ChildThread1();
Thread t1=new Thread1(ct);
t1.start();

ChildThread2=new ChildThread2();
Thread t2=new Thread1(ct);
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
for(int i=1;i<=5,i++)
{
System.out.println("Main:"+i);
}
}
}



