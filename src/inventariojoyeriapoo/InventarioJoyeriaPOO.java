/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventariojoyeriapoo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Eda Nolasco
 * Nohemi Ramos
 * Sara Reyna
 */
public class InventarioJoyeriaPOO {
    /**
     * @param args the command line arguments
     */
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        //PRuebaFrame FM = new PRuebaFrame()
        //FM.setVisible(true);

        InicioSesion IS = new InicioSesion();
        IS.setVisible(true);
        
        testMySQLDriver();
        try{
            String url = "jdbc:mysql://localhost:3306/Inventario_Joyeria";
            String username = "root";
            String password = "Lechedefresa";
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Inventario");
            System.out.println("------------------------------------------------------------");
            
            while(rs.next()){
                String ID_Pr = rs.getString("ID_Pr");
                String productos = rs.getString("Productos");
                String precio = rs.getString("Precio");
                String stock = rs.getString("Stock");

                
                System.out.println("Registro :" +ID_Pr+ " " +productos+ " "+precio+ " "+stock);
                
            }
            rs.close();
            statement.close();
            connection.close();
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
      
    }
    
    private static void testMySQLDriver(){
          try{
              Class.forName("con.mysql.cj.jdbc.Driver");
          }catch(ClassNotFoundException ex){
              System.out.println("Error no se ha podido cargar el driver jdbc :c");
          }    
    }
    
    
}
