class ChildThread extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("child:"+i);
try
{
join();
//this.join  ----this means current thread
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

System.out.println("Main..... ends");
//t.stop();

}
}



