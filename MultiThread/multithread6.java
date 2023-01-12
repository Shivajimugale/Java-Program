class ChildThread extends Thread
{
ChildThread(){}

ChildThread(String name)
{
super(name);
}
public void run()
{
System.out.println(getName());
setName("MyChild");
System.out.println(getName());
System.out.println(getPriority());
setPriority(10);
System.out.println(getPriority());
System.out.println(isAlive());
}
}
class Main
{
public static void main(String args[])
{
ChildThread t=new ChildThread("myChildThread");
t.start();
try
{
Thread.sleep(500);
}
catch(InterruptedException ie)
{
ie.printStackTrace();
}
System.out.println("child"+t.isAlive());
System.out.println(Thread.currentThread().isAlive());
System.out.println(Thread.currentThread());
Thread.currentThread().setName("My Main Thread");
Thread.currentThread().setPriority(10);
System.out.println(Thread.currentThread());
}
}
