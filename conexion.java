
package tarea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexion {
      private static String path;
  private static Connection con;
  
  public static  Connection Open() throws Exception {
      path="jdbc:mysql://localhost:3306/escuela";
      
  try {
    Class.forName("com.mysql.jdbc.Driver");
     if ( con==null || con.isClosed()){
         con=DriverManager.getConnection(path,"root","");
     }

  }catch(ClassNotFoundException | SQLException ex){
      con=null;
  }
  return con;
  
  }
  public static boolean cerrar(){
      try{
          con.close();
          return true;
          
      } catch (SQLException ex ){
          return false;
      }
 }

   
}


