import java.sql.*;
class Main
{
    public static void main(String args[])
   {
      Scanner in= new Scanner(System.in);
      System.out.println("Enter empId :");
      int empno=in.nextInt();
      System.out.println("Enter ename:");
      String ename=in.next();
      try
       {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/msql?useSSL=false","root","root");
         PreparedStatement pstmt=conn.prepareStatement("Insert into emp (empno,ename)values(?,?)");
         pstmt.setInt(1,eno);
         pstmt.setInt(1,ename);
         pstmt.executeUpdate();
         pstmt.close();

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


  