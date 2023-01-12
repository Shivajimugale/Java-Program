import java.sql.*;
class Main
{
    public static void main(String args[])
   {
      try
       {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/msql?useSSL=false","root","root");
         Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery("Select * from emp");

         while(rs.next())
         {
          int empno=rs.getInt(1);
          String name=rs.getString(2);
          int deptno=rs.getInt(3);

          System.out.println("Empno:"+ empno);
          System.out.println("name:"+ name);
          System.out.println("deptno:"+ deptno);
          System.out.println();

          }
         con.close();
       }
      catch(ClassNotFoundException  e)
      {
        e.printStackTrace();
      }
      catch(SQLException  e)
      {
        e.printStackTrace();
      }

   }

}


  