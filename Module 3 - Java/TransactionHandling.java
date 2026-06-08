import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionHandling {

    static void transfer(Connection con, int fromId, int toId, double amount) throws Exception {
        con.setAutoCommit(false);

        try {
            PreparedStatement debit = con.prepareStatement(
                    "UPDATE accounts SET balance = balance - ? WHERE id = ?");
            debit.setDouble(1, amount);
            debit.setInt(2, fromId);
            debit.executeUpdate();

            PreparedStatement credit = con.prepareStatement(
                    "UPDATE accounts SET balance = balance + ? WHERE id = ?");
            credit.setDouble(1, amount);
            credit.setInt(2, toId);
            credit.executeUpdate();

            con.commit();
            System.out.println("Transaction Successful");
        } catch (Exception e) {
            con.rollback();
            System.out.println("Transaction Failed");
        }
    }

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankdb",
                    "root",
                    "root"
            );

            transfer(con, 1, 2, 1000);

            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}