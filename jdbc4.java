import java.util.Scanner;
import java.sql.*;
class Main
{
    public static void main(String args[])
   {
      int empno=0;
      int count=0;
      Scanner in= new Scanner(System.in);
      System.out.println("Enter empno :");
      int empno=in.nextInt();

      try
       {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/msql?useSSL=false","root","root");
         PreparedStatement pstmt=conn.prepareStatement("delete from emp where empno=?");
         pstmt.setInt(1,empno);
         pstmt.executeUpdate();
         pstmt.close();
         
         conn.close();

      }
      catch(ClassNotFoundException  e)
      {
        e.printStackTrace();
      }
      catch(SQLException  e)
      {
        e.printStackTrace();
      }
      if(count>0)
      {
      System .out.println(count +"record deleted successfully");
      }
      else
     {
     System.out.println("record not found!!");
     }

   }

}


  