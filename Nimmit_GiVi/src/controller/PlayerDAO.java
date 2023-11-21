package controller;
import java.sql.*;
import model.Player;
public class PlayerDAO {
    public PlayerDAO() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/nimmitgivi", "givi", "givi");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from player");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    
}
