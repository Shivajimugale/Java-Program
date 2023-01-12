import java.sql.*;
class Main
{
    public static void main(String args[])
   {
     int count=0;
      try
       {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/msql?useSSL=false","root","root");
         PreparedStatement pstmt=conn.prepareStatement("UPDATE emp set deptno=? where empno=?");
         pstmt.setInt(1,3000);
         pstmt.setInt(2,4);
         count=pstmt.executeUpdate();
         pstmt.close();
         conn.close();
         

       }
      catch(ClassNotFoundException  cne)
      {
        cne.printStackTrace();
      }
      catch(SQLException  sqe)
      {
        sqe.printStackTrace();
      }
     System.out.println(count+" records updated !!!");

   }

}


  
