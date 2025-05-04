/*
JDBC (Java Database Connectivity):
- JDBC is an API in Java used to connect and interact with relational databases like MySQL, PostgreSQL, SQLite, etc.
- It enables Java applications to execute SQL statements, retrieve results, and manage database connections.

Steps in JDBC Programming:
1. Load the JDBC driver.
2. Establish a connection to the database.
3. Create a statement object to send SQL queries.
4. Execute SQL queries using the statement object.
5. Process the results (if applicable).
6. Close the connection and other resources.

JDBC (Java Database Connectivity)
Steps:
1. Load Driver (modern JDBC skips this if using JDBC 4+)
2. Connect to DB:
   Connection conn = DriverManager.getConnection(url, user, pass);
3. Create Statement:
   Statement stmt = conn.createStatement();
4. Execute Query:
   ResultSet rs = stmt.executeQuery("SELECT * FROM table");
5. Process Results
6. Close connection

Common JDBC Classes & Interfaces:
- DriverManager: Manages database drivers and connections.
- Connection: Interface representing a session with a database.
- Statement / PreparedStatement: Used to send SQL commands to the database.
- ResultSet: Represents the result of a SELECT query.

Note:
- You need the appropriate JDBC driver (JAR file) in your classpath (e.g., MySQL Connector/J).
- Always handle exceptions and close resources in `finally` block or use try-with-resources (Java 7+).
*/

/* Basic Connection to MySQL */

// import java.sql.*;

// public class CSE310_JDBC {
//     public static void main(String[] args) {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             Connection con = DriverManager.getConnection(
//                 "jdbc:mysql://localhost:3306/mydb", "root", "password");
//             System.out.println("Connected to database.");
//             con.close();
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

/* Creating a Table */

// import java.sql.*;

// public class CSE310_JDBC {
//     public static void main(String[] args) {
//         try {
//             Connection con = DriverManager.getConnection(
//                 "jdbc:mysql://localhost:3306/mydb", "root", "password");
//             Statement stmt = con.createStatement();
//             String sql = "CREATE TABLE students (id INT PRIMARY KEY, name VARCHAR(50))";
//             stmt.executeUpdate(sql);
//             System.out.println("Table created.");
//             con.close();
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

/* Inserting Data using PreparedStatement */

// import java.sql.*;

// public class CSE310_JDBC {
//     public static void main(String[] args) {
//         try (Connection con = DriverManager.getConnection(
//                  "jdbc:mysql://localhost:3306/mydb", "root", "password")) {
//             String sql = "INSERT INTO students VALUES (?, ?)";
//             PreparedStatement pstmt = con.prepareStatement(sql);
//             pstmt.setInt(1, 1);
//             pstmt.setString(2, "Alice");
//             pstmt.executeUpdate();
//             System.out.println("Record inserted.");
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

/* Reading Data from Table */

// import java.sql.*;

// public class CSE310_JDBC {
//     public static void main(String[] args) {
//         try (Connection con = DriverManager.getConnection(
//                  "jdbc:mysql://localhost:3306/mydb", "root", "password")) {
//             Statement stmt = con.createStatement();
//             ResultSet rs = stmt.executeQuery("SELECT * FROM students");
//             while (rs.next()) {
//                 System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

/* Updating Data */

// import java.sql.*;

// public class CSE310_JDBC {
//     public static void main(String[] args) {
//         try (Connection con = DriverManager.getConnection(
//                  "jdbc:mysql://localhost:3306/mydb", "root", "password")) {
//             String sql = "UPDATE students SET name = ? WHERE id = ?";
//             PreparedStatement pstmt = con.prepareStatement(sql);
//             pstmt.setString(1, "Bob");
//             pstmt.setInt(2, 1);
//             int rows = pstmt.executeUpdate();
//             System.out.println(rows + " row(s) updated.");
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

/* Deleting Data */

// import java.sql.*;

// public class CSE310_JDBC {
//     public static void main(String[] args) {
//         try (Connection con = DriverManager.getConnection(
//                  "jdbc:mysql://localhost:3306/mydb", "root", "password")) {
//             String sql = "DELETE FROM students WHERE id = ?";
//             PreparedStatement pstmt = con.prepareStatement(sql);
//             pstmt.setInt(1, 1);
//             int rows = pstmt.executeUpdate();
//             System.out.println(rows + " row(s) deleted.");
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }


/* Example 2 */

// import java.sql.*;

// public class CSE310_JDBC {
//     public static void main(String[] args) {
//         try {
//             String url = "jdbc:mysql://localhost/ri_db";
//             String user = "test", pass = "test123";
//             Connection cn = DriverManager.getConnection(url, user, pass);
//             Statement st = cn.createStatement();
            
//             st.executeUpdate("create table Student(roll int, name varchar(10), cgpa int)");
//             System.out.println("Table created: Student");
            
//             st.executeUpdate("insert into Student values(1, 'Amit', 6)");
//             st.executeUpdate("insert into Student values(5, 'Amar', 4)");
//             st.executeUpdate("insert into Student values(2, 'Neha', 5)");
//             System.out.println("Inserted 3 records");
//             st.executeUpdate("delete from Student where roll=1");
//             st.executeUpdate("update Student set cgpa=7 where name='Neha'");
//             System.out.println("updated Neha's CGPA");
            
//             ResultSet rs = st.executeQuery("select * from Student");
//             while (rs.next()) {
//                 System.out.print(rs.getInt(1)); // rs.getInt("roll")
//                 System.out.print("\t"+rs.getString(2)); // rs.getString("name")
//                 System.out.print("\t"+rs.getInt(2)); // rs.getInt("cgpa")
//             }
//             rs.close();
//             st.close();
//             cn.close();
//         } catch (Exception e) {
//             System.out.print("Exception: "+e.getMessage());
//         }
//     }
// }

/* Example 2 */

// import java.sql.*;

// public class CSE310_JDBC{
//     public static void main(String args[]){
//         try{
//             String url = "jdbc:mysql://localhost/ri_db";
//             String user = "test", pass = "test123";
//             Connection cn = DriverManager.getConnection(url, user, pass);
//             Statement st = cn.createStatement();

//             st.executeUpdate("CREATE TABLE student (roll INT PRIMARY KEY, name VARCHAR(20) NOT NULL, class VARCHAR(10), phone VARCHAR(15) NOT NULL UNIQUE)");
//             st.executeUpdate("INSERT INTO student VALUES (1, 'John Doe', '10th', '1234567890')");
//             st.executeUpdate("INSERT INTO student VALUES (2, 'Jane Smith', '10th', '0987654321')");
//             st.executeUpdate("INSERT INTO student VALUES (3, 'Alice Brown', '9th', '1122334455')");
//             st.executeUpdate("INSERT INTO student VALUES (4, 'Bob White', '9th', '5566778899')");
//             st.executeUpdate("INSERT INTO student VALUES (5, 'Charlie Black', '8th', '9988776655')");
            
//             ResultSet rs = st.executeQuery("SELECT * from student");
            
//             while(rs.next()){
//                 System.out.println(rs.getInt(1));
//                 System.out.println(rs.getString(2));
//                 System.out.println(rs.getString(3));
//                 System.out.println(rs.getString(4));
//                 System.out.println("*");
//             }
//             rs.close();
//             st.close();
//             cn.close();
//         } catch(Exception e){
//             System.out.print("Exception: "+e.getMessage());
//         }
//     }
// }