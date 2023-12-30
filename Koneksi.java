
package projekdhandiadam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Koneksi {
    private static Connection koneksi;
    
    
    
    public static Connection getKoneksi(){
    
        if(koneksi == null){
            try{
                String url = "jdbc:mysql://localhost:3306/kasirteknik";
                String user = "root";
                String password = "Dhandi085464";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url,user,password);
                System.out.println("Berhasil");
            }catch (Exception e){
                System.out.println("Eror");
            }
        
        }
        return koneksi;
    
    }
    
    public static void main(String args[]){
        getKoneksi();
    }
    
    
    
}
