import java.sql.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Exam extends TreeSet implements Comparator <Integer>
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> obj = new TreeSet();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itest", "root", "");
        PreparedStatement ps = con.prepareStatement("insert into info values(?)");
        for (int i = 1; i <= 5; i++)
        {
            String s = sc.next();
            if (s.matches("[+91|91]?[0-9]{12}||[0-9]{10}")) {
                obj.add(s);
                ps.setString(1, s);
                ps.executeUpdate();
            } else
                System.out.println("invalid phoneno");
        }
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("SELECT * from info");
        while (rs.next()) {
            System.out.println(rs.getString(1));
        }

    }
    @Override
    public int compare(Integer o1, Integer o2)
    {
        if(o1>o2)
        {
            return -1;
        }
        else if (o1<o2)
        {
            return 1;
        }
        else
            return 0;
    }
}


