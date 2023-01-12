import java.io.*;

class Main
{
public static void main(String args[])
{
FileInputStream fis=null;

try
{
  try
  {
   fis=new FileInputStream(exception11.java);
   int c=fis.read();

   while(c!=-1)
   {
    System.out.println((char)c);
    c=fis.read();
    }
   }
  catch(FileNotFoundException fne)
  {
   System.out.println("file is not found");
   }
   catch(IOException ioe)
   {
   ioe.printStackTrace();
   }
  finally
  {
    try
    {
     if(fis!=null)
     {
     System.out.println("In finally block");
      fis.close();
     }
   }
catch(IOException ioe)
{
System.out.println("catch block in finally block");
   }
  }
 }

}
