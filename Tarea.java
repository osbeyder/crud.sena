
package tarea;

import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;


public class Tarea {

  
    public static void main(String[] args) {
         Connection con;
         
         try{
             con=(Connection) conexion.Open();
             if (con!=null){
                 JOptionPane.showMessageDialog(null,"conexion exitosa");
             }else{
                 JOptionPane.showMessageDialog(null,"nada mi viejo sigue asi");
             }
         } catch ( Exception e){
            JOptionPane.showMessageDialog(null,e.toString());   
         }
    }
    
    }
    

