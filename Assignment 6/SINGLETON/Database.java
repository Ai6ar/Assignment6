package SINGLETON;

import java.sql.*;

public class Database {
        private static Database instance;
        private Connection connection;

        private Database() throws SQLException {
            String connectionString = "jdbc:postgresql://localhost:5432/test";
            String user = "postgresql";
            String password = "1234567";

            try {
                Class.forName("org.postgresql.Driver");
                this.connection = DriverManager.getConnection(connectionString, user, password);
            }
            catch (ClassNotFoundException ex) {
                System.out.println("Database connection creation failed : " + ex.getMessage());
            }
        }

        public Connection getConnection() {
            return connection;
        }

        public static Database getInstance() throws SQLException {
        if (instance == null) {
            instance = new Database();
        } else if (instance.getConnection().isClosed()) {
            instance = new Database();
        }
        return getInstance();
    }

        public ResultSet query(PreparedStatement query) {
            ResultSet t = null;
            try {
                t = query.executeQuery();
            } catch (SQLException ex) {
                System.out.println("Database query failed : " + ex.getMessage());
            }
            return t;
        }
    }

