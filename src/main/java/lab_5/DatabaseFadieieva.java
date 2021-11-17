package lab_5;

import java.sql.*;

public class DatabaseFadieieva {
    static final String DB_URL = "jdbc:sqlserver://127.0.0.1:1434;databaseName=DatabasePeople;integratedSecurity=true";

    public static void getTable(String tableName) {
        String sql = "SELECT * FROM "+ tableName;
        try (Connection compound = DriverManager.getConnection(DB_URL);
             Statement application = compound.createStatement();
             ResultSet resultS = application.executeQuery(sql);
        ) {
            while(resultS.next()){
                System.out.println("Name: "+resultS.getString("Name")+"  Surname: "+resultS.getString("Surname")+"  Date of birth: "+resultS.getString("Date of birth"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
