
package projek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver_base {
public static String port="1433",db="projek";
    public static Connection getcon() throws SQLException{
Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:"+port+";databaseName="+db+";integratedSecurity=true;");
return con;
}
    
    
}
