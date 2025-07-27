import java.sql.*;

public class Conn{
    private static final String url="jdbc:mysql://localhost:3306/el_diablo";
    private static final String username="root";
    private static final String password="loveneet@123";
    public Connection connection;
    public Statement statement;

    public  Conn() throws Exception {
        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            try {
                connection = DriverManager.getConnection(url, username, password);
                statement = connection.createStatement();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}