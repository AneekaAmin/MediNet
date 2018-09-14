package app;
import java.sql.*;
/**
 *
 * @author Aneeka
 */
public class SqlBase {
     /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args)throws Exception {
        try {
            String query="select * from rege where id=1";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb/abc","root","aryastark");
            Statement ps=con.createStatement();
            ResultSet rs=ps.executeQuery(query);
            /*ResultSetMetaData m=rs.getMetaData();
            int col=m.getColumnCount();
            while(rs.next()){
                for(int i=0;i<col;i++){
                    System.out.println(rs.getString(i)+"\t");
                }
            }*/
            rs.next();
            String rname=rs.getString(2);
            System.out.println(rname);
            ps.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }
    
}
