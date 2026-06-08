import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class StudentDAO {
    Connection con;

    StudentDAO() throws Exception {
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "root"
        );
    }

    void insertStudent(int id, String name) throws Exception {
        String query = "INSERT INTO students VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.executeUpdate();
    }

    void updateStudent(int id, String name) throws Exception {
        String query = "UPDATE students SET name = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, name);
        ps.setInt(2, id);
        ps.executeUpdate();
    }
}

public class JDBCOperations {
    public static void main(String[] args) {
        try {
            StudentDAO dao = new StudentDAO();

            dao.insertStudent(101, "Nithish");
            dao.updateStudent(101, "Nithish Kumar");

            System.out.println("Record inserted and updated");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}