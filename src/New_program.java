import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class New_program {
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class", "root", "");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from cities");
            while (rs.next())
            {
                System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}