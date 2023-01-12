import java.sql.*;
import java.util.Scanner;

class Main
{
    public static void main(String args[])
   {
      int count=0;
      Connectin con=null;
      PreparedStatement pstmt=null;
      Scanner in= new Scanner(System.in);
      int empno=0;
      

      try
       {
         System.out.println("Enter  the empno:");
         empno=in.nextInt();
         Class.forName("com.mysql.cj.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/msql?useSSL=false","root","root");
         con.setAutoCommit(false);
         pstmt=con.prepareStatement("Delete from emp where empno=?");
         pstmt.setInt(1,empno);
         count=pstmt.executeUpdate();

      if(count>0)
      {
      System .out.println(count +"record deleted ");
      System.out.println("Do you want to rollback? y/n");
      char c=in.next().charAt(0);
      
      if((c=='Y')||(c=='y'))
      {
       con.rollback();
       System.out.println("congrats,rollback successfully!!");
      }

      else
     {
     con.commit;
     System.out.println("Dtabase committed!!");
     }
      pstmt.close();
      con.close();
     }
     else
     {
      System.out.println("record not found!!!");
      }
      }
     catch(ClassNotFoundException e)
     {
      e.printStackTrace();
      }
      catch(SQLException e)
      {
       e.printStackTrace();
       }
     }
 }
      


  