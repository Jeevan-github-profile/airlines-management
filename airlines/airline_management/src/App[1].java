import java.sql.*; 
class App {
public static void main(String args[]) {
String url = "jdbc:mysql://localhost:3306/";
String dbName = "airline_management_system";
String driver = "com.mysql.cj.jdbc.Driver";
String userName = "root";
String dbpassword = "guru123";
try {
// loading driver
Class.forName(driver);
// Connection set up with database named as user
Connection c = DriverManager.getConnection(url+dbName,userName,dbpassword);
// Creating statement for the connection to use sql queries
Statement st = c.createStatement();
// Executing sql query using the created statement over the table user_details located in the database pointing by the dsn
ResultSet rs = st.executeQuery("SELECT * from customer");
// Accessing the result of query execution
String out="";

while(rs.next())
{
System.out.println(rs.getInt("flight_code"));
}
//new LabelExample(out);  
System.out.println(out);
// Closing the statement and connection
st.close();
c.close();
}
catch (Exception e) {
System.out.println(e);
}
}
}