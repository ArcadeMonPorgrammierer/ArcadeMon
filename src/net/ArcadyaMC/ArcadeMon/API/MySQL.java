package net.ArcadyaMC.ArcadeMon.API;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class MySQL {
	
	private String HOSTNAME;
	private String USERNAME;
	private String PASSWORD;
	private String DATABASE;
	private int PORT;
	
	private boolean enableMySQL;
	
	private Connection con;
	
	private ConfigFile MySQLConfiguration;
	
	public MySQL(String database, boolean instandConnect) {
		HOSTNAME = MySQLConfiguration.getString("hostname");
		USERNAME = MySQLConfiguration.getString("username");
		PASSWORD = MySQLConfiguration.getString("password");
		DATABASE = MySQLConfiguration.getString("database");
		PORT = MySQLConfiguration.getInt("port");
		enableMySQL = MySQLConfiguration.getBoolean("enable");
		
		if(instandConnect) {
			connect();
		}
	}
	
	public void connect() {
        if(enableMySQL) {
            try {
                con = DriverManager.getConnection("jdbc:mysql://" + HOSTNAME + ":" + PORT +"/" + DATABASE, USERNAME, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
	}
	
    public boolean isConnected() {
        return con != null;
    }
    
    public void closeConnection(){
        if(enableMySQL) {
            if (isConnected()) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
