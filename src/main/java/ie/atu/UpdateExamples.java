package ie.atu;

import java.sql.*;

public class UpdateExamples {
    public static void main(String[] args) {
        String updateSQL = "UPDATE users SET password = 'newpassword' WHERE username = 'Des'";

        try (Connection connection = DatabaseUtils.getConnection();
             Statement statement = connection.createStatement()) {
            int rowsUpdated = statement.executeUpdate(updateSQL);
            System.out.println("Rows updated: " + rowsUpdated);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
